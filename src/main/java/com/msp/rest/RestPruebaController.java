package com.msp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msp.repo.IAlmacenRepo;
import com.msp.model.Almacen;

@RestController
@RequestMapping("/almacenes")
public class RestPruebaController {
	
	@Autowired
	private IAlmacenRepo repo;
	
	@GetMapping
	public List<Almacen> Listar(){
		return repo.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody Almacen almacen){
		repo.save(almacen);
	}

}
