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
public class Bicicleta {

    private Circulo [] ruedas;
    private Circulo plato; 
    private Triangulo [] marco;

    public Bicicleta(Circulo[] ruedas, Circulo plato, Triangulo[] marco) {
        this.ruedas = ruedas;
        this.plato = plato;
        this.marco = marco;
    }
    
    public double area(){
        Circulo c1= this.ruedas[0];
        Circulo c2= this.ruedas[1];
        Circulo c3= this.plato;
        Triangulo t1=this.marco[0];
        double area= c1.area()+c2.area()+t1.area()+t1.area()+t1.area()+c3.area();
        return area; 
    }

    
    
    
}
