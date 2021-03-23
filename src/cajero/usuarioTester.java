package cajero;

import austral.util.Scanner;

public class usuarioTester {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("Nacho", "lolo123");
        Usuario u2 = new Usuario("Mateo", "wendy123");
        Usuario u3 = new Usuario("Cata", "grimoldi");

        Usuario[] datos = {u1, u2, u3};
        String[] nombres = {u1.getName(), u2.getName(), u3.getName()};
        String[] contraseñas = {u1.getPassword(), u2.getPassword(), u3.getPassword()};

        while(true){
            int accion = Scanner.getInt("Toque 1 para ingresar un usuario o 2 para salir: ");
            if(accion == 1){

                String ingresarUsuario = Scanner.getString("Ingrese su nombre de usuario: ");

                int ingreso = chequeoNombre(ingresarUsuario, nombres);

                int ingresoContra;

                do{
                        String ingresarPw = Scanner.getString("Ingrese su contraseña: ");
                        ingresoContra = chequeoContraseña(ingresarPw, contraseñas);
                }while(ingreso != ingresoContra);

                Usuario usuario = datos[ingresoContra];

                int control = 0;

                while(control == 0){
                    printMenu();
                    System.out.println();
                    int movimiento = Scanner.getInt("Que accion desea realizar?");

                    switch (movimiento){
                                case 1:
                                    usuario.addMoney();
                                    System.out.println("------------------------");
                                    break;
                                case 2:
                                    usuario.retireMoney();
                                    System.out.println("------------------------");
                                    break;
                                case 3:
                                    usuario.consultMoney();
                                    System.out.println("------------------------");
                                    break;
                                case 4:
                                    String who = Scanner.getString("Ingrese a quien le desea transferir el dinero:");
                                    int otroU = returnOtherUser(who, nombres);
                                    Usuario otroUsuario = datos[otroU];
                                    usuario.trasnferMoney(otroUsuario);
                                    System.out.println("------------------------");
                                    break;
                                case 5:
                                    control++;
                            }
                        }
            }else if(accion == 2){
                    System.exit(0);
                     }
            }

        }

    public static int chequeoNombre(String usuario, String[] datos){
        for(int i = 0; i < datos.length; i++){
            if(usuario.equals(datos[i])){
                return i;
            }
        }
        String nuevoUsuario = Scanner.getString("Ingrese otro nombre de usuario: ");
        return chequeoNombre(nuevoUsuario, datos);
    }

    public static int chequeoContraseña(String usuario, String[] datos){
        for(int i = 0; i < datos.length; i++){
            if(usuario.equals(datos[i])){
                return i;
            }
        }
        String nuevaContraseña = Scanner.getString("Intente de nuevo: ");
        return chequeoContraseña(nuevaContraseña, datos);
    }

    public static int returnOtherUser(String user, String[] datos){
        for (int i = 0; i < datos.length; i++){
            if(datos[i].equals(user)){
                return i;
            }
        }
        return -1;

    }

    public static void printMenu(){
        System.out.println();
        System.out.println("Para agregar dinero a su cuenta: 1");
        System.out.println();
        System.out.println("Para retirar dinero de su cuenta: 2");
        System.out.println();
        System.out.println("Para consultar su saldo: 3");
        System.out.println();
        System.out.println("Para enviar dinero: 4 ");
        System.out.println();
        System.out.println("Para salir o cambiar de cuenta: 5");
        System.out.println();
        System.out.println("---------------------------------");
    }


}
