/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacontrolversiones;

/**
 *
 * @author USUARIO
 */
public class PruebaControlVersiones {
    
    //Realizamos un cambio en nuestro programa

    public static void main(String[] args) {

        int numero;
        int j = 0;

        for (int i = 0; i < 100; i++) {

            numero = (int) (Math.random() * 6) + 1;

            if (numero == 6) {
                j++;
            }
        }
        System.out.println("El nº6 ha aparecido  " + j + " veces");

    }

}
