package com.accenture.academico.model.dao;

import java.util.List;

import com.accenture.academico.model.Aluno;

public interface AlunoDAO {
	
	public void addAluno(Aluno a);

	public List<Aluno> listAlunos();
	
	public void removeAluno(Aluno a);

}
