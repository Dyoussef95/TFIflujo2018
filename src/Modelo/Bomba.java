/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author David
 */
public class Bomba extends Componente{
    private float potencia;
    private float rendimiento;
    private float npsh;
    private float presionImpulsion;

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    public float getNpsh() {
        return npsh;
    }

    public void setNpsh(float npsh) {
        this.npsh = npsh;
    }

    public float getPresionImpulsion() {
        return presionImpulsion;
    }

    public void setPresionImpulsion(float presionImpulsion) {
        this.presionImpulsion = presionImpulsion;
    }
    
    
}
