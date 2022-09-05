package com.prueba.operacion.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.operacion.models.OperacionModel;
import com.prueba.operacion.repositories.OperacionRepository;

@Service
public class OperacionService {
	
	@Autowired
	OperacionRepository operacionRepository;
	
	public ArrayList<OperacionModel> obtenerOperaciones(){
		return (ArrayList<OperacionModel>) operacionRepository.findAll();
	}
	
	public OperacionModel guardarOperacion(OperacionModel operacion) {
		return operacionRepository.save(operacion);
	}
	
	public ArrayList<OperacionModel> obtenerPorPlataforma(String plataforma){
		return operacionRepository.findByPlataforma(plataforma);
	}
	
	public ArrayList<OperacionModel> agruparPorPlataforma(String plataforma){
		return operacionRepository.groupByPlataforma(plataforma);
	}
	
}