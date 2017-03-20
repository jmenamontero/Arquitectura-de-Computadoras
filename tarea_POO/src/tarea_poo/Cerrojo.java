/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_poo;

import static tarea_poo.Cuenta.numeroCuenta;

/**
 *
 * @author JOAQUIN
 */
public class Cerrojo {
    private int combinacion;
    private boolean estado;

    public Cerrojo() {
        this.combinacion = 123;
        this.estado=false;
    }
    
    public Cerrojo(int combinacion) {
        this.combinacion = combinacion;
        this.estado=false;
    }
    
    public void abrirCerrojo(int combinacionActual){
        if(this.combinacion == combinacionActual){
            this.estado=true;
        }
        else{
            System.out.println ("Número de combinación Incorrecta");
        }
    }
    
    public void cambiarComb(int combinacionActual){
        if(combinacionActual == combinacion){
            this.combinacion = combinacionActual;
        }
        else{
            System.out.println ("Número de combinación Incorrecta");
        }
    }
    
}
