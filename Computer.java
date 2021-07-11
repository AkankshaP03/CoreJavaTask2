/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

/**
 *
 * @author mukul
 */
public class Computer {
     int power;
    public Computer(int pw)
    {
        power=pw;
        
    }
    public void getpower()
    {
        power-=10;
        System.out.println("Computer power consumption"+ power);
    }
}
