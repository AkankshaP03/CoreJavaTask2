/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

public class Laptop {
	int power;
	public Laptop(int power) {
		this.power=power;
	}
	
	public void getPower(){
		int rsperwatt=15*power;
		System.out.println("Laptop usage price: Rs."+rsperwatt);
	}
}
