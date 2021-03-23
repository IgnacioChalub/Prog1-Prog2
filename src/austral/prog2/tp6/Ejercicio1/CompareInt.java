package austral.prog2.tp6.Ejercicio1;

public class CompareInt implements Comparator<Integer>{

    @Override
    public boolean compareTo(Integer o1, Integer o2) {
        if(o1 > o2){
            return true;
        }else{
            return false;
        }
    }

}
