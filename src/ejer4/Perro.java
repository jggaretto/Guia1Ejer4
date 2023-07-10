/*
 En nuevo proyecto crear una clase de nombre Perro, cuyos atributos son: nombre, raza,
peso y edad. La clase tendrás un constructor que permita inicializar todos sus atributos y
los métodos getter y setter. Además agregaremos un método adicional de nombre
mostrarInfo que visualizará por consola todos los datos de este animal. Por último, desde
el método main de la clase principal del proyecto usted creará un Perro de nombre “Olivia”
de raza “Buldog Francés” que pese 1.2Kg con 1 año de edad; en la línea siguiente invocará
el método mostrarInfo de la instancia creada anteriormente.
 */
package ejer4;


public class Perro {
    private String nombre;
    private String raza;
    private double peso;
    private int edad;

    public Perro() {
        // Constructor vacío
    }

    public Perro(String nombre, String raza, double peso, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Raza: " + this.raza);
        System.out.println("Peso: " + this.peso + "Kg");
        System.out.println("Edad: " + this.edad + " años");
    }
}