package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Producto;

public interface IProductoService {

	
public void agregar(Producto producto);
	
	public List<Producto> buscarTodos();
}
