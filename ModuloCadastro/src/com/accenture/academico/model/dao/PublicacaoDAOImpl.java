package com.accenture.academico.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.accenture.academico.model.Publicacao;


public class PublicacaoDAOImpl implements PublicacaoDAO {

	private static final Logger logger = LoggerFactory.getLogger(PublicacaoDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addPublicacao(Publicacao p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Publicacao saved successfully, Publicacao Details = " + p);

	}

	@Override
	public List<Publicacao> listPublicacoes() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Publicacao> publicacoesList = session.createQuery("from Publicacao").list();
		for (Publicacao p : publicacoesList) {
			logger.info("Publicacao List: " + p);
		}
		return publicacoesList;
	}

	@Override
	public void removePublicacao(Publicacao p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(p);
		logger.info("Publicacao deleted successfully" + p);
		
	}
	
}
