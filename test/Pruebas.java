/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controlador.ManejadorVistas;
import Datos.AlmacenVistas;
import Modelo.Cañeria;
import Vista.Ventana;
import Vista.VistaCañeria;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class Pruebas {
    
    public Pruebas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
   @Test
    public void Regla1Test1() {
        //Definicion
        Ventana ventana = new Ventana();
        int cant;        
        
        //Ejecucion
        cant = ventana.getControladorVistas().getAlmacenVistas().cantVistas();
  
        //Comprobacion
        assertEquals(1, cant);
        
    }
    
    
    
    @Test
    public void Regla2Test2(){
        //Definicion
        Ventana ventana = new Ventana();
        ManejadorVistas manejador = ventana.getControladorVistas();
        int cant;
        VistaCañeria caño;
        
        //Ejecucion
        caño = manejador.crearCañeria();        
        cant = manejador.getAlmacenVistas().cantVistas();
  
        //Comprobacion
        assertEquals(2, cant);
    }
    
    @Test
    public void Regla3Test3(){
        //Definicion
        Ventana ventana = new Ventana();
        ManejadorVistas manejador = ventana.getControladorVistas();
        int cant;
        VistaCañeria caño;
        
        //Ejecucion
        caño = manejador.crearCañeria();
        manejador.borrarUltimo();
        cant = manejador.getAlmacenVistas().cantVistas();
  
        //Comprobacion
        assertEquals(1, cant);
    }
    
}
