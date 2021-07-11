/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;
import java.util.Scanner;


public class ElectronicDevices {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter Power Usage of Camera:");
		int campow=Integer.parseInt(src.nextLine());
		System.out.println("Enter Power Usage of Laptop:");
		int lappow=Integer.parseInt(src.nextLine());
		System.out.println("Enter Power Usage of Computer:");
		int comppow=Integer.parseInt(src.nextLine());
		Camera cam =new Camera(campow);
		Laptop lap =new Laptop(lappow);
		Computer comp =new Computer(comppow);
		cam.getPower();
		lap.getPower();
		comp.getPower();
		
	}

}
