package austral.prog2.tp2;

public class Equals {

        public static void main(String[] args) {
            String str1 = "Hola Mundo!";
            String str2 = "Hola Mundo!";
            String str3 = "Hola ";
            String str4 = "Mundo!";
            String str5 = str3 + str4;
            int num1 = 1;
            Integer num1_2 = 1;
            Integer num200 = 200;
            Integer num200_1 = 200;
            System.out.println(str1 == str2); //pense que era false pero era true porque java si tiene dos strings con la misma cadena los guarda juntos
            System.out.println(str1 == str5); // false
            System.out.println(str1.equals(str5)); //true
            //System.out.println(num1.equals(num1_2)); // error pq se esta comparando un tipo primitivo con equals
            System.out.println(num1_2.equals(num1)); // true
            System.out.println(num200 == num200_1); // false
            System.out.println(num200.equals(num200_1)); // true


        }
    }


