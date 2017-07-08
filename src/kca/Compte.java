package kca;

import java.util.ArrayList;
import java.util.List;

public class Compte {
	
	private int id;
	private Client client;
	private double solde;
	private List<Operation> operations;
	private int nbOperations = 0;
	private static int NB_COMPTE=1;
	
	public Compte(Client client, double soldeInitial){
		id = NB_COMPTE++;
		operations = new ArrayList<Operation>();
		setClient(client);
		setSolde(soldeInitial);
	}

	/**
	 * Affiche les informations sur le compte
	 */
	public void afficheCompte(){
		client.afficheClient();
		System.out.println("---");
		System.out.println(solde + " euros\n");
	}
	
	public void afficherLesOperations(){
		System.out.println("----- Liste des opération du compte numero "+id+" -----");
		for(Operation operation : operations){
			operation.afficherOperation();
		}
		System.out.println("\nSolde : " + solde);
	}
	
	public void crediter(double montant){
		solde += montant;
		operations.add(new Credit(++nbOperations,montant));
	}
	
	public void debiter(double montant){
		solde -= montant;
		operations.add(new Debit(++nbOperations,montant));
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public int getId() {
		return id;
	}

	
}
