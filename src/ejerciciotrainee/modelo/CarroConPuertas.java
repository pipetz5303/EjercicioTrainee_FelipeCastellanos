/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciotrainee.modelo;

/**
 *
 * @author Usuario
 */
public class CarroConPuertas extends Carro{
    //atributos
    private int numPuertas;
    
    //constructor
    public CarroConPuertas(int numPuertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.numPuertas = numPuertas;
    }
    
    //getters y setter
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Puertas: "+ numPuertas+" // Precio: $" + String.format("%.2f", super.getPrecio());
    }
    
    
}
