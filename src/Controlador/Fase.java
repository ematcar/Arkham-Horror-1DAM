/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BolsaDelCaos.BolsaDelCaos;
import ClaseMano.uso_descarte_cartas;
import Lugar.Estudio;
import Lugar.Lugar;
import Lugar.Lugares;
import Lugar.Pasillo;
import Lugar.Salita;
import Lugar.Sótano;
import Lugar.Ático;
import Mazo_Plan.MazoPlan;
import Modelo.Cartas.Cartas_Acto.MazoActo;
import Modelo.Cartas.Mazo;
import Modelo.MazoInvestigador;
import Modelo.RolandBanks;

/**
 *
 * @author usuario
 */
public class Fase {
    
    RolandBanks Roland;

    Lugar Estudio = new Estudio();
    Lugar Pasillo = new Pasillo();
    Lugar Salita = new Salita();
    Lugar Sotano = new Sótano();
    Lugar Atico = new Ático();
    Lugares lugares = new Lugares(Estudio, Pasillo, Salita, Sotano, Atico);
    BolsaDelCaos BolsaDelCaos = new BolsaDelCaos();
    MazoActo MazoActo = new MazoActo();
    MazoPlan MazoPlan = new MazoPlan();
    Mazo MazoEncuentro = new Mazo();
    MazoInvestigador MazoInvestigador = new MazoInvestigador();
    uso_descarte_cartas UsoDeCartasInvestigador=new uso_descarte_cartas();
  
    
    
    
    
    
}