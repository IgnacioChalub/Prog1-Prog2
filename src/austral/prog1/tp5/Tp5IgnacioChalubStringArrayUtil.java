package austral.prog1.tp5;

import austral.util.Scanner;

class Tp5IgnacioChalubStringArrayUtil{


    public static void printAux(String[] array, int i){

        if(i < array.length ){
            if(array[i] != null){
                System.out.println("The string for the index " + i + " is: \t" + array[i]);
            }
            i++;
            printAux(array, i);
        }
    }

    public static void print(String[] array){
        printAux(array, 0);
    }




    public static int indexOf(String[] array, int i, String palabra){

        if( i == array.length){
            return -1;
        }

        if(palabra == null){
            if(array[i] != palabra){ //array[i] != palabra , !array[i].equals(palabra)
                return indexOf(array, ++i, palabra);
            }else{
                return i;
            }
        }

        if(!palabra.equals(array[i])){	// array[i] != palabra (para que funcione indexofempty)//porque si pongo !array[i].equals(palabra) me tira NullPointerException si hay algun lugar vacio en el array antes del string que busco
            return indexOf(array, ++i, palabra);
        }else{
            return i;
        }

    }

    public static int indexOf(String[] array, String palabra){
        return indexOf(array, 0, palabra);
    }

    public static int indexOfEmpty(String[] array){
        return indexOf(array, null);
    }

    public static int put(String[] array, String palabra){

        int i = indexOfEmpty(array);

        if(i == -1){
            return -1;
        }else{
            array[i] = palabra;
            return i;
        }

    }

    public static int remove(String[] array, String palabra, int x){

        int i = indexOf(array, palabra);

        if( i != -1 ){
            array[i] = null;
            return remove(array, palabra, ++x);
        }

        return x;

    }

    public static int remove(String[] array, String palabra){
        return remove(array, palabra, 0);
    }


    public static String[] fillArray(String message, int x){
        String[] array = new String[x];	//crea el array
        fillArrayAux( message, x, 0, array); // lo rellena
        return array;
    }

    public static String[] fillArrayAux(String message, int x, int i, String[] array){


        if( i < x ){ //mientras i = 0, sea menor a my array.lenght (x)
            String myString = Scanner.getString(message);
            array[i] = myString;
            fillArrayAux(message, x, ++i, array); //vuelve a llamar al metodo pero sumandole uno a i
        }

        return array;

    }

}
