package austral.prog1.tp6;

import austral.util.Scanner;

class Tp6IgnacioChalubIntegerArrayUtil{



    public static String toString(int[] array){

        String stringArray = "{";
        for(int i = 0; i < array.length; i++){
            if(i < array.length - 1){
                stringArray = stringArray + array[i] + ", ";
            }else{ // si es el ultimo elemento pone "}" en vez de ", "
                stringArray = stringArray + array[i] + "}";
            }

        }
        return stringArray;
    }


    public static float sum(int[] array){
        float sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static float avg(int[] array){
        return sum(array)/array.length;  // ((float) sum(array)/array.length); para no tener que poner float en el metodo sum
    }

    public static int max(int[] array){ // {1, 2, 3, 4}

        int maxNum = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] >= maxNum){
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static int min(int[] array){ // {1, 2, 3, 4}

        int minNum = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] <= minNum){
                minNum = array[i];
            }
        }
        return minNum;
    }

    public static int[] fillArray(String message, int i){

        int[] array = new int[i];
        for(int x = 0; x < array.length; x++){
            array[x] = Scanner.getInt(message);
        }
        return array;

    }


    public static int[] sort(int[] array){ // 2, 3, 1 -----> 1, 3, 2 -----> 1, 2, 3

        for(int i = 0; i < array.length; i++){
            for(int x = i ; x < array.length; x++){
                int left = array[i];
                int right = array[x];
                if(left > right){
                    array[i] = right;
                    array[x] = left;
                }

            }
        }
        return array;
    }



}
