package dev.luispardo.myfirsjavaclass;

import dev.luispardo.Persona;

public class App {
    public static void main(String[] args) {
      
        Persona persona1 = new Persona("Juan", "Perez", 12345678, 1990, "España", 'H');
        Persona persona2 = new Persona("Maria", "Gomez", 98765432, 1985, "Francia", 'M');

     
        System.out.println("Persona 1:");
        persona1.imprimir();

        System.out.println("\nPersona 2:");
        persona2.imprimir();
    }
}

