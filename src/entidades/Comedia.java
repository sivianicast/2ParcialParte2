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
public class Comedia extends Pelicula {
    public Comedia() {
    }
    public Comedia(String id, String genero, String duracion, String director, String casa, String productor, String protagonistas) {
        super(id, genero, duracion, director, casa, productor, protagonistas);
    }
    @Override
    public String getCasa() {
        return casa;
    }
    @Override
    public void setCasa(String casa) {
        this.casa = casa;
    }
    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String getGenero() {
        return genero;
    }
    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public double getPrecio() {
        return precio;
    }
    @Override
    public void setPrecio(double precio) {
        this.precio = precio+(precio*5/100);
    }
    @Override
    public String getDuracion() {
        return duracion;
    }
    @Override
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    @Override
    public String getDirector() {
        return director;
    }
    @Override
    public void setDirector(String director) {
        this.director = director;
    }
    @Override
    public String getProductor() {
        return productor;
    }
    @Override
    public void setProductor(String productor) {
        this.productor = productor;
    }
    @Override
    public String getProtagonistas() {
        return protagonistas;
    }
    @Override
    public void setProtagonistas(String protagonistas) {
        this.protagonistas = protagonistas;
    }
    @Override
    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }
    @Override
    public void setListaPeliculas(Object x) {
        listaPeliculas.add((Pelicula)x);
    }
}
