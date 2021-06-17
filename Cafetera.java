package com.mycompany.examenmiercoles;

import java.util.Comparator;

public class Cafetera implements Comparable{
    // Atributos
    private int capacidadMaxima;
    private int cantidadActual;
    
    // Constructores
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }
    
    public Cafetera(int capMaxima) {
        this.capacidadMaxima = capMaxima;
        this.cantidadActual = capMaxima;
    }
    
    public Cafetera(int capMaxima, int cantAct) {
        this.capacidadMaxima = capMaxima;
        if (cantAct > capMaxima) {
            this.cantidadActual = capMaxima;
        } else {
            this.cantidadActual = cantAct;
        }
    }
    
    // Getters y Setters

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
    
    // Métodos
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }
    
    public void servirTaza(int cant) {
        if (cant > this.cantidadActual) {
            this.cantidadActual = 0;
        } else {
            this.cantidadActual -= cant;
        }
    }
    
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(int cant) {
        this.cantidadActual += cant;
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

    @Override
    public int compareTo(Object o) {
        Cafetera c=(Cafetera)o;
        if(this.cantidadActual<c.cantidadActual){
            return -1;
        }else if(this.cantidadActual>c.cantidadActual){
            return +1;
        }else{
            return 0;
        }
    }
}
