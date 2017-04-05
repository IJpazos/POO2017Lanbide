package com.ipartek.formacion.ejemplopoo.programa;

public class Producto {
	private int IDProducto;
	private double Precio;
	private String NombreProducto;

	public Producto(int iDProducto, String nombreProducto, double precio) {
		IDProducto = iDProducto;
		Precio = precio;
		NombreProducto = nombreProducto;
	}

	public int getIDProducto() {
		return IDProducto;
	}

	public void setIDProducto(int iDProducto) {
		IDProducto = iDProducto;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public String getNombreProducto() {
		return NombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}

	@Override
	public String toString() {
		return "\nID:" + IDProducto + " , " + NombreProducto + " , " + Precio;
	}

}
