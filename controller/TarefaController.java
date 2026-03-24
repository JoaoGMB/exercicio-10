
package com.exemplo.tarefa.controller;

import com.exemplo.tarefa.entity.Tarefa;
import com.exemplo.tarefa.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa t) {
        return service.salvar(t);
    }

    @GetMapping
    public List<Tarefa> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Tarefa buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
