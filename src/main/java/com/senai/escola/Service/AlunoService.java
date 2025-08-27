package com.senai.escola.Service;

import com.senai.escola.Interface.AlunoRepository;
import com.senai.escola.Models.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }


    public List<Aluno> buscarTodosAlunos(){
        return repository.findAll();
    }

    public Aluno salvarNovoAluno(Aluno aluno){
        return repository.save(aluno);
    }

    public Aluno buscarAlunoId(Long id){
        return repository.findById(id).orElse(null);
    }

    public void deletarAluno(Long id){
        repository.deleteById(id);
    }

}
