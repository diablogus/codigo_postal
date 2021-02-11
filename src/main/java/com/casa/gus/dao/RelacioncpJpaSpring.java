package com.casa.gus.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casa.gus.model.Relacioncp;

public interface RelacioncpJpaSpring extends JpaRepository<Relacioncp,Integer> {
	List<Relacioncp> findBydCodigo(String dCodigo);
	List<Relacioncp> findBydEstado(String dEstado);
	List<Relacioncp> findBydMnpio(String dMnpio);
	List<Relacioncp> findBydTipoAsenta(String dTipoAsenta);
}
