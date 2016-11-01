package br.org.silva.listatelefonica.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Operadora implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 520899248098094009L;

	@Id
	@SequenceGenerator(name="operadora_id_seq", sequenceName="operadora_id_seq")
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="operadora_id_seq")
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private Integer codigo;
	
	@Column
	private String categoria;
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
