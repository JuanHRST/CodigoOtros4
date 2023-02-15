package mx.generation;

import java.util.Scanner; //Scanner no importado
//Es un código de simulación del clásico juego piedra, papel o tijera.
public class PPT {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Se agrego system.in
		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();
    
		System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Se corrigio de jugador 1 a jugador 2
		Scanner s2 = new Scanner(System.in); //Se agrego system.in
		String j2 = s.nextLine();
		
		 if (j1.contentEquals(j2)) { //Se cambia "==" para compara el contenido, no la referencia
		      System.out.println("Empate");
		    } else {
		      int g = 2;
		      switch(j1) {
		        case "piedra":
		          if (j2.equals("tijeras")) { //Comparamos con "equals"
		            g = 1;
		          }
		          break; //Falta el break
		        case "papel":
		          if (j2.equals("piedra")) { //Comparamos con "equals"
		            g = 1;
		          } //No tenía cerrada la llave
		          break; //Falta el break
		        case "tijeras": //Agregar una "s"
		          if (j2.equals("papel")) {
		            g = 1;
		          }
		          break;
		        default:
		        	
		      }
      System.out.println("Gana el jugador " + g);
    }
  
}} //Se agrego un "}" para cerrar
//Había un par de llaves fuera de lugar
