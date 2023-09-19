package br.com.bvpconvidados.bvp_convite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bvpconvidados.bvp_convite.model.Convidado;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Long>{



}
