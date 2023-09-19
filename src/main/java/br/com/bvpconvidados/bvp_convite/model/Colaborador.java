package br.com.bvpconvidados.bvp_convite.model;
	
	import javax.persistence.*;
	import java.util.List;

	@Entity
	@Table(name = "colaboradores")
	public class Colaborador {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;

	    @OneToMany(mappedBy = "colaborador", cascade = CascadeType.ALL)
	    private List<Convidado> convidados;
	    
	    

		public Colaborador() {
			
			
		}

		public Colaborador(Long id, String nome, List<Convidado> convidados) {
			super();
			this.id = id;
			this.nome = nome;
			this.convidados = convidados;
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

		public List<Convidado> getConvidados() {
			return convidados;
		}

		public void setConvidados(List<Convidado> convidados) {
			this.convidados = convidados;
		}
	    
	    


}
