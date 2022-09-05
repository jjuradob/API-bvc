package com.prueba.operacion.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.operacion.models.OperacionModel;
import com.prueba.operacion.services.OperacionService;

@RestController
@RequestMapping("/operacion")
public class OperacionController {
	
	@Autowired
	OperacionService operacionService;
	
	@CrossOrigin(origins = "http://localhost:8080/operacion/query?plataforma=")
	@GetMapping
	public ArrayList<OperacionModel> obtenerOperaciones(){
		return operacionService.obtenerOperaciones();
	}
	
	@PostMapping
	public OperacionModel guardarOperacion(@RequestBody OperacionModel operacion) {
		return this.operacionService.guardarOperacion(operacion);	
	}
	
	@GetMapping("/query")
	public ArrayList<OperacionModel> agruparOperacionesPorPlataforma(@RequestParam("plataforma") String plataforma){
		return this.operacionService.agruparPorPlataforma(plataforma);
	}
}