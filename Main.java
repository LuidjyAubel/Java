package fr.lazerto.test;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//c'est un programme créer par Luidjy AUBEL
       //fait le 03/02/2021 pour un reprise du JAVA
	//Le coin des variables
	String Artiste = "Glenn Tipton";
	String Artiste2 = "K.K Downing";
	String Artiste3 = "Richie Faulkner";
	//programme principal
	System.out.println("----------------------------------------------");
	System.out.println("| Bienvenue sur un programme de Luidjy AUBEL |");
	System.out.println("|     Ce programme est développé en JAVA     |");
	System.out.println("----------------------------------------------");
	System.out.println("");
	Scanner sc = new Scanner(System.in);
	System.out.print("Citer un des Guitaristes de Judas Priest ? ");
	String str = sc.nextLine();
	System.out.println("Vous avez dit : " + str);
	if (str.equals(Artiste) || str.equals(Artiste2) || str.equals(Artiste3)) {
	   System.out.print("Bonne réponse !");
	}else {
	  System.out.println("Mauvaise réponse !");
	}
}
}