package austral.prog2.tp3.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class EJ4 {

    public static void main(String[] args) {

        Figure[] figuras = new Figure[4]; // faltaria el ellipse q no lo supe hacer

       figuras[0] = new Rectangle(5 , 5);
       figuras[1] = new Triangle(5, 5);
       figuras[2] =  new Circle(1);
       figuras[3] = new Ellipse(1,2);

       for(int i = 0; i < figuras.length; i++){
           System.out.println("Perimetro figura " + (i+1) + ": " + figuras[i].perimetro());
           System.out.println("Area figura " + (i+1) + ": " + figuras[i].area());
           if(figuras[i] instanceof Rectangle){
               Rectangle r = (Rectangle) figuras[i];
               System.out.println("Diagonal: " + r.diagonal());
           }
           System.out.println("");
       }

        System.out.println(figuras[0].equals(figuras[0])); //equivalencia entre figuras

        /////////////////////////////////////////////////////// ejercicio 3 de guia  6 abajo
        System.out.println("***********************************************");


        List<Figure> figurasLista = new ArrayList<>();

        figurasLista.add(new Rectangle(5 , 5));
        figurasLista.add(new Triangle(5, 5));
        figurasLista.add(new Circle(1));
        figurasLista.add(new Ellipse(1,2));


        for(int i = 0; i < figurasLista.size(); i++){
            System.out.println("Perimetro figura " + (i+1) + ": " + figurasLista.get(i).perimetro());
            System.out.println("Area figura " + (i+1) + ": " + figurasLista.get(i).area());
            if(figurasLista.get(i) instanceof Rectangle){
                Rectangle r = (Rectangle) figurasLista.get(i);
                System.out.println("Diagonal: " + r.diagonal());
            }
            System.out.println("");
        }

        System.out.println(figurasLista.get(0).equals(figurasLista.get(0)));


    }

}
