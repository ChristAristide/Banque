package kca;

public class Compte {
	
	private int id;
	private Client client;
	private double solde;
	private static int NB_COMPTE=1;
	
	public Compte(Client client, double soldeInitial){
		id = NB_COMPTE++;
		setClient(client);
		setSolde(soldeInitial);
	}

	public void afficheCompte(){
		client.afficheClient();
		System.out.println("---");
		System.out.println(solde + " euros\n");
	}
	
	public void crediter(double montant){
		solde += montant;
	}
	
	public void debiter(double montant){
		solde -= montant;
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
