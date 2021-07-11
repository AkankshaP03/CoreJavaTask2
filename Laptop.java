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
public class Laptop {
    int power;
    public Laptop(int pw)
    {
        power=pw;
      
        
    }
    public void getpower()
    {
          power-=1;
        System.out.println("Laptop power consumption"+ power);
    }
            
}
