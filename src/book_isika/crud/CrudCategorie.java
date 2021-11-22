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
	
	public void supprimerCategorie(int idC)
	{
		int compteur = 0;
		int indexCat = 0;
		
		for(Categorie cat : listCategorie)
		{ 
			if(cat.getId() == idC)
			{
				indexCat = compteur;
			}
			compteur++;
		}
		
		
		listCategorie.remove(indexCat);
	}
	
	public void modifierCategorie(int idC, String newName)
	{
		int compteur = 0;
		int indexCat = 0;
		
		for(Categorie cat : listCategorie)
		{ 
			if(cat.getId() == idC)
			{
				indexCat = compteur;
			}
			compteur++;
		}
		
		listCategorie.set(indexCat, new Categorie(idC,newName));

	}

}
