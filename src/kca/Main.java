package kca;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//création d'un client
		Client Kouassi = new Client("Mr", "Kouassi", "Christ", "23/11/1991", "10 rue Morere 75014 Paris", "0634642855");
		Kouassi.afficheClient();
		
		//création d'un compte
		Compte cpte = new Compte(Kouassi, 500);
		cpte.debiter(200);
		
		cpte.afficheCcompte();
	}

}
