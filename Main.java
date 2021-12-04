package com.tp_devoir;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
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
        List nom_eleve = new ArrayList();
        List note_eleve= new ArrayList();
    for (int e=0 ; e<=nbre_eleve-1; e++)
    {
        System.out.print("Entrez le nom de l'eleve ");
        String nom = sc.next();
        nom_eleve.add(nom);
        sc.nextLine();
        System.out.print("Entrez la note  de l'eleve ");
        int note = sc.nextInt();
        note_eleve.add(note);
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
                            System.out.println("| Etudiant Numero "+i+1 +"| Nom ->"+nom_eleve.get(i)+"| Moyenne ->"+ note_eleve.get(i)+"\t\t|");
                            System.out.println("---------------------------------------------------------");
                        }

                break;
                case 2 :
                    max= (int)(note_eleve.get(0));
                    pos_max = 0;
                    int etat =0;
                    for (int i =0 ; i<=nbre_eleve-1 ; i++)
                    {

                       if (max < (int)(note_eleve.get(i)))
                       {
                               max= (int)(note_eleve.get(i));
                               pos_max =i;
                        }


                       nom_first = (String)nom_eleve.get(pos_max);

                    }
                    System.out.println("------------------");
                    System.out.println("|\t" +nom_first +"\t\t |");
                    System.out.println("------------------");



                    break;
                case 3 :
                    min= (int)(note_eleve.get(0));
                    pos_min = 0;
                    int etat_min = -1;
                    for (int i =0 ; i<=nbre_eleve-1 ; i++)
                    {


                        int note2 = (int)(note_eleve.get(i));
                        if (note2 < min)
                        {

                            min= (int)(note_eleve.get(i));
                            pos_min =i;

                        }
                        etat_min +=1;

                        nom_last = (String)nom_eleve.get(pos_min);

                    }
                    System.out.println("------------------");
                    System.out.println("|\t" +nom_last +"\t\t |");
                    System.out.println("------------------");
                    break;
                case 4 :
                       somme =0;
                    for (int i=0; i<nbre_eleve ; i++)
                    {
                        somme += (int)note_eleve.get(i);
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
                        somme += (int)note_eleve.get(i);
                    }
                    moyenne = somme/nbre_eleve;
                    for(int i=0;i<nbre_eleve;i++)
                    {
                        if((int)note_eleve.get(i) > moyenne)
                        {
                            System.out.println("----------------");
                            System.out.println("|\t"+nom_eleve.get(i)+"\t|");
                            System.out.println("----------------");

                        }
                    }
                    break;
                case 6 :
                    somme = 0 ;
                    for (int i=0; i<nbre_eleve ; i++)
                {
                    somme += (int)note_eleve.get(i);
                }
                moyenne = somme/nbre_eleve;
                for(int i=0;i<nbre_eleve;i++)
                {
                    if((int)note_eleve.get(i) < moyenne)
                    {
                        System.out.println("----------------");
                        System.out.println("|\t"+nom_eleve.get(i)+"\t|");
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
