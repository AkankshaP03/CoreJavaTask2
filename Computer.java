/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

public class Computer {
	int power;
	public Computer(int power) {
		this.power=power;
	}
	
	public void getPower(){
		int rsperwatt=25*power;
		System.out.println("Computer usage price: Rs."+rsperwatt);
	}
}
