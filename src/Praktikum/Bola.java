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
public class Bola {
    double jariJari;
	public void setjariJari(double jariJari){
		this.jariJari = jariJari;
	}
	public void showDiameter(){
	System.out.println("Besarnya diameter yaitu " + this.jariJari * 2);	
	}
	public void showLuasPermukaan(){
	System.out.println("Luas permukaan bola yaitu " + 4 * Math.PI* this.jariJari * this.jariJari);
        }
	public double showVolume(){
	return ( 4 * Math.PI* this.jariJari * this.jariJari * this.jariJari )/ 3 ;
	}
}