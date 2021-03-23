package austral.prog1.tp7;

import austral.util.Scanner;

public class StringList {

    // Elementos de la lista, puede tener lugares vacíos al final del array
    private String[] items;

    // Cantidad de lugares ocupados con valores distintos de null, empieza en 0
    private int size = 0;

    /** Inicializa items con un máximo de 10 lugares, comienza con sus lugares vacíos */
    public StringList() {
        // todo implementar constructor
        items = new String[10];
        // this(10);
        }

    /** Inicializa items con un máximo de n lugares, comienza con sus lugares vacíos */
    public StringList(int n) {
        // todo implementar constructor
        items = new String[n];
    }

    /**
     * Agrega un String a la lista, en la primera posición disponible.
     * Si no hay más lugares vacíos al final del arreglo, agranda el arreglo con la siguiente lógica:
     * - Crear un nuevo arreglo del doble de tamaño que el arreglo items original
     * - Copie todos los valores del viejo arreglo de items al nuevo
     * - Asigne el nuevo arreglo a items
     */
    public void add(String item) { // se puede hacer con size tambien y cuando agregas le sumas uno a size
        // todo implementar constructor
            /*if(indexOf(null) != -1){
                items[indexOf(null)] = item;
            }else{
                String[] newItems = new String[items.length * 2];
                for(int i = 0; i < items.length; i++){
                    newItems[i] = items[i];
                }
                items = newItems;
                items[indexOf(null)] = item;
            }*/
            if(size >= items.length){
                String[] newItems = new String[items.length * 2];
                for(int i = 0; i < items.length; i++){
                    newItems[i] = items[i];
                }
                items = newItems;
            }
            items[size] = item;
            size++;

        }

    /**
     * Busca el elemento en la lista:
     * - Si lo encuentra retorna su posición
     * - De lo contrario retorna -1
     */
    public int indexOf(String item) {
        // todo implementar constructor
       /* if(item == null){
            for(int i = 0; i < items.length; i++){
                if(items[i] == item){
                    return i;
                }
            }
            return -1;
        }else{
            for(int i = 0; i < items.length; i++){
                if(item.equals(items[i])){
                    return i;
                }
            }
            return -1;
        }*/
        for(int i = 0; i < size; i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }

    /**
     * Elimina el String que este en la posición index de la lista:
     * - La lista NO deberá quedar con lugares vacíos en el medio.
     * - Los lugares vacíos deben estar todos al final.
     *
     * Ejemplos teniendo un StringList que contiene estos items ["a", "b", "c", null, null]:
     * - Luego de llamar a remove(2) sobre la lista, queda: ["a", "b", null, null, null]
     * - Luego de llamar a remove(0) sobre la lista, queda: ["b", "c", null, null, null]
     */
    public void remove(int index) {
        // todo implementar constructor
        items[index] = null;
        for(int i = index; i < items.length - 1; i++){
            items[i] = items[i + 1];
        }
        items[items.length - 1] = null;
        size--;
    }

    /**
     * Retorna un String de la siguiente forma: ['a', 'b', 'c']
     * NO debe agregar al String los valores vacíos o null.
     *
     * Ejemplo:
     * - Teniendo un StringList con estos items ["a", "b", "c", null, null]
     * - El metodo toString devuelve: ['a', 'b', 'c']
     */
    public String toString() {
        // todo implementar constructor
        /*int x = 0;
        String itemsString = "[";
        for(int i = 0; i < items.length; i++){
            if(i< items.length - 1 && items[i + 1] != null){
                itemsString = itemsString + "'" + items[i] + "', ";
                x++;
            }
        }
        itemsString = itemsString + "'" + items[x] + "'] ";
        return itemsString;*/

        String itemsString = "[";
        for (int i = 0; i < size - 1; i++){
            itemsString += "'" + items[i] + "', ";
        }
        return itemsString += "'" + items[size - 1] + "']";
    }

    /**
     * Retorna la cantidad de elementos que NO son nulos en el arreglo.
     * Solo los que tienen valor.
     *
     * Ejemplo:
     * - Teniendo un StringList con estos items ["a", "b", "c", null, null]
     * - El metodo size devuelve: 3
     */
    public int size() { // poner solo return size; e ir actualizando size cada ves q agrego o saco
        // todo implementar constructor
        /*size = 0;
        for(int i = 0; i < items.length; i++){
            if(items[i] != null){
                size++;
            }
        }
        return size;
        }*/
        return size;
    }



}

