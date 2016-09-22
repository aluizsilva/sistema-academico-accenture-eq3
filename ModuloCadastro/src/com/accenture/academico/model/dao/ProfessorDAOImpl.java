package com.accenture.academico.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Professor;

public class ProfessorDAOImpl implements ProfessorDAO {

	private static final Logger logger = LoggerFactory.getLogger(ProfessorDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addProfessor(Professor p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Professores saved successfully, Professores Details = " + p);

	}

	@Override
	public List<Professor> listProfessores() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Professor> professoresList = session.createQuery("from Professor").list();
		for (Professor p : professoresList) {
			logger.info("Professores List: " + p);
		}
		return professoresList;
	}

	@Override
	public void removeProfessor(Professor p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(p);
		logger.info("Professor deleted successfully" + p);
	}
	
	
	
}
