/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author usuario
 */
public class Nodo {

    Nodo Llink= null;
    Nodo Rlink= null;
    Nodo Link1;
    String descripcion;
    String horaI;
    String HoraF;
    String pelicula;
    String dispo;
    String id;
    String cantidad;
    String Sala;
    int f; int c; String estado;
    
    

    public Nodo(String horaI, String HoraF, String pelicula) {
        this.horaI = horaI;
        this.HoraF = HoraF;
        this.pelicula = pelicula;
    }

    public Nodo(String horaI, String HoraF, String pelicula, String dispo) {
        this.horaI = horaI;
        this.HoraF = HoraF;
        this.pelicula = pelicula;
        this.dispo = dispo;
    }

    public Nodo() {
    }
    
    public Nodo(String Sala, String pelicula,String horaI,String HoraF, String cantidad, String id){
    this.horaI= horaI;
    this.HoraF= HoraF;
    this.pelicula = pelicula;
    this.id = id;
    this.cantidad = cantidad;
    this.Sala=Sala;
    
    }
    public Nodo(String pelicula, String descripcion){
        this.pelicula=pelicula;
        this.descripcion=descripcion;
    }

    public Nodo(Nodo Llink, Nodo Rlink, String horaI, String HoraF, String pelicula, String dispo) {
        this.Llink = Llink;
        this.Rlink = Rlink;
        this.horaI = horaI;
        this.HoraF = HoraF;
        this.pelicula = pelicula;
        this.dispo = dispo;
    }

    public void agregar(String horaI, String HoraF, String pelicula, String dispo) {
        this.horaI = horaI;
        this.HoraF = HoraF;
        this.pelicula = pelicula;
        this.dispo = dispo;
    }

    public Nodo(int f, int c, String estado) {
        this.f = f;
        this.c = c;
        this.estado = estado;
    }
    
}
