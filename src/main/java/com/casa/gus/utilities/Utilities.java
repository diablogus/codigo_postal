package com.casa.gus.utilities;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.casa.gus.model.Relacioncp;

@Component
public class Utilities {
	
	private static final Logger log = LoggerFactory.getLogger(Utilities.class);
	
	public void imprimirLista(List<Relacioncp> listaE) {
		for(Relacioncp relacioncp: listaE) {
			log.info(relacioncp.toString());
		}
	}
}
