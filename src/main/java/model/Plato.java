package model;

public class Plato {
	
	private int id;
	private String plato;
	private String descripcion;
	private String imagen;
	private double precio;
	
	public Plato() {
		
	}
	
	public Plato(int id, String plato, String descripcion, String imagen, double precio) {
		super();
		this.id = id;
		this.plato = plato;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlato() {
		return plato;
	}
	public void setPlato(String plato) {
		this.plato = plato;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}

