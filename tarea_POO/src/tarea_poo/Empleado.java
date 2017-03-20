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
public class Empleado {
    
    public int ID;
    public double salarioBase;
    public double porcentajeRetenciones;
    public double pagoPorHrsEx;
    public int horasExtra;
    public boolean casado;
    public int cantidadHijos;

    public Empleado(){
        this.ID = 0; 
        this.salarioBase = 0;
        this.porcentajeRetenciones = 0;
        this.pagoPorHrsEx = 0;
        this.horasExtra=0;
        this.casado=false;
        this.cantidadHijos=0;
    }
    public Empleado(int ID){
        this.ID = ID; 
        this.salarioBase = 0;
        this.porcentajeRetenciones = 0;
        this.pagoPorHrsEx = 0;
        this.horasExtra=0;
        this.casado=false;
        this.cantidadHijos=0;
    }
    public Empleado(int ID,float salarioBase, double porcentajeRetenciones, double pagoPorHrsEx){
        this.ID = ID; 
        this.salarioBase = salarioBase;
        this.porcentajeRetenciones = porcentajeRetenciones;
        this.pagoPorHrsEx = pagoPorHrsEx;
        this.horasExtra=0;
        this.casado=false;
        this.cantidadHijos=0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getPorcentajeRetenciones() {
        return porcentajeRetenciones;
    }

    public void setPorcentajeRetenciones(float porcentajeRetenciones) {
        this.porcentajeRetenciones = porcentajeRetenciones;
    }

    public double getPagoPorHrsEx() {
        return pagoPorHrsEx;
    }

    public void setPagoPorHrsEx(float pagoPorHrsEx) {
        this.pagoPorHrsEx = pagoPorHrsEx;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void cambiarEstadoCivil() {
        this.casado = true;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }
     
    public double retenciones(){
        if (casado){
            this.porcentajeRetenciones-=2;
        }
        if(cantidadHijos > 0){
            this.porcentajeRetenciones-=cantidadHijos;
        }
        
        return salarioBruto()*porcentajeRetenciones;
        
    }
    
     public double salarioPorHorasExtra(){
        return pagoPorHrsEx*horasExtra;
    }
    public double salarioBruto(){
        return salarioBase + salarioPorHorasExtra();
    }
    public double salarioNeto(){
        return salarioBruto()-retenciones();
    }
    
    public void printAll(){
        System.out.println ("ID Empleado: "+ID);
        System.out.println ("Salario Base: "+salarioBase);
        System.out.println ("Cantidad de Horas Extra laboradas: "+horasExtra);
        System.out.println ("Pago por Horas Extra: "+salarioPorHorasExtra());
        System.out.println ("Salario Bruto: "+salarioBruto());
        System.out.println ("Porcentaje de Retenciones: "+porcentajeRetenciones);
        System.out.println ("Salario Neto: "+salarioNeto());       
    }
    
}
