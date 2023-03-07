package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Producto;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

	
	@Autowired
	private IProductoService iProductoService;

	@GetMapping("/inicio")
	public String paginaNuevaPersona(Producto producto) {

		// nombre de la vista que quiero que me devuelva al cliente
		return "/vistaNuevaProducto";
	}

	@PostMapping("/insertar")
	public String insertarPersona(Producto producto) {
		this.iProductoService.agregar(producto);
		return "guardar";
	}
}
