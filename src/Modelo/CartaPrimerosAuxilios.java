package Modelo;

import java.util.Scanner;

/**AUTOR ALEXANDRA**/
public class CartaPrimerosAuxilios extends Carta{
    //new Carta("Primeros auxilios.","Guardián",2,"Apoyo",0,1,0,0, false, "Talento. Ciencia");
    // Usos (3 suministros). Si los Primeros auxilios no tienen suministros, descártalos.
    // Gasta 1 suministro: Cura 1 punto de daño o de horror de un investigador que esté en tu Lugar
    private int suministros=3;
    Investigador investigador;
    RolandBanks roland;
    Scanner sc = new Scanner(System.in);
    
    public CartaPrimerosAuxilios(){
        
    }
    
    public void Accion(){
        while(suministros>0){
            // Prueba de habilidad para voluntad
            investigador.numeroRecursos=investigador.numeroRecursos-2;
            System.out.println("Escribe 1 para curarte un punto de daño o 2 para curarte un punto de horror.");
            int respuesta=sc.nextInt();
            switch(respuesta){
                case 1: 
                    roland.vida=+1;
                    suministros--;
                break;
                case 2:
                    roland.horror=+1;
                    suministros--;
                break;
                
                default:
                    System.out.println("No has escrito un número válido.");
                break;
            }
            
        }

    }

}