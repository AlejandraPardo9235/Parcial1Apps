package com.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehiculo {

	@Id
	private String id;
	private String marca;
	private String placa;
	private String color;
	private String tipo;
	private String modelo;
	private int kilometraje;
	private String hola;
	
	public Vehiculo(String id, String marca, String placa, String color, String tipo, String modelo, int kilometraje, String hola) {
		super();
		this.id = id;
		this.marca = marca;
		this.placa = placa;
		this.color = color;
		this.tipo = tipo;
		this.modelo = modelo;
		this.kilometraje = kilometraje;
		this.hola = hola;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	

	
	
	
	
}
