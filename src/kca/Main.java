package kca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Création des clients
		Client Alain = new Client("Mr","DUPONT","Alain","15/2/1960","Paris","0364582542");
		Client Anthony = new Client("Mr","DUBOIS","Anthony","15/2/1968","Paris","0366482542");
		Client Maryse = new Client("Mr","PAUL","Maryse","15/2/1950","Paris","0364583482");
		
		//Affichage des clients
		Alain.afficheClient();
		Anthony.afficheClient();
		Maryse.afficheClient();
		
		//Création des comptes
		Compte cpAlain = new Compte(Alain,1600);
		Compte cpAnthony = new Compte(Anthony,600);
		Compte cpMaryse = new Compte(Maryse,42);
		
		//Affichage des comptes
		cpAlain.afficheCompte();
		cpAnthony.afficheCompte();
		cpMaryse.afficheCompte();
		
		//création d'une banque et ajout des comptes
		Banque societeGenerale = new Banque();
		societeGenerale.creerCompte(cpAlain);
		societeGenerale.creerCompte(cpAnthony);
		societeGenerale.creerCompte(cpMaryse);
		
		//Affichage de la liste des comptes de la banque
		societeGenerale.afficheLesComptes();
		
		//Rechercher et afficher le compte correspondant au nom "dubois"
		societeGenerale.afficheUnCompte("DUBOIS");
		
		//Débiter le compte de Alain DUPONT de 100 euros
		societeGenerale.debiterCompte(1, 100);
		
		//Affichage de la liste des comptes de la banque
		societeGenerale.afficheLesComptes();
		
		//Effectuer un virement de 210,50 euros du compte de Anthony DUBOIS sur celui de Maryse PAUL
		societeGenerale.virement(2, 3, 210.50);
		
		//Affichage de la liste des comptes de la banque
		societeGenerale.afficheLesComptes();
		
		//Effectuer un virement de 500 euros du compte de Maryse PAUL sur celui de Alain DUPONT
		societeGenerale.virement(3, 1, 500);
		
		//Affichage de la liste des comptes de la banque
		societeGenerale.afficheLesComptes();
		
		//Supprimer le compte de Maryse PAUL de la Banque
		societeGenerale.supprimerCompte(3);
		
		//Affichage de la liste des comptes de la banque
		societeGenerale.afficheLesComptes();
				
	}

}
