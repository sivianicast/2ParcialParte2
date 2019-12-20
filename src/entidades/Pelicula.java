/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
/**
 *
 * @author siviany
 */
public class Pelicula {
    String id;
    String genero;
    double precio;
    String duracion;
    String director;
    String casa;
    String productor;
    String protagonistas;
    protected static ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    public Pelicula() {
    }
    public Pelicula(String id, String genero, String duracion, String director, String casa, String productor, String protagonistas) {
        this.id = id;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
        this.casa = casa;
        this.productor = productor;
        this.protagonistas = protagonistas;
    }
    public String getCasa() {
        return casa;
    }
    public void setCasa(String casa) {
        this.casa = casa;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getProductor() {
        return productor;
    }
    public void setProductor(String productor) {
        this.productor = productor;
    }
    public String getProtagonistas() {
        return protagonistas;
    }
    public void setProtagonistas(String protagonistas) {
        this.protagonistas = protagonistas;
    }
    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }
    public void setListaPeliculas(Object x) {
        Pelicula.listaPeliculas.add((Pelicula) x);
    }
}
