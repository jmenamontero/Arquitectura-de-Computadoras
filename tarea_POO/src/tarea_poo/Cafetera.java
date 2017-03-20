/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_poo;

/**
 *
 * @author JOAQUIN
 */
public class Cafetera {
    public int capacidadMaxima;
    public int cantidadActual;
    
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) {
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        if(cantidadActual > capacidadMaxima)
        {
         this.capacidadMaxima = cantidadActual;   
        }
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;
    }
    
    public int servirTaza(int cantidad){
        if(cantidad > cantidadActual){
            return cantidadActual;
        }
        return cantidad;
    }
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    public void agregarCafe(int cantidad){
        this.cantidadActual+=cantidad;
    }
    
    
}
