package model;

import java.util.ArrayList;

public class Pedido {
	
	private int mesa;
	private double total;
	private boolean estado;
	private ArrayList<Plato> platos;
	
	public Pedido() {
		
	}
	
	public Pedido(int mesa, double total, boolean estado,ArrayList<Plato> platos) {
		this.mesa = mesa;
		this.total = total;
		this.estado = estado;
		this.platos = platos;
	}
	
	public int getMesa() {
		return mesa;
	}
	
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public ArrayList<Plato> getPedidos() {
		return platos;
	}
	
	public void setPedidos(ArrayList<Plato> platos) {
		this.platos = platos;
	}
}
