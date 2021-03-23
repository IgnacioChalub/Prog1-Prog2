package cajero;

import austral.util.Scanner;

public class Usuario {

    String name;
    private String password;
    private int money = 0;


    Usuario(String name, String password){
        this.name = name;
        this.password = password;
    }

    void addMoney(){
        askPassword();
        System.out.println();
        int input = Scanner.getInt("Ingrese la cantidad que desea ingresar: ");
        if(input < 0){
            System.out.println();
            System.out.println("No puede ingresar una cantidad negativa de dinero.");
        }else{
            money = money + input;
            System.out.println();
            System.out.println("El dinero se ha ingresado correctamente.");
        }
    }

    void retireMoney(){
        askPassword();
        System.out.println();
        int input = Scanner.getInt("Ingrese la cantidad que desea retirar: ");
        if(input > money || input < 0){
            System.out.println();
            System.out.println("La accion no se pudo realizar correctamente.");
        }else{
            money = money - input;
            System.out.println();
            System.out.println("El dinero se a retirado correctamente.");
        }
    }

    void trasnferMoney(Usuario otherUsuario){
        askPassword();
        System.out.println();
        int amount = Scanner.getInt("Ingrese cantidad a transferir: ");
        if(amount <= money){
            setMoney(-amount);
            otherUsuario.setMoney(amount);
        }else{
            System.out.println("No posee esa cantidad de dinero. Vuelva a intentarlo.");
        }


    }

    void consultMoney(){
        askPassword();
        System.out.println();
        System.out.println("Su saldo es: " + money);
    }

    void askPassword(){
        System.out.println();
        String pw = Scanner.getString("Ingrese su contraseña:");
        if(!pw.equals(password)){

            System.out.println("Contraseña incorrecta. Vuelva a intentarlo.");
            askPassword();
        }
    }

    int setMoney(int input){
        money = money + input;
        return money;
    }

    String getName(){
        return name;
    }

    String getPassword(){
        return password;
    }

    private int getMoney(){
        return money;
    }


}

