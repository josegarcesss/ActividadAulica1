/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa1;

public class Baraja {
    private Carta maso[];
    private int cartasEnBaraja;

    public Baraja() {
        maso= new Carta[40];
        rellenar();
        cartasEnBaraja=40;
    }
        
        
    
    private void rellenar(){
        String[] palos={"Espada","Basto","Oro","Copa"};
        int cantCarta=0;
        for (String palo : palos) {
            for (int i = 0; i < 12; i++) {
                if(i!=8 && i!=9){
                    maso[cantCarta].setPalo(palo);
                    maso[cantCarta].setNumero(i);                    
                    cantCarta++;
                }
            }
        }
    }
}
