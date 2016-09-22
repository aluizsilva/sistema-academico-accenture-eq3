package com.accenture.academico.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.model.Aluno;
import com.accenture.academico.model.dao.AlunoDAO;

@ManagedBean(name = "alunoService")
@SessionScoped
@Service
@Transactional(readOnly = true)
public class AlunoServiceImpl implements AlunoService{
	
	private AlunoDAO alunoDAO;

	public void setAlunoDAO(AlunoDAO alunoDAO) {
		this.alunoDAO = alunoDAO;
	}

	@Override
	@Transactional(readOnly = false)
	public void addAluno(Aluno p) {
		alunoDAO.addAluno(p);
	}

	@Override
	public List<Aluno> listAlunos() {
		return alunoDAO.listAlunos();
	}

}
