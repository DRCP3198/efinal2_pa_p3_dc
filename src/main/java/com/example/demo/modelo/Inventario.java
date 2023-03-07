package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="inventario")
public class Inventario {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_inv")
	@SequenceGenerator(name = "seq_inv",sequenceName = "seq_inv")
	@Column(name="inv_id")
	private Integer id;
	
	@Column(name="inv_nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="inv_id_bod")
	private Bodega bodegas;
	
	
	@ManyToOne
	@JoinColumn(name ="inv_id_prod")
	private Producto productos;
	
}
