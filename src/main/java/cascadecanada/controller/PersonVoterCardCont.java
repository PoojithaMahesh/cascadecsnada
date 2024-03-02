package cascadecanada.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import cascadecanada.Person;
import cascadecanada.VoterCard;

public class PersonVoterCardCont {
public static void main(String[] args) {
	Person person=new Person();
	person.setId(1);
	person.setName("pooji");
	person.setAddress("India");
	
	VoterCard card=new VoterCard();
	card.setId(101);
	card.setName("Poojitha");
	card.setAge(18);
	
	person.setCard(card);
	
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.merge(person);
	entityTransaction.commit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
