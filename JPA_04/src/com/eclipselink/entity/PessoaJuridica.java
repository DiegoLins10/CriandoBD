package com.eclipselink.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "PJ")
public class PessoaJuridica extends Cliente {
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	private String cnpj;
	private String razaoSocial;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(int idCliente, String nome, String endereco, String telefone, String email,
			String inscricaoEstadual, String inscricaoMunicipal, String cnpj, String razaoSocial) {
		super(idCliente, nome, endereco, telefone, email);
		this.inscricaoEstadual = inscricaoEstadual;
		this.inscricaoMunicipal = inscricaoMunicipal;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Override
	public String toString() {
		return "Pessoa Jurídica [inscrição Estadual=" + inscricaoEstadual + ", Inscrição Municipal="
				+ inscricaoMunicipal + ", CNPJ=" + cnpj + ", Razão Social=" + razaoSocial + "]";
	}

}
