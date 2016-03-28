
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
public class Circulo extends FiguraGeometrica {
    private double radio; 

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double area(){
        
        double area=Math.PI*this.radio*this.radio;
        return area; 
    }
    
}
