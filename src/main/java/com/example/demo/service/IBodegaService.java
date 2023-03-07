package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bodega;

@Service 
public interface IBodegaService {

	
	public void agregarBodega(Bodega bodega);
	public List<Bodega> encontrarTodos();
	
	
	
}
