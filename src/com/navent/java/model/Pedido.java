package com.navent.java.model;

import java.io.Serializable;

public class Pedido implements Serializable {

	private static final long serialVersionUID = -5610806301267780136L;
	
	private int idPedido;
	private String nombre;
	private int monto;
	private int descuento;
	
	public Pedido(Integer id, String nombre, int monto, int desc) {
		this.setIdPedido(id);
		this.setNombre(nombre);
		this.setMonto(monto);
		this.setDescuento(desc);
	}
	
	public Integer getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", nombre=" + nombre + ", monto=" + monto + ", descuento=" + descuento
				+ "]";
	}
	
}
