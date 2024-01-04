package dev.luispardo;

public class Persona {
  private String nombre;
  private String apellido;
  private int numeroDocumento;
  private int añoNacimiento;
  private String paisNacimiento;
  private char genero;

  public Persona(String nombre, String apellido, int numeroDocumento, int añoNacimiento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.numeroDocumento = numeroDocumento;
    this.añoNacimiento = añoNacimiento;
  }

  public Persona(String nombre, String apellido, int numeroDocumento, int añoNacimiento, String paisNacimiento,
      char genero) {

    this(nombre, apellido, numeroDocumento, añoNacimiento);
    this.paisNacimiento = paisNacimiento;
    this.genero = genero;
  }

  public void imprimir() {
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Apellido: " + this.apellido);
    System.out.println("Número de Documento: " + this.numeroDocumento);
    System.out.println("Año de Nacimiento: " + this.añoNacimiento);

    System.out.println("País de Nacimiento: " + this.paisNacimiento);
    System.out.println("Género: " + this.genero);
  }
}
