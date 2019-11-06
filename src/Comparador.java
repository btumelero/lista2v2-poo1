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
class Comparador {
  Triangulo[] tris;
  
  boolean comparaArea(Forma forma1, Forma forma2) {
    if (forma1.area()>forma2.area()) {
      return true;
    } else {
      return false;
    }
  }
  
  boolean comparaPerimetro(Forma forma1, Forma forma2) {
    if (forma1.perimetro()>forma2.perimetro()) {
      return true;
    } else {
      return false;
    }
  }
  
  Comparador() {
    tris = new Triangulo[10];
  }
}