/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cañeria;
import Modelo.Componente;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author David
 */
public class VistaCañeria extends VistaComponente {
    
    private Cañeria caño;
    
    public VistaCañeria(int tipo){
        super();
        caño = new Cañeria();
        insertarImagen(tipo);
        setTipo(tipo);
       
    }
    
    private void insertarImagen(int tipo){
        switch (tipo) {
            case 1:
                setImagen(new ImageIcon("src/Imagenes/Cañerias/017025065054.gif"));
                setIcon(getImagen());                
                setPosx1(17);
                setPosy1(25);
                setPosx2(65);
                setPosy2(54);
                break;
            case 2:
                setImagen(new ImageIcon("src/Imagenes/Cañerias/017025065054.gif"));
                setIcon(getImagen());
                setPosx1(65);
                setPosy1(54);
                setPosx2(17);
                setPosy2(25);
                break;
            case 3:
                this.setImagen(new ImageIcon("src/Imagenes/Cañerias/017053066025.gif"));
                this.setIcon(this.getImagen());
                setPosx1(66);
                setPosy1(25);
                setPosx2(17);
                setPosy2(53);
                break;
            case 4:                
                this.setImagen(new ImageIcon("src/Imagenes/Cañerias/017053066025.gif"));
                this.setIcon(this.getImagen());
                setPosx1(17);
                setPosy1(53);
                setPosx2(66);
                setPosy2(25);
                break;
            case 5:
                 
                this.setImagen(new ImageIcon("src/Imagenes/Cañerias/041012041067.gif"));
                this.setIcon(this.getImagen());
                setPosx1(41);
                setPosy1(67);
                setPosx2(41);
                setPosy2(12);
                break;
                
            case 6:
                this.setImagen(new ImageIcon("src/Imagenes/Cañerias/041012041067.gif"));
                this.setIcon(this.getImagen());
                setPosx1(41);
                setPosy1(12);
                setPosx2(41);
                setPosy2(67);
                break;
                
            default:
                break;
        }
        
    }
    
    
    @Override
    public void escucharClick(){
        addMouseListener(new MouseAdapter() { 
          public void mousePressed(MouseEvent me) { 
           
          } 
        });
    }
    
}
