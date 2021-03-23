package austral.prog2.tp6.Ejercicio2;


import java.util.Arrays;
import java.util.Iterator;


public class Interval {

    double min;
    double max;
    double space;

    public Interval(double min, double max, double space){
     if(max <= min || space <= 0){
        throw new IllegalArgumentException("Max debe ser mayor a min y el Step debe ser mayor a que 0");
     }
     this.min = min;
     this.max = max;
     this.space = space;

    }

    public Double first(){
        return get(0);
    }

    public Double last(){
        return get(size() - 1);
    }

    public Double get(int j){ // el primer elemento es el cero
        /*double number = min;
        for(int i = 0; i<j; i++){
            number = number + space;
        }
        return number;*/

        if(j < 0 || j > size()){
            throw new IllegalArgumentException();
        }
        return min + j*space;
    }

    public int size(){
        /*double number = min;
        int size = 0;
        while(number < max){
            number  += space;
            size++;
        }
        return size;*/
        return (int) Math.round(((max-min)/space)); //redondea para arriba el int
    }

    public Double[] toArray(){
        Double[] array = new Double[size()];
        for (int i = 0; i<array.length; i++){
            array[i] = get(i);
        }
        return array;
    }


    public static void main(String[] args) {

        Interval i = new Interval(0,5, 1);
        System.out.println(i.size());
        System.out.println(i.first());
        System.out.println(i.last());
        System.out.println(i.get(3));

        System.out.println("***********");

        Double[] array1 = i.toArray();

        Iterator<Double> it = Arrays.stream(array1).iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }


}
