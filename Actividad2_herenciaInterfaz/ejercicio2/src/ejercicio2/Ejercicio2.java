/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author robin
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3,4);
        System.out.println(f.imprimirFigura());
        f = new Circulo(3);
        System.out.println(f.imprimirFigura());
    }
    
}
