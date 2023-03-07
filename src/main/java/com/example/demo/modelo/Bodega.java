package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="bodega")
public class Bodega {

	
	//bodega se vincula con el producto y debe estar dentro del inventario
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_bod")
	@SequenceGenerator(name = "seq_bod",sequenceName = "seq_bod")
	@Column(name="bod_id")
	private Integer id;
	
	@Column(name="bod_nombre")
	private String nombre;
	
	
	@Column(name="bod_numero")
	private String numero;
	
	@Column(name="bod_direccion")
	private String direccion;
	
	
	@Column(name="bod_telefono")
	private String telefono;

	//una bodega tiene muchos productos 
	//muchos productos tiene una sola bodega

	@OneToMany(mappedBy = "bodegas")
	List<Inventario> inventarioB;
	
	
	//SET y GET
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public List<Inventario> getInventarioB() {
		return inventarioB;
	}


	public void setInventarioB(List<Inventario> inventarioB) {
		this.inventarioB = inventarioB;
	}
	
	
	
}
