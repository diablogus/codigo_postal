package com.casa.gus.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.casa.gus.model.Relacioncp;

@Repository
public class RelacioncpDaoImpl implements RelacioncpDao{
	
	@Autowired
	RelacioncpJpaSpring relacioncpJpaSpring;

	@Override
	public List<Relacioncp> getListaCP(String cp) {
		return relacioncpJpaSpring.findBydCodigo(cp);
	}

	@Override
	public List<Relacioncp> getListaCPE(String estado) {
		return relacioncpJpaSpring.findBydEstado(estado);
	}

	@Override
	public List<Relacioncp> getListaCPM(String municipio) {
		return relacioncpJpaSpring.findBydMnpio(municipio);
	}

	@Override
	public List<Relacioncp> getListaCPTA(String asentamiento) {
		return relacioncpJpaSpring.findBydTipoAsenta(asentamiento);
	}

}
