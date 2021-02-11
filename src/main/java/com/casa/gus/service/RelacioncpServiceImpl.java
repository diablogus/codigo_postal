package com.casa.gus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casa.gus.dao.RelacioncpDao;
import com.casa.gus.model.Relacioncp;

@Service
public class RelacioncpServiceImpl implements RelacioncpService{
	
	@Autowired
	RelacioncpDao relacioncpDao;

	@Override
	public List<Relacioncp> getListaCP(String cp) {
		return relacioncpDao.getListaCP(cp);
	}

	@Override
	public List<Relacioncp> getListaCPE(String estado) {
		return relacioncpDao.getListaCPE(estado);
	}

	@Override
	public List<Relacioncp> getListaCPM(String municipio) {
		return relacioncpDao.getListaCPM(municipio);
	}

	@Override
	public List<Relacioncp> getListaCPTA(String asentamiento){
		return relacioncpDao.getListaCPTA(asentamiento);
	}

}
