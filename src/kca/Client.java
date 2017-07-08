package kca;

/**
 * 
 * @author Kouassi Christ
 *
 */
public class Client {

	private int id;
	private String sexe;
	private String nom;
	private String prenom;
	private String dateNaissance; //gestion des dates à améliorer
	private String adresse;
	private String telephone;
	private static int NB_CLIENT=1;
	
	public Client(String sexe, String nom, String prenom, String dateNaissance, String adresse, String telephone){
		id = NB_CLIENT++;
		setSexe(sexe);
		setNom(nom);
		setPrenom(prenom);
		setDateNaissance(dateNaissance);
		setAdresse(adresse);
		setTelephone(telephone);			
	}

	
	public void afficheClient(){
		System.out.println("N. " + getId() + "\n" 
							+ sexe + " " + nom + " " + prenom + "\n"
							+ dateNaissance + "\n"
							+ adresse + "\n"
							+ telephone + "\n");
	}
	
	public int getId() {
		return id;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
}
