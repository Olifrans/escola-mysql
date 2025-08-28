package com.senai.escola.Service;

import com.senai.escola.Interface.AlunoRepository;
import com.senai.escola.Interface.ProfessorRepository;
import com.senai.escola.Models.Aluno;
import com.senai.escola.Models.Professor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public List<Professor> buscarTodosProfessores(){
        return repository.findAll();
    }

    public Professor salvarNovoProfessor(Professor professor){
        return repository.save(professor);
    }

    public Professor buscarProfessorId(Long id){
        return repository.findById(id).orElse(null);
    }


    public void deletarProfessor(Long id){
        repository.deleteById(id);
    }

}
