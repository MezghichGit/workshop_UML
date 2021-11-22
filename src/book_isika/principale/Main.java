package book_isika.principale;

import java.util.*;

import book_isika.crud.*;
import book_isika.modeles.*;
public class Main {

	
	//public static ArrayList<Livre> listLivre;
	
	
	public static void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner id Cat�gorie");
		int id =sc.nextInt();
		
		System.out.println("Donner le nom de la Cat�gorie");
		String nom = sc.next();
		
		Categorie c1 = new Categorie(id,nom);
		
		CrudCategorie crudC = new CrudCategorie();
		crudC.ajoutCategorie(c1);
	}
	public static void display() {
		CrudCategorie crudC = new CrudCategorie();
		crudC.listCategorie();
	}
	public static void supprimer() {}
	public static void modifier() {}
	
	public static void main(String[] args) {
		
		while (true)
		{
		 System.out.println("Ajouter Cat�gorie Cliquer : 'a' ");
		 System.out.println("Afficher Cat�gories Cliquer : 'd' ");
		 System.out.println("Supprimer Cat�gorie Cliquer : 's' ");
		 System.out.println("Modifier Cat�gorie Cliquer : 'm' ");
		 System.out.println("Quitter Cliquer : 'q' ");
		 
		 System.out.println("Taper votre choix !");
		 
		 Scanner sc = new Scanner(System.in);
		 int op = sc.next().charAt(0);
		 
		 switch(op){
				case 'a' : add(); break;
				case 'd' : display(); break;
				case 'q' : System.exit(-1); break;
				
		}
		}
		

	
	}

	

}
