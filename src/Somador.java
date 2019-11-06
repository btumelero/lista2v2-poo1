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
class Somador {
  double area=0;
  
  void adicionarForma(Forma forma) {
    if (forma instanceof Retangulo) {
      area = area + ((Retangulo) forma).area();
    }
    if (forma instanceof Triangulo) {
      area = area + ((Triangulo) forma).area();
    }
    if (forma instanceof Circulo) {
      area = area + ((Circulo) forma).area();
    }
  }
}
