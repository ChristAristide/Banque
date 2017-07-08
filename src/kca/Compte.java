package kca;

public class Compte {
	
	private int id;
	private Client client;
	private double solde;
	private static int NB_COMPTE=1;
	
	public Compte(Client client, double solde){
		id = NB_COMPTE++;
		setClient(client);
		setSolde(solde);
	}

	public void afficheCcompte(){
		client.afficheClient();
		System.out.println("---");
		System.out.println(solde + " euros");
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
