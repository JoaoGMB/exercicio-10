
package com.exemplo.tarefa.service;

import com.exemplo.tarefa.entity.Tarefa;
import com.exemplo.tarefa.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public Tarefa salvar(Tarefa t) {
        return repository.save(t);
    }

    public List<Tarefa> listarTodos() {
        return repository.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
