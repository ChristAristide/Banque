package kca;

import java.util.Date;

public abstract class Operation {
	
	private int id;
	private String type;
	private Date dateOperation;
	private double montant;
	
	public Operation(int id, String type, double montant){
		this.id = id;
		dateOperation = new Date();
		setType(type);
		setMontant(montant);
	}
	
	public void afficherOperation(){
		System.out.println("\nN. " + getId() + "\n"
				+ dateOperation + "\n"
				+ type + "\n"
				+ montant + " euros");
	}
	
	public double getMontant() {
		return montant;
	}
	
	public void setMontant(double montant) {
		if(montant>0)
			this.montant = montant;
	}
	
	public int getId() {
		return id;
	}
	
	public Date getDateOperation() {
		return dateOperation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
