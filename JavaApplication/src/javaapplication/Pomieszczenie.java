package javaapplication;

/**
 *
 * @author posto
 */
public class Pomieszczenie extends ElementPietra {
   public double szerokosc;
   public double dlugosc;
   public String nazwa;
   
   @Override
   public double PoliczPole()
   {
       return szerokosc * dlugosc;
   }
}
