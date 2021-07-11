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
public class ElectronicDevice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Laptop lap =  new Laptop(100);
       Computer cmp = new Computer(200);
        Camera cam = new Camera(100);
        lap.getpower();
        cmp.getpower();
        cam.getpower();
    }
    
}
