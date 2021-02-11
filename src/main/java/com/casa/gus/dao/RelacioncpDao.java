package com.casa.gus.dao;

import java.util.List;

import com.casa.gus.model.Relacioncp;

public interface RelacioncpDao {
	public List<Relacioncp> getListaCP(String cp);
	public List<Relacioncp> getListaCPE(String estado);
	public List<Relacioncp> getListaCPM(String municipio);
	public List<Relacioncp> getListaCPTA(String asentamiento);
}
