/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.AlmacenVistas;
import Vista.VistaCañeria;
import Vista.VistaComponente;
import Vista.VistaCurva;

/**
 *
 * @author David
 */
public class ManejadorVistas {

    private AlmacenVistas almacenVistas;

    public ManejadorVistas() {
        almacenVistas = new AlmacenVistas();
    }

    public AlmacenVistas getAlmacenVistas() {
        return almacenVistas;
    }

    public void setAlmacenVistas(AlmacenVistas almacenVistas) {
        this.almacenVistas = almacenVistas;
    }

    public VistaComponente crearComponente(int boton) {
        switch (boton) {
            case 1:
                return crearCañeria();
            case 2:
                return crearCurva();
            default:
                return null;
        }
    }

    public VistaCañeria crearCañeria() {
        int c, tipoEntrada, x, y;
        VistaComponente anterior = almacenVistas.obtenerUltimo();
        tipoEntrada = anterior.getTipo();
        c = anterior.getCapa();
        VistaCañeria caño = new VistaCañeria(tipoEntrada);
        if (tipoEntrada % 2 == 0) {
            c--;
        } else {
            c++;
        }

        caño.setCapa(c);
        x = caño.calcularX(anterior.getX(), anterior.getPosx2(), caño.getPosx1());
        y = caño.calcularY(anterior.getY(), anterior.getPosy2(), caño.getPosy1());
        caño.setBounds(x, y, 80, 80);
        almacenVistas.agregarVista(caño);

        return caño;
    }

    public VistaCañeria cañoInicial() {
        VistaCañeria caño = new VistaCañeria(1);
        caño.setCapa(0);
        caño.setBounds(0, 0, 80, 80);
        almacenVistas.agregarVista(caño);

        return caño;
    }

    public int devolverCapa() {
        return almacenVistas.obtenerUltimo().getCapa();
    }

    public VistaCurva crearCurva() {
        int c, tipoEntrada, tipoSalida, x, y;
        VistaComponente anterior = almacenVistas.obtenerUltimo();
        tipoEntrada = anterior.getTipo();
        if (tipoEntrada == 1 || tipoEntrada == 2) {
            tipoSalida = 3;
        } else {
            tipoSalida = 1;
        }
        c = anterior.getCapa();
        if (tipoEntrada % 2 == 0) {
            c--;
        } else {
            c++;
        }

        VistaCurva curva = new VistaCurva(tipoEntrada, tipoSalida);
        curva.setCapa(c);
        x = curva.calcularX(anterior.getX(), anterior.getPosx2(), curva.getPosx1());
        y = curva.calcularY(anterior.getY(), anterior.getPosy2(), curva.getPosy1());
        curva.setBounds(x, y, 60, 60);
        almacenVistas.agregarVista(curva);

        return curva;

    }

    public VistaCurva cambiarCurva() {
        int c, tipoEntrada, tipoSalida, x, y;
        VistaComponente anterior = almacenVistas.obtenerUltimo();
        tipoSalida = anterior.getTipo();
        almacenVistas.borrarUltimo();
        anterior = almacenVistas.obtenerUltimo();
        tipoEntrada = anterior.getTipo();
        if (tipoEntrada == 1 || tipoEntrada == 2) {
            if (tipoSalida == 3) {
                tipoSalida = 5;
            } else if (tipoSalida == 4) {
                tipoSalida = 6;
            } else if (tipoSalida == 5) {
                tipoSalida = 4;
            } else if (tipoSalida == 6) {
                tipoSalida = 3;
            }
        } else if (tipoEntrada == 3 || tipoEntrada == 4) {
            if (tipoSalida == 1 || tipoSalida == 5) {
                tipoSalida++;
            } else if (tipoSalida == 2) {
                tipoSalida = 5;
            } else if (tipoSalida == 6) {
                tipoSalida = 1;
            }
        } else if (tipoEntrada == 5 || tipoEntrada == 6) {
            if (tipoSalida <= 3) {
                tipoSalida++;
            } else {
                tipoSalida = 1;
            }
        }
        c = anterior.getCapa();
        if (tipoEntrada % 2 == 0) {
            c--;
        } else {
            c++;
        }

        VistaCurva curva = new VistaCurva(tipoEntrada, tipoSalida);
        curva.setCapa(c);
        x = curva.calcularX(anterior.getX(), anterior.getPosx2(), curva.getPosx1());
        y = curva.calcularY(anterior.getY(), anterior.getPosy2(), curva.getPosy1());
        curva.setBounds(x, y, 60, 60);
        almacenVistas.agregarVista(curva);

        return curva;

    }

    public void borrarUltimo() {
        almacenVistas.borrarUltimo();
    }
}
