/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Vista.VistaComponente;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public class AlmacenVistas {
    private ArrayList<VistaComponente> vistas;

    public AlmacenVistas() {
        vistas = new ArrayList<>();
    }
    
    
    
    public void agregarVista(VistaComponente nuevo){
        vistas.add(nuevo);
    }
    
    public VistaComponente obtenerUltimo(){
        return vistas.get(vistas.size()-1);
    }
    
    public void borrarUltimo(){
        vistas.get(vistas.size()-1).setVisible(false);
        vistas.remove(vistas.size()-1);
    }

    public  int cantVistas(){
        return vistas.size();
    }
    
}
