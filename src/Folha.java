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
class Folha {
  double altura, largura, alturaFolha=30, larguraFolha=21;
  int numeroRetangulo=0, numeroTriangulo=0, numeroCirculo=0, numeroTotal=0;
  Forma[] listaForma;
  
  void adicionarForma(Forma forma) {
    forma.z=numeroTotal;
    if (forma instanceof Circulo) {
      if (((Circulo) forma).diametro()>larguraFolha || ((Circulo) forma).diametro()>alturaFolha) {
      System.out.println("O círculo não cabe na folha!");
      } else {
        if (forma.x<((Circulo) forma).raio || forma.y<((Circulo) forma).raio) {
          System.out.println("O círculo está fora da folha");
        } else {
          if (((Circulo) forma).raio>larguraFolha-forma.x || ((Circulo) forma).raio>alturaFolha-forma.y) {
            System.out.println("O círculo está fora da folha");
          } else {
            System.out.println("O círculo está dentro da folha");
          }
        }
      }
      listaForma[numeroTotal] = forma;
      numeroCirculo++;
      numeroTotal++;
    }
    if (forma instanceof Triangulo) {
      if (((Triangulo) forma).largura>larguraFolha || ((Triangulo) forma).altura>alturaFolha) {
        System.out.println("O triângulo não cabe na folha!");
      } else {
        if (((Triangulo) forma).largura>larguraFolha-((Triangulo) forma).x || ((Triangulo) forma).altura>((Triangulo) forma).y) {
          System.out.println("O triângulo está fora da folha");
        } else {
          System.out.println("O triângulo está dentro da folha");
        }
      }
      listaForma[numeroTotal] = forma;
      numeroTriangulo++;
      numeroTotal++;
    }
    if (forma instanceof Retangulo) {
      if (((Retangulo) forma).largura>larguraFolha || ((Retangulo) forma).altura>alturaFolha) {
        System.out.println("O retângulo não cabe na folha!");
      } else {
        if (((Retangulo) forma).largura>larguraFolha-((Retangulo) forma).x || ((Retangulo) forma).altura>((Retangulo) forma).y) {
          System.out.println("O retângulo está fora da folha");
        } else {
          System.out.println("O retângulo está dentro da folha");
        }
      }
      listaForma[numeroTotal] = forma;
      numeroRetangulo++;
      numeroTotal++;
    }
  }
  
  void listarFormas() {
    System.out.println("Há " + numeroTotal + " de formas nesta lista, sendo que:");
    System.out.print(numeroRetangulo + " são retângulos, ");
    System.out.print(numeroTriangulo + " triângulos e ");
    System.out.println(numeroCirculo + " círculos");
    
    for (int i=0; i<numeroTotal; i++) {
      if (listaForma[i] instanceof Retangulo) {
        System.out.println("\nInformações do retângulo " + i + ":");
        System.out.println("Largura: " + ((Retangulo) listaForma[i]).largura + "\nAltura: " + ((Retangulo) listaForma[i]).altura);
        System.out.println("Perímetro: " + ((Retangulo) listaForma[i]).perimetro() + "\nÁrea: " + ((Retangulo) listaForma[i]).area() + "\nPosição na folha: " + ((Retangulo) listaForma[i]).z);
      }
    }
    for (int i=0; i<numeroTotal; i++) {
      if (listaForma[i] instanceof Triangulo) {
        System.out.println("\nInformações do triângulo " + i + ":");
        System.out.println("Largura: " + ((Triangulo) listaForma[i]).largura + "\nAltura: " + ((Triangulo) listaForma[i]).altura + "\nHipotenusa: " + ((Triangulo) listaForma[i]).hipotenusa());
        System.out.println("Perímetro: " + ((Triangulo) listaForma[i]).perimetro() + "\nÁrea: " + ((Triangulo) listaForma[i]).area() + "\nPosição na folha: " + ((Triangulo) listaForma[i]).z);
      }
    }
    for (int i=0; i<numeroTotal; i++) {
      if (listaForma[i] instanceof Circulo) {
        System.out.println("\nInformações do círculo " + i + ":");
        System.out.println("Diâmetro: " + ((Circulo) listaForma[i]).diametro() + "\nRaio: " + ((Circulo) listaForma[i]).raio);
        System.out.println("Comprimento: " + ((Circulo) listaForma[i]).perimetro() + "\nÁrea: " + ((Circulo) listaForma[i]).area() + "\nPosição na folha: " + ((Circulo) listaForma[i]).z);
      }
    }
  }
  
  void listarOrdenado() {
    System.out.println("Há " + numeroTotal + " de formas nesta lista, sendo que:");
    System.out.print(numeroRetangulo + " são retângulos, ");
    System.out.print(numeroTriangulo + " triângulos e ");
    System.out.println(numeroCirculo + " círculos");
    for (int a=0; a<numeroTotal; a++){
      for (int b=0; b<numeroRetangulo; b++) {
        if (a==listaForma[b].z) {
          System.out.println("\nInformações do retângulo " + b + ":");
          System.out.println("Largura: " + ((Retangulo) listaForma[b]).largura + "\nAltura: " + ((Retangulo) listaForma[b]).altura);
          System.out.println("Perímetro: " + ((Retangulo) listaForma[b]).perimetro() + "\nÁrea: " + ((Retangulo) listaForma[b]).area() + "\nPosição na folha: " + ((Retangulo) listaForma[b]).z);
        }
      }
      for (int b=0; b<numeroTriangulo; b++) {
        if (a==listaForma[b].z) {
          System.out.println("\nInformações do triângulo " + b + ":");
          System.out.println("Largura: " + ((Triangulo) listaForma[b]).largura + "\nAltura: " + ((Triangulo) listaForma[b]).altura + "\nHipotenusa: " + ((Triangulo) listaForma[b]).hipotenusa());
          System.out.println("Perímetro: " + ((Triangulo) listaForma[b]).perimetro() + "\nÁrea: " + ((Triangulo) listaForma[b]).area() + "\nPosição na folha: " + ((Triangulo) listaForma[b]).z);
        }
      }
      for (int b=0; b<numeroCirculo; b++) {
        if (a==listaForma[b].z) {
          System.out.println("\nInformações do círculo " + b + ":");
          System.out.println("Diâmetro: " + ((Circulo) listaForma[b]).diametro() + "\nRaio: " + ((Circulo) listaForma[b]).raio);
          System.out.println("Comprimento: " + ((Circulo) listaForma[b]).perimetro() + "\nÁrea: " + ((Circulo) listaForma[b]).area() + "\nPosição na folha: " + ((Circulo) listaForma[b]).z);
        }
      }
    }
  }
  
  Folha() {
    listaForma = new Forma[10];
  }
}
