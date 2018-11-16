/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.ImageIcon;

/**
 *
 * @author David
 */
public class VistaCurva extends VistaComponente {    
    
    public VistaCurva(int tipo1,int tipo2){
        super();
        insertarImagen(tipo1,tipo2);
    }   
    
    private void insertarImagen(int tipoEntrada,int tipoSalida){
        switch (tipoEntrada) {
            case 1:
                switch (tipoSalida){
                    case 3:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo1/026038027020.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(27);
                        setPosy1(20);
                        setPosx2(26);
                        setPosy2(38);
                        break;
                        
                    case 4:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo1/015027045028.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(15);
                        setPosy1(27);
                        setPosx2(45);
                        setPosy2(28);
                        break;
                    case 5:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo1/037022021030.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(21);
                        setPosy1(30);
                        setPosx2(37);
                        setPosy2(22);
                        break;
                    case 6:                        
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo1/022018037044.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(22);
                        setPosy1(18);
                        setPosx2(37);
                        setPosy2(44);
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (tipoSalida){
                    case 3:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo2/015031045031.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(45);
                        setPosy1(31);
                        setPosx2(15);
                        setPosy2(31);
                        break;
                    case 4:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo2/035039035020.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(35);
                        setPosy1(39);
                        setPosx2(35);
                        setPosy2(20);                        
                        break;
                    case 5:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo2/024015039042.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(39);
                        setPosy1(42);
                        setPosx2(24);
                        setPosy2(15);
                        break;
                    case 6:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo2/039028025035.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(39);
                        setPosy1(28);
                        setPosx2(25);
                        setPosy2(35); 
                        break;                       
                    default:
                        break;
                }
                break;
            case 3:
                switch (tipoSalida){
                    case 1:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo3/035039035020.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(35);
                        setPosy1(20);
                        setPosx2(35);
                        setPosy2(39);                        
                        break;
                    case 2:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo3/015027045028.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(45);
                        setPosy1(28);
                        setPosx2(15);
                        setPosy2(27);
                        break;
                    case 5:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo3/025022040030.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(40);
                        setPosy1(30);
                        setPosx2(25);
                        setPosy2(22);
                        break;
                    case 6:
                        
                        
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo3/039018025043.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(39);
                        setPosy1(18);
                        setPosx2(25);
                        setPosy2(43);
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                switch (tipoSalida){
                    case 1:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo4/015031045031.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(15);
                        setPosy1(31);
                        setPosx2(45);
                        setPosy2(31);
                        break;
                    case 2:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo4/026038027020.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(26);
                        setPosy1(38);
                        setPosx2(27);
                        setPosy2(20);
                        break;
                    case 5:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo4/022041037016.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(22);
                        setPosy1(41);
                        setPosx2(37);
                        setPosy2(16);
                        break;
                    case 6:                        
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo4/022027037035.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(22);
                        setPosy1(27);
                        setPosx2(37);
                        setPosy2(35);
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                switch (tipoSalida){
                    
                    case 1:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo6/039028025035.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(25);
                        setPosy1(35);
                        setPosx2(39);
                        setPosy2(28);
                        break;
                    case 2:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo6/022018037044.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(37);
                        setPosy1(44);
                        setPosx2(22);
                        setPosy2(18);
                        break;
                    case 3:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo6/022027037035.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(37);
                        setPosy1(35);
                        setPosx2(22);
                        setPosy2(27);
                        break;
                    case 4:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo6/039018025043.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(25);
                        setPosy1(43);
                        setPosx2(39);
                        setPosy2(18);
                    default:
                        break;
                }
                break;
            case 6:
                switch (tipoSalida){                    
                    case 1:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo5/024015039042.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(24);
                        setPosy1(15);
                        setPosx2(39);
                        setPosy2(42);
                        break;
                    case 2:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo5/037022021030.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(37);
                        setPosy1(22);
                        setPosx2(21);
                        setPosy2(30);
                        break;
                    case 3:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo5/022041037016.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(37);
                        setPosy1(16);
                        setPosx2(22);
                        setPosy2(41);
                        break;
                    case 4:
                        setImagen(new ImageIcon("src/Imagenes/Curvas/Tipo5/025022040030.gif"));
                        setIcon(getImagen());
                        setTipo(tipoSalida);
                        setPosx1(25);
                        setPosy1(22);
                        setPosx2(40);
                        setPosy2(30);
                    default:
                        break;
                }
                
                break;
            default:
                break;
        }
    }
}
