package com.latam.alura.tienda.prueba;


import javax.persistence.EntityManager;

import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.utils.JPAUtils;

public class RegistroDeProducto {

	public static void main(String[] args) {
		Categoria celulares = new Categoria("CELULARES");
		
		
			
		
		EntityManager em = JPAUtils.getEntityManager();
			
		
		em.getTransaction().begin();


		em.getTransaction().commit();
		
		celulares.setNombre("LIBROS");
		
		em.flush();
		
		em.clear();
		
		celulares =  em.merge(celulares);
		
		
		celulares.setNombre("SOFTWARE");
		
		em.flush();
		
		em.remove(celulares);
		em.flush();

	
		

	}

}
