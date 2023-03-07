package com.example.demo.modelo;

import java.util.List;
import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {

	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_prod")
	@SequenceGenerator(name = "seq_prod",sequenceName = "seq_prod")
	@Column(name="prod_id")
	private Integer id;
	
	@Column(name ="prod_nombre")
	private String nombre;
	
	@Column(name ="prod_cod_barra")
	private String codBarra;
	
	@Column(name ="prod_categoria")
	private Integer categoria;
	
	@Column(name= "prod_stock")
	private Integer stock;
	
	
	
	@OneToMany(mappedBy ="productos" )
	List<Inventario> inverntarioP;


	//SET Y GET
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


	public String getCodBarra() {
		return codBarra;
	}


	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}


	public Integer getCantidad() {
		return categoria;
	}


	public void setCantidad(Integer cantidad) {
		this.categoria = cantidad;
	}


	public List<Inventario> getInverntarioP() {
		return inverntarioP;
	}


	public void setInverntarioP(List<Inventario> inverntarioP) {
		this.inverntarioP = inverntarioP;
	}
	
	
}
