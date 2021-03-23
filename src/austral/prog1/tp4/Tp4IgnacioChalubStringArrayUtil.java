package austral.prog1.tp4;


import austral.util.Scanner;

class Tp4IgnacioChalubStringArrayUtil{


    public static void print(String[] array){

        for( int i = 0; i < array.length; i++){

            if( array[i] != null ){
                System.out.println("The array for the index " + i + " is: \t" + array[i]);
            }

        }

    }

    public static int indexOf(String[] array, int i, String palabra){

        if(palabra == null){
            for(int x = i; x < array.length; x++){
                if(array[x] == null){
                    return x;
                }
            }
            return -1;
        }

        if(palabra != null){
            for(int x = i; x < array.length; x++){
                if(palabra.equals(array[x])){
                    return x;
                }
            }
        }
        return -1;
    }

    public static int indexOf(String[] array, String palabra){
        return indexOf(array, 0, palabra);

    }

    public static int indexOfEmpty(String[] array){
        return indexOf(array, null);
    }



    public static int put(String[] array, String myString){

		/*for(int i = 0; i < array.length; i++){
			if(array[i] == null){
				array[i] = myString;
				return i;
			}
		}
		return -1;*/

        int x = indexOfEmpty(array);
        if( x != -1){
            array[x] = myString;
            return x;
        }else{
            return x;
        }
    }


    public static int remove(String[] array, String myString){

        int x = 0; //contador
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(myString)){
                array[i] = null;
                x++;
            }
        }
        return x;

			/*int x = 0; //contador
			for(int i = 0; i < array.length; i++){
				int c = indexOf(array, myString);
				if( c != -1){
					array[c] = null;
					x++;
 				}
			}
			return x;*/
    }


    public static String[] fillArray(String a, int x){

			/*int i = 0;

			String[] array = new String[x];


			while(i < x ){

				String myString = Scanner.getString(a);
				array[i] = myString;
				i++;

			}

			return array;

					}*/

        String[] array = new String[x];

        for(int i = 0; i < array.length; i++){
            array[i] = Scanner.getString(a);
        }

        return array;
    }

}
