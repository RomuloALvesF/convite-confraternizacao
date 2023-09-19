package br.com.bvpconvidados.bvp_convite.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.bvpconvidados.bvp_convite.model.Colaborador;
import br.com.bvpconvidados.bvp_convite.model.Convidado;
import br.com.bvpconvidados.bvp_convite.service.ColaboradorService;

@RestController
public class GreetingsController {
	
	@Autowired
	private ColaboradorService colaboradorService;
	
  
    @PostMapping("/evento")
    @ResponseBody
    public String saveEvento(@RequestBody EventoRequest request) {
        Colaborador colaborador = new Colaborador();
        colaborador.setNome(request.getColaborador());

        colaboradorService.saveColaborador(colaborador);

        for (Convidado convidadoRequest : request.getConvidados()) {
            Convidado convidado = new Convidado();
            convidado.setNome(convidadoRequest.getNome());
            convidado.setFaixaEtaria(convidadoRequest.getFaixaEtaria());
            convidado.setColaborador(colaborador); 

            colaboradorService.saveConvidado(convidado);
        }

        return "Dados enviados com sucesso!";
    }

    public static class EventoRequest {
        private String colaborador;
        private List<Convidado> convidados;
        
        
        
		public String getColaborador() {
			return colaborador;
		}
		public void setColaborador(String colaborador) {
			this.colaborador = colaborador;
		}
		public List<Convidado> getConvidados() {
			return convidados;
		}
		public void setConvidados(List<Convidado> convidados) {
			this.convidados = convidados;
		}

              
    }
    
}
