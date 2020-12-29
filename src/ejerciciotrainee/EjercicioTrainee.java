/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciotrainee;

import ejerciciotrainee.modelo.Carro;
import ejerciciotrainee.modelo.CarroCilindraje;
import ejerciciotrainee.modelo.CarroConPuertas;
import ejerciciotrainee.modelo.Registro;

/**
 *
 * @author Usuario
 */
public class EjercicioTrainee {

    static Registro reg;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creacion registro
        reg = new Registro();
        
        //registro carros
        Carro carro1 = new CarroConPuertas(4,"Peugeot","206",200000);
        Carro carro2 = new CarroCilindraje(125,"Honda","Titan",60000);
        Carro carro3 = new CarroConPuertas(5,"Peugeot","208",250000);
        Carro carro4 = new CarroCilindraje(160,"Yamaha","YBR",80500.50);
                
        Carro[] listaAux = new Carro[]{carro1,carro2,carro3,carro4};
        
        for(int i=0; i<listaAux.length;i++){
            reg.registrarCarro(listaAux[i]);
        }
        
        //impresion 
        mostrarImpresion();
        
                
    }
    
    /**
     * metodo que tiene el algoritmo para la imrpesion de los datos
     */
    public static void mostrarImpresion(){
        reg.mostrarLista();
        System.out.println("=============================");
        System.out.println(reg.mostrarMasCaro());
        System.out.println(reg.mostrarMasBarato());
        System.out.println(reg.buscarPorY());
        System.out.println("=============================");
        reg.ordenarPorPrecio();
    }
    
}
