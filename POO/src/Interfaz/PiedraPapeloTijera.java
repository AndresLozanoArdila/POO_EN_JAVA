package Interfaz;
import java.util.Random;
import java.util.Scanner;

public class PiedraPapeloTijera implements Juego { 
    
    Scanner lectura=new Scanner(System.in); 
        private int maquina, jugador;
        
        public void iniciar(){
        System.out.print("ingrese el numero segun lo que quiere elegir: 2 tijera, 3 papel, 4 piedra");
       jugador = lectura.nextInt(); 
    }

    public void jugar(){
      Random random=new Random();
      maquina=random.nextInt(3);
    }

    public void finalizar(){
   
    if (maquina==4) {
        if (jugador==4) {
        System.out.print("Nadie fue derrotado ya que la maquina saco piedra: ");
        }
        else if (jugador==3) {
        System.out.print("Usted ha derrotado a la maquina porque saco papel:");
        }
        else {
        System.out.print("La computadora lo ha derrotado ya que usted saco tijera: ");
       } 
    }
    else if (maquina==2 ) {
        if (jugador==4 ) {
        System.out.print("Usted ha derrotado a la maquina porque saco pierda: ");
        }
        else if (jugador==3) {
        System.out.print("La computadora lo ha derrotado ya que usted saco papel: ");
        }
        else {
        System.out.print("Nadie fue derrotado ya que la maquina saco tijera: ");
        }
    } 
    else if (jugador==4) {
        System.out.print("La computadora lo ha derrotado ya que usted saco tijera: ");
        }
        else if (jugador==3) {
        System.out.print("Nadie fue derrotado ya que la maquina saco piedra: ");
        }
        else {
        System.out.print("Usted ha derrotado a la maquina porque saco papel: ");
        }      
    }
}

