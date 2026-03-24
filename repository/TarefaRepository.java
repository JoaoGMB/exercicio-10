
package com.exemplo.tarefa.repository;

import com.exemplo.tarefa.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
