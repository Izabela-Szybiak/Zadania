/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author izka_
 */
public class Budynek implements Powierzchnia {
    int wymiar ;
    int pietra_;
    double powierzchniaDzialki;
    
    Pietro[] pietra;  
    Garaz[] garaze; 

    @Override
    public double PoliczPole() {
    double pole = 0;
        for (Pietro p : pietra) {
            pole += p.PoliczPole();
        }
        for ( Garaz g : garaze ) {
            pole += g.PoliczPole();
        }
        
        return pole;
    }
    
    
}
