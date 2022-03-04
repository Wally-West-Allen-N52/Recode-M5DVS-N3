package com.curso.recodepro;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//INFORMA QUE ESSA CLASSE TAMBÉM É UMA ENTIDADE.
// JPA ESTABELECERA LIGAÇÃO ENTRE ENTIDADE E TABELANO DB
@Entity							// TRANSFORMA UMA INSTÃNCIA EM UMA SEQUÊNCIA DE BYTE. AJUDA NA COMUNICAÇÃO E TA=RANDFERENCIA DE UMA JVM PARA OUTRA
public class Contato implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
