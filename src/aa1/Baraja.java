/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa1;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private final ArrayList<Carta> maso=new ArrayList<>();
    private final ArrayList<Carta> monton=new ArrayList<>();

    public Baraja() {
        rellenar();
    }
    
    public int cartasDisponibles(){
        return(maso.size());
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
    
<<<<<<< HEAD
    public Carta SiguienteCarta(){
    

        if(maso.isEmpty()) {
            System.out.println("Baraja sin cartas");
            return null;
        }
        Carta carta=maso.remove(0);
        monton.add(carta);
        return carta;
    
    }
    

=======
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
>>>>>>> 499c65161713e9733ff8dde65b7803cd101c0230
    public void mostrarbaraja(){
          System.out.println("Cartas en la baraja:");
        for (Carta carta : maso) {
            System.out.println("-"+carta);
}
}
<<<<<<< HEAD

=======
>>>>>>> 499c65161713e9733ff8dde65b7803cd101c0230
}

 


