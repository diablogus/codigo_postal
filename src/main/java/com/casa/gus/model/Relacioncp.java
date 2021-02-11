package com.casa.gus.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="relacioncp")
@NamedQuery(name="Relacioncp.findAll", query="SELECT r FROM Relacioncp r")
public class Relacioncp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_relacioncp")
	private int idRelacioncp;

	@Column(name="c_asenta_cpcons")
	private int cAsentaCpcons;

	@Column(name="c_cp")
	private String cCp;

	@Column(name="c_cve_ciudad")
	private int cCveCiudad;

	@Column(name="c_estad")
	private int cEstad;

	@Column(name="c_mnpio")
	private String cMnpio;

	@Column(name="c_oficina")
	private String cOficina;

	@Column(name="c_tipo_asenta")
	private String cTipoAsenta;

	@Column(name="d_asenta")
	private String dAsenta;

	@Column(name="d_ciudad")
	private String dCiudad;

	@Column(name="d_codigo")
	private String dCodigo;

	@Column(name="d_cp")
	private String dCp;

	@Column(name="d_estado")
	private String dEstado;

	@Column(name="d_mnpio")
	private String dMnpio;

	@Column(name="d_tipo_asenta")
	private String dTipoAsenta;

	@Column(name="d_zona")
	private String dZona;

	public Relacioncp() {
	}

	public int getIdRelacioncp() {
		return this.idRelacioncp;
	}

	public void setIdRelacioncp(int idRelacioncp) {
		this.idRelacioncp = idRelacioncp;
	}

	public int getCAsentaCpcons() {
		return this.cAsentaCpcons;
	}

	public void setCAsentaCpcons(int cAsentaCpcons) {
		this.cAsentaCpcons = cAsentaCpcons;
	}

	public String getCCp() {
		return this.cCp;
	}

	public void setCCp(String cCp) {
		this.cCp = cCp;
	}

	public int getCCveCiudad() {
		return this.cCveCiudad;
	}

	public void setCCveCiudad(int cCveCiudad) {
		this.cCveCiudad = cCveCiudad;
	}

	public int getCEstad() {
		return this.cEstad;
	}

	public void setCEstad(int cEstad) {
		this.cEstad = cEstad;
	}

	public String getCMnpio() {
		return this.cMnpio;
	}

	public void setCMnpio(String cMnpio) {
		this.cMnpio = cMnpio;
	}

	public String getCOficina() {
		return this.cOficina;
	}

	public void setCOficina(String cOficina) {
		this.cOficina = cOficina;
	}

	public String getCTipoAsenta() {
		return this.cTipoAsenta;
	}

	public void setCTipoAsenta(String cTipoAsenta) {
		this.cTipoAsenta = cTipoAsenta;
	}

	public String getDAsenta() {
		return this.dAsenta;
	}

	public void setDAsenta(String dAsenta) {
		this.dAsenta = dAsenta;
	}

	public String getDCiudad() {
		return this.dCiudad;
	}

	public void setDCiudad(String dCiudad) {
		this.dCiudad = dCiudad;
	}

	public String getDCodigo() {
		return this.dCodigo;
	}

	public void setDCodigo(String dCodigo) {
		this.dCodigo = dCodigo;
	}

	public String getDCp() {
		return this.dCp;
	}

	public void setDCp(String dCp) {
		this.dCp = dCp;
	}

	public String getDEstado() {
		return this.dEstado;
	}

	public void setDEstado(String dEstado) {
		this.dEstado = dEstado;
	}

	public String getDMnpio() {
		return this.dMnpio;
	}

	public void setDMnpio(String dMnpio) {
		this.dMnpio = dMnpio;
	}

	public String getDTipoAsenta() {
		return this.dTipoAsenta;
	}

	public void setDTipoAsenta(String dTipoAsenta) {
		this.dTipoAsenta = dTipoAsenta;
	}

	public String getDZona() {
		return this.dZona;
	}

	public void setDZona(String dZona) {
		this.dZona = dZona;
	}

	@Override
	public String toString() {
		return "Relacioncp [idRelacioncp=" + idRelacioncp + ", cAsentaCpcons=" + cAsentaCpcons + ", cCp=" + cCp
				+ ", cCveCiudad=" + cCveCiudad + ", cEstad=" + cEstad + ", cMnpio=" + cMnpio + ", cOficina=" + cOficina
				+ ", cTipoAsenta=" + cTipoAsenta + ", dAsenta=" + dAsenta + ", dCiudad=" + dCiudad + ", dCodigo="
				+ dCodigo + ", dCp=" + dCp + ", dEstado=" + dEstado + ", dMnpio=" + dMnpio + ", dTipoAsenta="
				+ dTipoAsenta + ", dZona=" + dZona + "]";
	}

}