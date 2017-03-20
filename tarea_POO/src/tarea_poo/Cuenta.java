package tarea_poo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOAQUIN
 */
public class Cuenta {
    static long numeroCuenta=100001;
    private long dni;
    private double saldoActual;
    private double interesAnual;

    public Cuenta() {
        numeroCuenta+=1;
        this.dni = 0;
        this.saldoActual = 0;
        this.interesAnual = 0;
        
    }

    public Cuenta(long dni, double saldoActual, double interesAnual) {
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
        numeroCuenta+=1;
    }
    
    public void imprimirCuenta(){
        System.out.println (numeroCuenta);
    }
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(float interesAnual) {
        this.interesAnual = interesAnual;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void actualizarSaldo(){
        this.saldoActual+=(saldoActual*interesAnual)/365;
    }
    public void ingresar(double cantidad){
        saldoActual+=cantidad;
    }
    public void retirar(double cantidad)
    {
        if(cantidad <= saldoActual)
        {
            saldoActual-=cantidad;
        }
    }
    public String datosCuenta(){
        return "Número de Cuenta: "+numeroCuenta+"DNI:"+dni+"Saldo Actual:"
                +saldoActual+"Interes Anual"+interesAnual;
    }

    
    
}
