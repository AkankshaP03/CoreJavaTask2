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
public class Camera {
     int power;
    public Camera(int pw)
    {
        power=pw;
       
    }
    public void getpower()
    {
         power-=20;
        System.out.println("Camera power consumption"+ power);
    }
}
