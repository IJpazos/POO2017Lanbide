package com.ipartek.formacion.ejemplopoo.programa;

import java.util.ArrayList;

public class Carrito {
	private double PrecioTotal;
	private final double IVA = 21;
	private int NumeroDeArticulos;
	private ArrayList<Producto> productos;

	public Carrito() {
		productos = new ArrayList<Producto>();
		this.PrecioTotal = 0;
		this.NumeroDeArticulos = 0;
	}

	public void add(Producto producto) {
		this.productos.add(producto);
		this.NumeroDeArticulos++;
		this.PrecioTotal += producto.getPrecio();

	}

	public String getPrecioTotal() {
		return "El precio de la compra asciende a "
				+ aDosDecimales(PrecioTotal) + "€+IVA.";
	}

	public String getNumeroDeArticulos() {
		return "Este carrito posee " + NumeroDeArticulos + " articulos.";
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public double getIVA() {
		return IVA;
	}

	public String getIvaSobrePrecioTotal() {
		double resultado;
		resultado = (this.PrecioTotal * this.IVA) / 100;
		return "IVA=" + aDosDecimales(resultado) + "€";

	}

	public String getPrecioTotalConIva() {
		double PrecioConIvaAñadido;
		double IVASobrePrecio = (this.PrecioTotal * this.IVA) / 100;
		PrecioConIvaAñadido = this.PrecioTotal + IVASobrePrecio;
		return "Total a pagar:" + aDosDecimales(PrecioConIvaAñadido)
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
