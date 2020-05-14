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
public class Pietro implements Powierzchnia{

    public int iloscPomieszczen;
    public int numerPietra;
    public ElementPietra[] elementyPietra;
    
    @Override
    public double PoliczPole() {
        double cos = 0;
        for (ElementPietra elementPietra : elementyPietra) {
            cos += elementPietra.PoliczPole();
        }
        
        return cos;
    }
    
}
