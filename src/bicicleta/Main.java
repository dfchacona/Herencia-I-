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
public class Main {
    public static void main(String[] args) {
            
    Circulo c1= new Circulo(10, "verde");
    Circulo c2= new Circulo(9.8, "naranja");
    Circulo [] ruedas=new Circulo[2];
    ruedas[0]=c1;
    ruedas[1]=c2; 
    Circulo plato= new Circulo(2, "negro");
    Triangulo [] marco= new Triangulo[3];
    Triangulo t1=new Triangulo(3, "gris");
        for (int i = 0; i < 3; i++) {
            marco[i]=t1;
        }
   
    Bicicleta b1= new Bicicleta(ruedas, plato, marco);
        System.out.println(b1.area());
                                                                                                                                                                                  
    }
    
    
}
