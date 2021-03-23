package austral.prog2.tp5.Ejercicio4;

public class StackArray implements Stack{

    Object[] objects;
    int cantidad;


    public StackArray(){
        objects = new Object[10]; // le doy 10 lugares al principio
    }


    @Override
    public void push(Object element) {
        if(objects.length == cantidad){
            Object[] objectsAux = new Object[objects.length*2];
            for(int i = 0; i<cantidad; i++){
                objectsAux[i] = objects[i];
            }
            objects = objectsAux;
        }
        objects[cantidad] = element;
    }

    @Override
    public Object pop() {
        if(isEmpty()){
            return null;
        }
        Object o = objects[cantidad - 1];
        objects[cantidad - 1] = null;
        return o;
    }

    @Override
    public boolean isEmpty() {
        return cantidad == 0;
    }

}


