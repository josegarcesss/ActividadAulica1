/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa1;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private final ArrayList<Carta> maso=new ArrayList<>();


    public Baraja() {
        rellenar();
    }
    
    public ArrayList<Carta> darCartas(){

        
        
    }
    
    
    public int cartasDisponibles(){
        return(maso.size());
    }
        
        
    
    private void rellenar(){
        String[] palos={"Espada","Basto","Oro","Copa"};
        for (String palo : palos) {
            for (int i = 0; i < 12; i++) {
                if(i!=8 && i!=9){
                    maso.add(new Carta(i+1,palo));             
                }
            }
        }
    }
    
    
     public void barajar(){         
         Collections.shuffle(maso);
     }  
    
        public void cartasMonton() {
        if (maso.size() == 40) {
            System.out.println("Aun no se saco ninguna carta");
        } else {
            System.out.println("Cartas en el monton:");
            for (Carta carta : maso) {
                System.out.println("-"+carta);
            }
        }
    }
    public void mostrarbaraja(){
          System.out.println("Cartas en la baraja:");
        for (Carta carta : maso) {
            System.out.println("-"+carta);
}
}
}

 


