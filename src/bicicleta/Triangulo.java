/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

/**
 *
 * @author Estudiante
 */
public class Triangulo extends FiguraGeometrica {
    private double lado; 

    public Triangulo(double lado, String color) {
        super(color);
        this.lado = lado;
    }
    public double area(){
        double area=this.lado*this.lado*Math.sqrt(3)/4;
        return area;
    }
}
