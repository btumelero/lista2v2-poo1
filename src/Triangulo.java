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
class Triangulo extends Forma {
  double altura, largura;
  
  double hipotenusa() {
    double hipotenusa;
    hipotenusa = altura*altura+largura*largura;
    hipotenusa = Math.sqrt(hipotenusa);
    return hipotenusa;
  }
  
  @Override
  double perimetro() {
    double hipotenusa;
    hipotenusa = altura*altura+largura*largura;
    hipotenusa = Math.sqrt(hipotenusa);
    return hipotenusa+altura+largura;
  }
  
  @Override
  double area() {
    return altura*largura/2.0;
  }
  
  Triangulo(double altura, double largura, double x, double y) {
    super(x, y);
    this.altura = altura;
    this.largura = largura;
  }
}
