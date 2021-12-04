package fr.com.tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionEtudiant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    boolean continuer = true ;
	    int nbre_eleve=0;
	    int choix =0;
	        int max =0;
	        int min =0;
	        int pos_max =0;
	        int pos_min =0;
	        int moyenne = 0;
	        int somme = 0;
	    System.out.println("TP N*1 LEKENE SOOGOUAK LUC CEDRIC 20V2060");
	    System.out.print("Combien d'eleves voulez vous enregistrer ? ");
	        nbre_eleve = sc.nextInt();
	        String nom_first="";
	        String nom_last="";
	        Eleve [] eleve = new Eleve[nbre_eleve];
	    for (int e=0 ; e<=nbre_eleve-1; e++)
	    {
	        System.out.println("Enregistrement Eleve N-"+e);
	    	System.out.print("Entrez son Nom :");
	        String nom = sc.next();
	        
	        sc.nextLine();
	        System.out.print("Entrez son Matricule : ");
	        String  matricule = sc.next();
	        sc.nextLine();
	        System.out.print("Entrez son Genre : ");
	        char  genre = sc.next().charAt(0);
	        sc.nextLine();
	        System.out.print("Entrez son annee de naissance : ");
	        int  annee = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Entrez sa Moyenne : ");
	        moyenne = sc.nextInt();
	        sc.nextLine();
	        eleve[e] = new Eleve(matricule,nom,genre,annee,moyenne);
	        System.out.println("");
	        
	    }
	        while(continuer)
	        {
	            System.out.println(" ---------------------> Menu <---------------------- \n");
	            System.out.println("1 -> Afficher les informations de tout les eleves ");
	            System.out.println("2 -> Affficher les informations du premier (en moyenne)");
	            System.out.println("3 -> Affficher les informations du dernier eleve (en moyenne) ");
	            System.out.println("4 -> Afficher la moyenne de la classe ");
	            System.out.println("5 -> afficher les eleves avec une note superieur a la moyenne");
	            System.out.println("6 -> afficher les eleves avec une note inferieurs  a la moyenne\n");
	            System.out.println("7 -> exit");
	            choix = sc.nextInt();
	            switch (choix)
	            {
	                case 1 :
	                    for (int i =0 ; i<nbre_eleve ; i++)
	                    {
	                            System.out.println("---------------------------------------------------------");
	                            System.out.print("| Etudiant Numero "+ i+1 +"|");eleve[i].afficher();
;	                            System.out.println("---------------------------------------------------------");
	                        }

	                break;
	                case 2 :
	                    max= (int)(eleve[0].moyenne);
	                    pos_max = 0;
	                    int etat =0;
	                    for (int i =0 ; i<=nbre_eleve-1 ; i++)
	                    {

	                       if (max < (int)(eleve[i].moyenne))
	                       {
	                               max= (int)(eleve[i].moyenne);
	                               pos_max =i;
	                        }


	                       nom_first = eleve[pos_max].nom;

	                    }
	                    System.out.println("------------------");
	                    System.out.println("|\t" +nom_first +"\t\t |");
	                    System.out.println("------------------");



	                    break;
	                case 3 :
	                    min= (int)(eleve[0].moyenne);
	                    pos_min = 0;
	                    int etat_min = -1;
	                    for (int i =0 ; i<=nbre_eleve-1 ; i++)
	                    {


	                        int note2 = (int)(eleve[i].moyenne);
	                        if (note2 < min)
	                        {

	                            min= (int)(eleve[i].moyenne);
	                            pos_min =i;

	                        }
	                        etat_min +=1;

	                        nom_last = eleve[pos_min].nom;

	                    }
	                    System.out.println("------------------");
	                    System.out.println("|\t" +nom_last +"\t\t |");
	                    System.out.println("------------------");
	                    break;
	                case 4 :
	                       somme =0;
	                    for (int i=0; i<nbre_eleve ; i++)
	                    {
	                        somme += eleve[i].moyenne;
	                    }
	                    moyenne = somme/nbre_eleve;
	                    System.out.println("---------------------");
	                    System.out.println("|\tMoyenne : "+moyenne+"\t|");
	                    System.out.println("---------------------");

	                    break;
	                case 5 :
	                    somme =0;
	                    for (int i=0; i<nbre_eleve ; i++)
	                    {
	                        somme += eleve[i].moyenne;
	                    }
	                    moyenne = somme/nbre_eleve;
	                    for(int i=0;i<nbre_eleve;i++)
	                    {
	                        if(eleve[i].moyenne > moyenne)
	                        {
	                            System.out.println("----------------");
	                            System.out.println("|\t"+eleve[i].nom+"\t|");
	                            System.out.println("----------------");

	                        }
	                    }
	                    break;
	                case 6 :
	                    somme = 0 ;
	                    for (int i=0; i<nbre_eleve ; i++)
	                {
	                    somme += eleve[i].moyenne;
	                }
	                moyenne = somme/nbre_eleve;
	                for(int i=0;i<nbre_eleve;i++)
	                {
	                    if(eleve[i].moyenne < moyenne)
	                    {
	                        System.out.println("----------------");
	                        System.out.println("|\t"+eleve[i].nom+"\t|");
	                        System.out.println("----------------");

	                    }
	                }
	                    break;
	                case 7 :
	                    continuer = false;
	                    break;
	            }
	            System.out.println("Merci d'avoir tester le mini programme de LEKENE SOOGOUAK LUC CEDRIC 20V2060");


	        }
	}

}
