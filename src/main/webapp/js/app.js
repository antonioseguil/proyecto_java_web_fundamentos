let app = angular.module("app", []);

app.controller("pedidoController", ['$scope', '$http', function($scope, $http) {

	$scope.view_pedidos = false;
	$scope.pedidoEnviado = localStorage.getItem("pedidoEnviado") ? true : false;
	$scope.titlePedido = localStorage.getItem("pedidoEnviado") ? "Tu pedido - enviado" : "Tu pedido - no enviado";
	$scope.data = [];
	$scope.pedido = JSON.parse(localStorage.getItem("pedido")) || {
		mesa: 0,
		total: 0.0,
		estado: false,
		platos: [

		]
	};
	//	Petición http
	let response = $http({
		method: "GET",
		url: "PlatoController"
	});
	response.then(function(data) {
		$scope.data = data.data;
	});

	//	Metodos
	$scope.addPedido = function(plato) {
		let index = searchIndexPedido(plato);
		if (index < 0) {
			plato.cantidad = 1;
			$scope.pedido.platos.push(plato);
			calcularTotal();
			return true;
		}
		$scope.pedido.platos[index].cantidad += 1;
		calcularTotal();
		return true;
	}

	$scope.sendPedido = function() {
		let data = $scope.pedido;
		$http({
			method: "POST",
			url: "PedidoController",
			data: JSON.stringify(data),
		}).then(function(data) {
			$scope.pedidoEnviado = data.data.estado;
			$scope.titlePedido = "Tu pedido - enviado"
		});

		addLocalStorage();
	}

	$scope.addPlato = function(index) {
		$scope.pedido.platos[index].cantidad += 1;
		calcularTotal();
	}

	$scope.decreasePlato = function(index) {
		let cantidad = $scope.pedido.platos[index].cantidad;
		if (cantidad == 0) return false;
		$scope.pedido.platos[index].cantidad -= 1;
		calcularTotal();
	}

	function searchIndexPedido(obj) {
		let index = $scope.pedido.platos.findIndex(plato => plato.id == obj.id);
		return index;
	}

	function calcularTotal() {
		$scope.pedido.total = 0;
		$scope.pedido.platos.forEach(function(plato) {
			$scope.pedido.total += plato.cantidad * parseFloat(plato.precio);
		})
	}

	function addLocalStorage() {
		localStorage.setItem("pedido", JSON.stringify($scope.pedido));
		localStorage.setItem("pedidoEnviado", true);
	}

	$scope.clearLocalStorage = function() {
		$scope.pedido = {
			mesa: 0,
			total: 0.0,
			estado: false,
			platos: []
		};
		$scope.pedidoEnviado = false;
		$scope.titlePedido = "Tu pedido - no enviado";
		localStorage.clear();
	}
}]);

app.controller("trabajadorController", ['$scope', '$http', function($scope, $http) {

	$scope.pedidos = [];

	let response = $http({
		method: "GET",
		url: "PedidoController"
	});

	response.then(function(data) {
		$scope.pedidos = data.data;
		console.log($scope.pedidos);
	});

	$scope.terminatePedido = function(index) {
		$scope.pedidos[index].estado = !$scope.pedidos[index].estado;
	}

	$scope.deletePedido = function(index) {
		$http({
			method: "DELETE",
			url: "PedidoController",
			data: `{"id":${index}}`,
		}).then(function(data) {
			$scope.pedidos.splice(index,1);
		});
	}
}]);




