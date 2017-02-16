package controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.CodeEpargneCredit;
import utils.Utils;

public class DigitController {
	
	public static void main(String[] args) {
		DigitController digitController = new DigitController();
		digitController.insertCodeEpargne();
	}
	
	private void insertCodeEpargne() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DigitJPA");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT c FROM CodeEpargneCredit c ORDER BY c.id DESC");
		List<CodeEpargneCredit> list = query.setMaxResults(1).getResultList();
		String compteurEpargne = list.get(0).getCompteurepargne();
		Utils counter = new Utils();
		counter.add(Integer.valueOf(compteurEpargne));
		counter.increment(Utils.DIGIT_5);
		// convertir le compteur en String pour le concaténer aux autres valeurs
		String counterString = counter.toString();
		em.getTransaction().begin();
		list.get(0).setCompteurepargne(counterString);
		em.getTransaction().commit();
		
		// code epargne
		String codeEpargne = "1010117" + counterString;
		// Valeur finale code epargne a stocker dans la base
		Long codeEpargneLong = Long.valueOf(codeEpargne.trim());
		System.out.println("Counter value => " +codeEpargneLong+ " with Class => " + codeEpargneLong.getClass());
	
		
	}
}
