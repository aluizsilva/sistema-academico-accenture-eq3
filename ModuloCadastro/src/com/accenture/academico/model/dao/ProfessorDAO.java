package com.accenture.academico.model.dao;

import java.util.List;

import com.accenture.academico.model.Professor;


public interface ProfessorDAO {
	
	public void addProfessor(Professor p);

	public List<Professor> listProfessores();
	
	public void removeProfessor(Professor p);

}
