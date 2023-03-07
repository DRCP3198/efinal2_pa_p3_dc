package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Producto;

public interface IProductoRepo {

	
	public void insertar(Producto producto);
	
	public List<Producto> verTodos();
}
