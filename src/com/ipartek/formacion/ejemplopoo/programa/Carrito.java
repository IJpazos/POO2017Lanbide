package com.ipartek.formacion.ejemplopoo.programa;

import java.util.ArrayList;

public class Carrito {
	private double precioTotal;
	private final double IVA = 21;
	private int numeroDeArticulos;
	private ArrayList<Producto> productos;

	public Carrito() {
		productos = new ArrayList<Producto>();
		this.precioTotal = 0;
		this.numeroDeArticulos = 0;
	}

	public void add(Producto producto) {
		this.productos.add(producto);
		this.numeroDeArticulos++;
		this.precioTotal += producto.getPrecio();

	}

	public String getPrecioTotal() {
		return "El precio de la compra asciende a "
				+ aDosDecimales(precioTotal) + "€+IVA.";
	}

	public String getNumeroDeArticulos() {
		return "Este carrito posee " + numeroDeArticulos + " articulos.";
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public double getIVA() {
		return IVA;
	}

	public String getIvaSobrePrecioTotal() {
		double resultado;
		resultado = (this.precioTotal * this.IVA) / 100;
		return "IVA=" + aDosDecimales(resultado) + "€";

	}

	public String getPrecioTotalConIva() {
		double precioConIvaAñadido;
		double IVASobrePrecio = (this.precioTotal * this.IVA) / 100;
		precioConIvaAñadido = this.precioTotal + IVASobrePrecio;
		return "Total a pagar:" + aDosDecimales(precioConIvaAñadido)
				+ "€ IVA incluido.";
	}

	@Override
	public String toString() {
		return "" + productos;
	}

	public double aDosDecimales(double numero) {
		return (Math.round(numero * 100d) / 100d);
	}

}
