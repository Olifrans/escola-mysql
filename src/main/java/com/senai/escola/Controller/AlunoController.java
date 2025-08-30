package com.senai.escola.Controller;

import com.senai.escola.Models.Aluno;
import com.senai.escola.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/aluno")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> buscarAlunos(){
        return alunoService.buscarTodosAlunos();
    }

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno){
        return alunoService.salvarNovoAluno(aluno);
    }


    @DeleteMapping("/{id}")
    public void excluirAluno(@PathVariable Long id){
        alunoService.deletarAluno(id);
    }


    @GetMapping("/{id}")
    public Aluno buscaAlunoPorId(@PathVariable Long id){
        return alunoService.buscarAlunoId(id);
    }



}
