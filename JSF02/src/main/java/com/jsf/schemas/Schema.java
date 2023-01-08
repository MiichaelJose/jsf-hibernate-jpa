package com.jsf.schemas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entities.User;


public class Schema {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sonda");
		EntityManager em = emf.createEntityManager();

		TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE u.name = :name", User.class);
		query.setParameter("name", "johndoe");
		List<User> users = query.getResultList();

		em.close();
		emf.close();
	}
}
