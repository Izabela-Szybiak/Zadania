/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author Lune
 */
public class Mieszkanie extends ElementPietra {
    
    public String wizytowka;
    public Pomieszczenie[] pomieszczenia;

    @Override
    public double PoliczPole() {
        double cos = 0;
        for (Pomieszczenie pomieszczenia1 : pomieszczenia) {
            cos += pomieszczenia1.PoliczPole();
        }
        
        return cos;
    }
    
}
