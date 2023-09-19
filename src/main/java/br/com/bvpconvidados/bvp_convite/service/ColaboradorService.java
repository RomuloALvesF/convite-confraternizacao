package br.com.bvpconvidados.bvp_convite.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bvpconvidados.bvp_convite.model.Colaborador;
import br.com.bvpconvidados.bvp_convite.model.Convidado;
import br.com.bvpconvidados.bvp_convite.repository.ColaboradorRepository;
import br.com.bvpconvidados.bvp_convite.repository.ConvidadoRepository;

@Service
public class ColaboradorService {

	@Autowired
	private ColaboradorRepository colaboradorRepository;

	@Autowired
	private ConvidadoRepository convidadoRepository;

	public Colaborador saveColaborador(Colaborador colaborador) {
		return colaboradorRepository.save(colaborador);
	}

	public Optional<Colaborador> findColaboradorById(Long id) {
		return colaboradorRepository.findById(id);
	}

	public List<Colaborador> findAllColaboradores() {
		return colaboradorRepository.findAll();
	}

	public Convidado saveConvidado(Convidado convidado) {
		return convidadoRepository.save(convidado);
	}

	public Optional<Convidado> findConvidadoById(Long id) {
		return convidadoRepository.findById(id);
	}

	public List<Convidado> findAllConvidados() {
		return convidadoRepository.findAll();
	}

	public int convertFaixaEtariaToNumber(String faixaEtaria) {
		switch (faixaEtaria) {
		case "ate2":
			return 1;
		case "3a5":
			return 2;
		case "6a12":
			return 3;
		case "13a18":
			return 4;
		case "acima18":
			return 5;
		default:
			throw new IllegalArgumentException("Faixa etária inválida.");
		}
	}

	public String convertNumberToFaixaEtaria(int numero) {
		switch (numero) {
		case 1:
			return "ate2";
		case 2:
			return "3a5";
		case 3:
			return "6a12";
		case 4:
			return "13a18";
		case 5:
			return "acima18";
		default:
			throw new IllegalArgumentException("Número inválido para faixa etária.");
		}
	}

}
