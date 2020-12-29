/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrainee.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Registro implements Comparator<Carro> {

    //atributos array
    ArrayList<Carro> listaCarros;

    //constructor
    public Registro() {
        listaCarros = new ArrayList<>();
    }

    //getter
    public ArrayList<Carro> getListaCarros() {
        return listaCarros;
    }

    /**
     * registra carros,
     *
     * @param car carro dado predeterminado
     */
    public void registrarCarro(Carro car) {
        listaCarros.add(car);
    }

    /**
     * muestra la lista inicial de carros o actual y los imprime directamente
     */
    public void mostrarLista() {
        for (Carro c : listaCarros) {
            System.out.println(c.toString());
        }

    }

    /**
     * Muestra el mas caro comparando precio mediante un cilco for each
     *
     * @return mensaje completo para impresion
     */
    public String mostrarMasCaro() {
        Carro masCaroAux = listaCarros.get(0);
        for (Carro c : listaCarros) {
            if (c.getPrecio() > masCaroAux.getPrecio()) {
                masCaroAux = c;
            }

        }
        return "Vehículo más caro: " + masCaroAux.getMarca() + " " + masCaroAux.getModelo();
    }

    /**
     * Muestra el mas barato comparando precio mediante un cilco for each
     *
     * @return mensaje completo para impresion
     */
    public String mostrarMasBarato() {
        Carro masBaratoAux = listaCarros.get(0);
        for (Carro c : listaCarros) {
            if (c.getPrecio() < masBaratoAux.getPrecio()) {
                masBaratoAux = c;
            }

        }
        return "Vehículo más Barato: " + masBaratoAux.getMarca() + " " + masBaratoAux.getModelo();
    }

    /**
     * Busca el que tiene la letra Y comparando por el atributo de modelo y la letra Y
     *
     * @return mensaje con el modelo marca y precio
     */
    public String buscarPorY() {
        Carro aux = listaCarros.get(0);
        for (Carro c : listaCarros) {
            if (c.getModelo().contains("Y")) {
                aux = c;
            }
        }

        return "Vehículo que contiene en el modelo la letra ‘Y’: " + aux.getMarca() + " " + aux.getModelo() + " $" + String.format("%.2f", aux.getPrecio());
    }

    /**
     * Ordena de mayor a a menor la lista por precio por medio de un compareto
     */ 
    public void ordenarPorPrecio(){
        Collections.sort(listaCarros, new Registro());
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (Carro c : listaCarros) {
            System.out.println(c.getMarca()+" "+c.getModelo());
        }
    }

    @Override
    public int compare(Carro c1, Carro c2) {
        if(c1.getPrecio()> c2.getPrecio()){
            return -1;
        }else if(c1.getPrecio()<c2.getPrecio()){
            return 0;
        }else{
            return 1;
        }
    }
    
    
}
