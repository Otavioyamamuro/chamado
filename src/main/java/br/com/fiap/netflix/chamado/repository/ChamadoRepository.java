package br.com.fiap.netflix.chamado.repository;

import br.com.fiap.netflix.chamado.entity.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Long> {
}
