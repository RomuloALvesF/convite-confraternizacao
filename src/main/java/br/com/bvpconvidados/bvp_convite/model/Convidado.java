package br.com.bvpconvidados.bvp_convite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "convidados")
public class Convidado {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer faixaEtaria;

    @ManyToOne
    @JoinColumn(name = "colaborador_id")
    private Colaborador colaborador;
    
    

	public Convidado() {
			
	}
	
	

	public Convidado(Long id, String nome, Integer faixaEtaria, Colaborador colaborador) {
		super();
		this.id = id;
		this.nome = nome;
		this.faixaEtaria = faixaEtaria;
		this.colaborador = colaborador;
	}



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

	public Integer getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(Integer faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

 
    

}
