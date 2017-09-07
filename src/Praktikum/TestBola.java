/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Zhabiyan
 */
public class TestBola {
    public static void main(String[] args){
	Bola Bola = new Bola();
	Bola.setjariJari(14);
	Bola.showDiameter ();
	Bola.showLuasPermukaan();
	System.out.println("Volume bola yaitu "+ Bola.showVolume());
	
	Bola.setjariJari(21);
	Bola.showDiameter ();
	Bola.showLuasPermukaan();
	System.out.println("Volume bola yaitu "+ Bola.showVolume());
}
}
