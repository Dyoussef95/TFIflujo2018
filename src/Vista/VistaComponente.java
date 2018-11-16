/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Componente;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author David
 */
public class VistaComponente extends JLabel {
    private int codigo,posx1,posy1,posx2,posy2,tipo,ancho,alto,capa;
    private ImageIcon imagen;
    
    
    public VistaComponente(){
        escucharClick();
    }    

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public int getPosx1() {
        return posx1;
    }

    public void setPosx1(int posx1) {
        this.posx1 = posx1;
    }

    public int getPosy1() {
        return posy1;
    }

    public void setPosy1(int posy1) {
        this.posy1 = posy1;
    }

    public int getPosx2() {
        return posx2;
    }

    public void setPosx2(int posx2) {
        this.posx2 = posx2;
    }

    public int getPosy2() {
        return posy2;
    }

    public void setPosy2(int posy2) {
        this.posy2 = posy2;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public int calcularX(int xAnterior,int posx2Anterior,int posx1Actual){
       // System.out.println(xAnterior+" "+posx2Anterior+" "+posx1Actual);
        return xAnterior+posx2Anterior-posx1Actual;      
        
    }
    
    public int calcularY(int yAnterior, int posy2Anterior, int posy1Actual){
        
        return yAnterior+posy2Anterior-posy1Actual;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }  

    public int getCapa() {
        return capa;
    }

    public void setCapa(int capa) {
        this.capa = capa;
    }
    
    
    
    @Override
    public String toString() {
        return "Componente{" + "codigo=" + codigo + ", posx1=" + posx1 + '}';
    }

    public void escucharClick(){
        addMouseListener(new MouseAdapter() { 
          public void mousePressed(MouseEvent me) { 
            
          } 
        });
    }
    
    
    
    
    
 
}
