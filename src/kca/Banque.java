package kca;

import java.util.ArrayList;
import java.util.List;

public class Banque {

	private List<Compte> comptes;

	public Banque(){
		comptes = new ArrayList<Compte>();
	}

	/**
	 * Crée un compte client et l'ajoute à la liste des comptes
	 * @param client
	 * @param soldeInitial
	 */
	public void creerCompte(Client client, double soldeInitial){
		Compte compte = new Compte(client, soldeInitial);
		comptes.add(compte);
	}
	
	/**
	 * Ajoute un compte client à la liste des comptes
	 * @param client
	 * @param soldeInitial
	 */
	public void creerCompte(Compte compte){
		comptes.add(compte);
	}

	/**
	 * Affiche la liste de tous les comptes
	 */
	public void afficheLesComptes(){

		for(Compte compte : comptes){
			compte.afficheCompte();
		}
	}

	/**
	 * Recherche un compte dans la liste en fonction de son id
	 * @param id
	 * @return les references du compte sinon null
	 */
	public Compte getCompte(int id){

		//recherche le compte dont l'id est égal au paramètre de la fonction
		for(Compte compte : comptes){ //algorithme à améliorer
			if(compte.getId() == id){
				return compte;
			}
		}

		return null;
	}

	/**
	 * Recherche un compte dans la liste en fonction de son nom
	 * @param nom
	 * @return les references du compte sinon null
	 */
	public Compte rechercherCompte(String nom){

		//recherche le compte dont l'id est égal au paramètre de la fonction
		for(Compte compte : comptes){ //algorithme à améliorer
			if(compte.getClient().getNom().equals(nom)){
				return compte;
			}
		}

		return null;
	}

	/**
	 * Affiche un compte en fonction de son id
	 * @param id
	 */
	public void afficheUnCompte(int id){

		Compte compte = getCompte(id);
		if(compte != null)
			compte.afficheCompte();
		else
			System.out.println("Aucun compte ne correspond à ce id");
	}

	/**
	 * Affiche un compte en fonction du nom du client
	 * @param nom
	 * @return
	 */
	public void afficheUnCompte(String nom){

		Compte compte = rechercherCompte(nom);
		if(compte != null)
			compte.afficheCompte();
		else
			System.out.println("Aucun compte ne correspond à ce nom");
	}

	/**
	 *  Débiter un compte en fonction de son id
	 * @param id
	 * @param montant
	 */
	public void debiterCompte(int id, double montant){

		Compte compte = getCompte(id);
		if(compte != null)
			compte.debiter(montant);
		else
			System.out.println("Aucun compte ne correspond à ce id");
	}

	/**
	 * Créditer un compte en fonction de son id
	 * @param id
	 * @param montant
	 */
	public void crediterCompte(int id, double montant){

		Compte compte = getCompte(id);
		if(compte != null)
			compte.crediter(montant);
		else
			System.out.println("Aucun compte ne correspond à ce id");
	}

	/**
	 * supprimer un compte en fonction de son id
	 * @param id
	 */
	public void supprimerCompte(int id){

		Compte compte = getCompte(id);
		if(compte != null)
			comptes.remove(compte);
		else
			System.out.println("Aucun compte ne correspond à ce id");
	}
	
	/**
	 * Effectuer des virements d’un compte à un autre avec les identifiants des comptes
	 * @param idCompteADebiter
	 * @param idCompteACrediter
	 * @param montant
	 */
	public void virement(int idCompteADebiter, int idCompteACrediter, double montant){
		
		Compte compteADebiter = getCompte(idCompteADebiter);
		Compte compteACrediter = getCompte(idCompteACrediter);
		if(compteADebiter != null && compteACrediter != null){
			compteADebiter.debiter(montant);
			compteACrediter.crediter(montant);
		}
	}


}
