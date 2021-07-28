let app = angular.module("app", []);

app.controller("pedidoController", ['$scope', '$http', function($scope, $http) {

	$scope.view_pedidos = false;
	$scope.pedidoEnviado = false;
	$scope.titlePedido = "Tu pedido - No enviado"
	$scope.data = [];
	$scope.pedido = {
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
			$scope.titlePedido = "Tu pedido - Enviado"
		});
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
}]);