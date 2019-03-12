package Modelo;
import Lugar.Lugar;
import java.util.ArrayList;


/**
 *
 * @author carlos
 */
public class Enemigo extends Personaje {
   
   
   protected boolean cazador;

   public Enemigo(boolean cazador){
       super();
       this.cazador=cazador;
   }
   
   
   public Enemigo (int combate, int vida, int agilidad, int daño, int horror, Lugar lugar, boolean cazador){
      this.combate=combate;
      this.vida=vida;
      this.agilidad=agilidad;
      this.daño=daño;
      this.horror=horror;
      this.lugar=lugar; 
      this.cazador=cazador;
   }
    /**
     * @return the cazador
     */
    public boolean isCazador() {
        return cazador;
    }

    /**
     * @param cazador the cazador to set
     */
    public void setCazador(boolean cazador) {
        this.cazador = cazador;
    }
    
    @Override
    public void moverPersonaje(ArrayList<Lugar> lugares, int posicion, Personaje personaje) {
        Lugar lugar=lugares.get(posicion);
        personaje.setLugar(lugar);
    }
    
    
      public void ataque (ArrayList<Lugar> lugares, int posicion, Investigador investigador, Enemigo enemigo){
            if(investigador.getLugar()==enemigo.getLugar()){
                
}
  
      
      
}
}