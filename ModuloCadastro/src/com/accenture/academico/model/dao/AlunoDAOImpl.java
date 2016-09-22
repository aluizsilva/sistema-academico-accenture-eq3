package com.accenture.academico.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Aluno;

@Repository
public class AlunoDAOImpl implements AlunoDAO {

	private static final Logger logger = LoggerFactory.getLogger(AlunoDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addAluno(Aluno a) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Aluno saved successfully, Aluno Details = " + a);

	}

	@Override
	public List<Aluno> listAlunos() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Aluno> alunosList = session.createQuery("from Aluno").list();
		for (Aluno a : alunosList) {
			logger.info("Aluno List: " + a);
		}
		return alunosList;
	}

	@Override
	public void removeAluno(Aluno a) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(a);
		logger.info("Aluno deleted successfully" + a);
		
		
	}
	
}
