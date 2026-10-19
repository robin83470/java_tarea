/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author robin
 */
public class TrianguloRect extends FiguraRecta {
    public TrianguloRect(int alto, int ancho) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(ancho * ancho + alto * alto);
        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimirFigura() {
        return "Se imprime un Triangulo con alto: " + alto + ", ancho: " + ancho +
               ", area: " + String.format("%.2f", calcularArea()) +
               ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}
