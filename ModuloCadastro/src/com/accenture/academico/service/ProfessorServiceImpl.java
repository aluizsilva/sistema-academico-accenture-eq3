package com.accenture.academico.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.model.Professor;
import com.accenture.academico.model.dao.ProfessorDAO;

public class ProfessorServiceImpl implements ProfessorDAO{

	private ProfessorDAO professorDAO;

	public void setProfessorDAO(ProfessorDAO professorDAO) {
		this.professorDAO = professorDAO;
	}

	@Override
	@Transactional(readOnly = false)
	public void addProfessor(Professor p) {
		professorDAO.addProfessor(p);
	}

	@Override
	public List<Professor> listProfessores() {
		return professorDAO.listProfessores();
	}

	@Override
	public void removeProfessor(Professor p) {
		// TODO Auto-generated method stub
		
	}

}
