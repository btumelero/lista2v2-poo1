/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introoop;

/**
 *
 * @author bruno.191196
 */
class Circulo extends Forma {
  double raio;
  
  @Override
  double area() {
    return raio*Math.PI;
  }
  
  @Override
  double perimetro() {
    return 2*raio*Math.PI;
  }
  
  double diametro() {
    return 2*raio;
  }
  
  Circulo(double raio, double x, double y) {
    super(x, y);
    this.raio = raio;
  }
}
