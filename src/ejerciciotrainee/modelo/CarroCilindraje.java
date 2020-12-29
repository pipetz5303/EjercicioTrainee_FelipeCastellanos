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
public class CarroCilindraje extends Carro {
    //atributos
    private int cilindraje;
    
    //constructor
    public CarroCilindraje(int cilindraje, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cilindraje = cilindraje;
    }
    
    //getters y setters
    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() + " // Cilindrada: "+ cilindraje+"cc // Precio: $" + String.format("%.2f", super.getPrecio());
    }
    
    
}
