/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.ManejadorVistas;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

    private JButton cañeria, codo, borrar;
    private JButton girarCodo,volverCodo,boton;   
    private JPanel panel2,panel3,panel0;
    private JLayeredPane panel1;
    private ManejadorVistas controladorVistas = new ManejadorVistas();
    
    
    
//-- LE AGREGAMOS TODO A LA VENTANA MEDIANTE EL CONSTRUCTOR

    public Ventana() {
//-- CONFIGURAMOS LA VENTANA
        
        super("FLUJO 2018"); //-- LE PONEMOS UN TITULO
        setSize(1200, 700); //-- LE DAMOS UN TAMAÑO A LA VENTANA
        BorderLayout dist = new BorderLayout();
        setLayout(dist);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //-- HACEMOS QUE LA VENTANA SE CIERRE POR DEFAULT
        iniciarComponentes();
        
    }

    public ManejadorVistas getControladorVistas() {
        return controladorVistas;
    }

    public void setControladorVistas(ManejadorVistas controladorVistas) {
        this.controladorVistas = controladorVistas;
    }
    
    
    
    private void iniciarComponentes(){ 
        iniciarBotones();
        iniciarPaneles();
        insertarTanque();
        

    }
       
    public void insertarTanque(){        
        panel1.add(controladorVistas.cañoInicial(),new Integer(controladorVistas.devolverCapa()));       
    }
    
    private void iniciarPaneles(){       
        panel1 = new JLayeredPane();
        panel1.setOpaque(true);
        panel1.setBackground(Color.WHITE);          
        
        panel2 = new JPanel();
        GridLayout distPanel2 = new GridLayout(3, 1);
        panel2.setPreferredSize(new Dimension(200, WIDTH));
        panel2.setLayout(distPanel2);
        panel2.setBackground(Color.DARK_GRAY);   
        panel2.add(cañeria);
        panel2.add(codo);
        panel2.add(borrar);

        
        panel3 = new JPanel();
        panel3.setBackground(Color.LIGHT_GRAY);
        panel3.add(girarCodo);
        panel3.add(volverCodo);

        
        panel0 = new JPanel();
        CardLayout distPanel0 = new CardLayout();
        panel0.setLayout(distPanel0);
        panel0.add(panel2);
        panel0.add(panel3);
        
     
        add(panel1,BorderLayout.CENTER);
        add(panel0,BorderLayout.WEST);
      
        
    } 
    
    private void iniciarBotones(){
        
//--Intancio boton cañeria
        cañeria = new JButton("CAÑERIA");
        cañeria.setBounds(100, 20,200, 20);
        
        cañeria.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionarCañeria();                
            }
        });
//--Intancio boton codo
        codo = new JButton(" CODOS  ");        
        codo.setBounds(100, 40, 100, 20);
        codo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionarCodo();                
            }
        });
//--Intancio boton borrar
        borrar = new JButton("BORRAR");        
        borrar.setBounds(100, 80, 100, 20);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionarBorrar();               
            }
        });
//--Intancio boton girarCodo
        girarCodo = new JButton("GIRAR CODO");
        girarCodo.setVisible(false);
        girarCodo.setBounds(75, 20, 150, 20);
        girarCodo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionarGirarCodo();             
            }
        });
        
        volverCodo = new JButton("VOLVER");
        volverCodo.setBounds(100, 40, 100, 20);
        volverCodo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionarVolverCodo();           
            }
        });
       
    }
    
    private void accionarCañeria() {         
         panel1.add(controladorVistas.crearComponente(1),new Integer(controladorVistas.devolverCapa()));
    }
    
    private void accionarCodo() {
       panel2.setVisible(false);
       panel3.setVisible(true);
       girarCodo.setVisible(true);
       volverCodo.setVisible(true);
       panel1.add(controladorVistas.crearComponente(2),new Integer(controladorVistas.devolverCapa()));
    }    

    private void accionarBorrar(){
        controladorVistas.borrarUltimo();        
    }
    
    private void accionarGirarCodo() {        
       panel1.add(controladorVistas.cambiarCurva(),new Integer(controladorVistas.devolverCapa()));
    }
    
    private void accionarVolverCodo() {
       girarCodo.setVisible(false);
       volverCodo.setVisible(false);
       panel3.setVisible(false);
       panel2.setVisible(true);
    }    

//-- HACEMOS NUESTRO METODO MAIN
    public static void main(String[] ARGS) {

//-- HACEMOS QUE SE INICIALIZE NUESTRA VENTANA JFRAME
        Ventana miVentana = new Ventana();
//miInterfaz.pack();
//-- HACEMOS QUE NUESTRA VENTANA SE VISIBLE
        miVentana.setVisible(true);
    }

}