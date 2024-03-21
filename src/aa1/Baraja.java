/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa1;

import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> maso;
    private int cartasEnBaraja;

    public Baraja() {
        rellenar();
        cartasEnBaraja=40;
    }
        
        
    
    private void rellenar(){
        String[] palos={"Espada","Basto","Oro","Copa"};
        for (String palo : palos) {
            for (int i = 0; i < 12; i++) {
                if(i!=8 && i!=9){
                    maso.add(new Carta(i,palo));                    

                }
            }
        }
    }
    
    
     public void barajar(){         
         Collections.shuffle(maso);
     }  
    
    
    
}

 


