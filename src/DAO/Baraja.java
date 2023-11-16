
package DAO;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Baraja {
ArrayList<Carta> baraja;

public Baraja(){
    baraja= new ArrayList<>();
}
    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja:" + baraja ;
    }
    public void generarBaraja(){
        int contador=0;
        for (int i=1; i< 5; i++){
            for (int j = 1; j < 14; j++) {
                baraja.add(new Carta(contador++, j, i));
            }
        }
          
        
    }
    
   public void revolver(){
       Carta guardarcarta= null;
       for (int i = 0; i < baraja.size(); i++) {
           int random=(int) (Math.random()*baraja.size());
           guardarcarta = baraja.get(i);
           baraja.set(i, baraja.get(random));
           baraja.set(random, guardarcarta);
           
       }
   }
   
   
}







