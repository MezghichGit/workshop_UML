package book_isika.crud;

import java.util.ArrayList;

import book_isika.modeles.Categorie;


public class CrudCategorie {
	//premi�re m�thode : Stockage dans une liste
	
	//deuxi�me m�thode : Stockage dans une BD mysql
	
	public static ArrayList<Categorie> listCategorie = new ArrayList<>();
	public void ajoutCategorie(Categorie c)
	{
		listCategorie.add(c);
		
	}
	
	public void listCategorie()
	{
		System.out.println(listCategorie);
	}

}
