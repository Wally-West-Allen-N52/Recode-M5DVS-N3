package br.com.recode.entities;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable { // PERMITE PUXAR DADOS VINCULADOS DE DIFERENTES CLASSES

	private static final long serialVersionUID = 1L; // RASTREIA A COMPATIBILIDADE DE VERSÕES SERIALIZADAS ADS CLASSES
	
	// CONSTRUTOR VAZIO:
		// DISPARA EVENTOS;
		// REALIZA OPERAÇÕES SOBRE OUTROS OBJS
	private Long id;
	private String name;
	
	// =========================================================
	
	// CONSTRUTOR PPREENNCHIDO:
		//
		//
		//
	public Category() {
		super();
	}
	
	
	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// =========================================================
	
	public Long getIid() {
		return id;
	}
	public void setIid(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// =========================================================
	
	// FERRAMENTE DA JVM:
		// MONTA TABELA HASH
			// ASSOCIAÇÃO DE CHEVES-VALORES
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// MÉTODO PARA COMPARAÇÕOES DE OBJS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}	
	
}
