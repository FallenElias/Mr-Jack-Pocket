package com.eliasdeve.jeu;

import javax.swing.JFrame;

import com.eliasdeve.jeu.Scene;

public class Main {

		public static Scene scene;  //permet d'acceder � cette classe de partout 
		
		public static void main(String[] args) {
			
			
		// Cr�ation de la fenetre de l'app
			
			JFrame fenetre = new JFrame("Mr Jack Pocket");
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fenetre.setSize(1920, 1080);
			fenetre.setLocationRelativeTo(null);
			fenetre.setResizable(false);
			fenetre.setAlwaysOnTop(true);
			
		// Instanciation de l'objet scene
			
			scene = new Scene();
			
			fenetre.setContentPane(scene); // On associe la scene � la fenetre de l'application
			fenetre.setVisible(true);

		}

	
	}


