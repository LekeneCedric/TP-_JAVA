package fr.com.tp1;

import java.util.Date;

public class Eleve {
	
	public String matricule ; 
	public String nom ; 
	public char genre ;
	public int date_naissance ;
	public int moyenne ; 
	
	public Eleve(String matricule , String nom , char genre , int date,int moyenne)
	{
	  this.matricule = matricule; 
	  this.nom = nom ; 
	  this.date_naissance = date ; 
	  this.genre = genre ; 
	  this.moyenne = moyenne ; 
	}

	public void afficher()
	{
		System.out.println("Nom :"+this.nom+" Matricule :  "+this.matricule+" Moyenne: "+this.moyenne+" Date_naissance: "+this.date_naissance+" Genre :"+this.genre);
		
	}
	public int calculerAge()
	{
	int dateActuelle = new Date().getYear();
	int dateNaissance = this.date_naissance;
	return (dateActuelle - dateNaissance);
	 
	}
	public void bonifier(int bonus)
	{
	 this.moyenne += bonus ; 	
	}
}
