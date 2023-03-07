package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Bodega;
import com.example.demo.service.IBodegaService;

@Controller
@RequestMapping("/bodegas")
public class BodegaController {


		
		@Autowired
		private IBodegaService bodegaService;
		
		@GetMapping("/inicio")
		public String paginaNuevaPersona(Bodega bodega) {
			
			//nombre de la vista que quiero que me devuelva al cliente
			return "/vistaNuevaBodega";
		}
		
		@PostMapping("/insertar")
		public String insertarPersona(Bodega bodega) {
			this.bodegaService.agregarBodega(bodega);
			return "guardar";
		}
		
//		@GetMapping("/buscar")
//		public String buscarTodos(Model modelo) {
//			List<Persona> lista= this.iPersonaService.encontrarTodos();
//			modelo.addAttribute("personas", lista);
//			return "vistaListaPersonas";
//		}
//		@DeleteMapping("/borrar/{id}")
//		public String borrarPersona(@PathVariable("id") Integer id) {
//			 this.iPersonaService.borrar(id);
//			
//			return "redirect:/personas/buscar";
//		}
//		
//		@GetMapping("/buscarPorId/{id}")
//		public String buscaPorId(@PathVariable("id") Integer id, Model  modelo) {
//			Persona persona = this.iPersonaService.encontrarPorId(id);
//			modelo.addAttribute("persona", persona);
//			return "vistaPersona";
//			
//		}
//		@PutMapping("/actualizar/{id}")
//		public String actualizarPorId(@PathVariable("id") Integer id,Persona persona) {
//			persona.setId(id);
//			this.iPersonaService.modificar(persona);
//			return "redirect:/personas/buscar";
//		
//		

	
}
