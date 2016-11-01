package br.org.silva.listatelefonica.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contato implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5608972331926193258L;

	@Id
	@SequenceGenerator(name="contato_id_seq", sequenceName="contato_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="contato_id_seq")
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private Integer telefone;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@OneToOne(cascade=CascadeType.MERGE)
	private Operadora operadora;
	
	public Long getId(){
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

}
