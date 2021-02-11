package com.casa.gus.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.casa.gus.exception.NotFoundException;
import com.casa.gus.model.Relacioncp;
import com.casa.gus.service.RelacioncpService;
import com.casa.gus.utilities.Utilities;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class RelacioncpController {
		
	private static final Logger log = LoggerFactory.getLogger(RelacioncpController.class);

	@Autowired
	RelacioncpService relacioncpService;
	
	@Autowired
	Utilities utilities;
	
	@ApiOperation(value = "Regresa lista de los datos de los códigos postales",response = List.class)
	@GetMapping(value = "/zip-codes/{zip-code}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Relacioncp> getListaCP(@ApiParam(value = "Código postal", required = true) @PathVariable("zip-code") String cp) {
		log.info(new StringBuffer("función getListaCP -> ").append("Código postal:").append(cp).toString());
		List<Relacioncp> lista = relacioncpService.getListaCP(cp);
		if(lista.isEmpty()) {
			throw new NotFoundException("CP: "+ cp);
		}else {
			utilities.imprimirLista(lista);
		}
		return lista;
	}
	
	@ApiOperation(value = "Regresa lista de los datos de los códigos postales por Estado",response = List.class)
	@GetMapping(value ="/estado/{estado}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Relacioncp> getListaCPE(@ApiParam(value = "Estado", required = true) @PathVariable("estado") String estado) {
		log.info(new StringBuffer("función getListaCPE -> ").append("Estado:").append(estado).toString());
		List<Relacioncp> listaE = relacioncpService.getListaCPE(estado);
		if(listaE.isEmpty()) {
			throw new NotFoundException("Estado: "+ estado);
		}else {
			utilities.imprimirLista(listaE);
		}
		return listaE;
	}
	
	@ApiOperation(value = "Regresa lista de los datos de los códigos postales por Municipio",response = List.class)
	@GetMapping(value ="/municipio/{municipio}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Relacioncp> getListaCPM(@ApiParam(value = "Municipio", required = true) @PathVariable("municipio") String municipio) {
		log.info(new StringBuffer("función getListaCPM -> ").append("Municipio:").append(municipio).toString());
		List<Relacioncp> listaM = relacioncpService.getListaCPM(municipio);
		if(listaM.isEmpty()) {
			throw new NotFoundException("Municipio: "+ municipio);
		}else {
			utilities.imprimirLista(listaM);
		}
		return listaM;
	}
	
	@ApiOperation(value = "Regresa lista de los datos de los códigos postales por Asentamiento",response = List.class)
	@GetMapping(value ="/asentamiento/{asentamiento}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Relacioncp> getListaCPTA(@ApiParam(value = "Asentamiento", required = true) @PathVariable("asentamiento") String asentamiento) {
		log.info(new StringBuffer("función getListaCPTA -> ").append("Asentamiento:").append(asentamiento).toString());
		List<Relacioncp> listaTA = relacioncpService.getListaCPTA(asentamiento);
		if(listaTA.isEmpty()) {
			throw new NotFoundException("Asentamiento: "+ asentamiento);
		}else {
			utilities.imprimirLista(listaTA);
		}
		return listaTA;
	}

}
