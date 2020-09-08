/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es su nombre? ");
        String nombre = sc.nextLine();

        System.out.println(nombre);

        System.out.println("ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("¿Cuál es su sexo? (F/M)");
        String sexo = sc.next();

        System.out.println("¿Ingresa tu peso peso? ");
        double peso = sc.nextDouble();

        System.out.println("¿Ingresa tu altura? ");
        double altura = sc.nextDouble();

        persona usuario1 = new persona(nombre, edad, sexo, peso, altura);
        
        persona usuario2 = new persona(usuario1.getNombre(), usuario1.getEdad(), usuario1.getSexo());

        persona usuario3 = new persona();
        usuario3.setNombre(nombre);
        usuario3.setEdad(edad);
        usuario3.setSexo(sexo);
        usuario3.setPeso(peso);
        usuario3.setAltura(altura);

        System.out.println(usuario1.mostrar()) ;
        System.out.println(user1.esMayordeEdad()) ;
        System.out.println(user2.toString()) ;
        System.out.println(user2.esMayordeEdad()) ;
        System.out.println(user3.mostrar()) ;
        System.out.println(user3.esMayordeEdad()) ;
    
    
    }
    
}
