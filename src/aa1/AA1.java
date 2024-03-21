/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package aa1;

import java.util.Scanner;

public class AA1 {
        //@param args the command line arguments
    public static void main(String[] args) {
        Baraja baraja= new Baraja();
        System.out.println("*barajando...");baraja.barajar();
        System.out.println("*Cantidad de cartas restante: "+baraja.cartasDisponibles());
        System.out.println("*mostrando la siguiente carta: "+baraja.SiguienteCarta());
        Scanner scanner=new Scanner(System.in);
        System.out.println("*cuantas cartas desea sacar: ");
        baraja.darCartas(scanner.nextInt());
        
        baraja.cartasMonton();
        baraja.mostrarbaraja();
    }

}
