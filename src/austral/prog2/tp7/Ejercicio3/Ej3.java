package austral.prog2.tp7.Ejercicio3;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ej3 {

    private static final String nombreDeArchivo = "cuidadoConElEquals";
    private static int count = 0;
    private static int[] array = {0, 1};

    public static void main(String[] args) {

        try {
            try {
                try {
                    String fileName = "cuidadoCon";
                    fileOpen(fileName + "El" + "Equals");
                    System.out.println("Archivo 1 abierto correctamente"); // no se ve
                } catch (FileNotFoundException e) { // no enttra aca
                    System.out.println("aaaaaaaaaaaa");
                    System.out.println("Catching FileNotFoundException: " + e.getMessage());
                } finally {
                    System.out.println("En 1 Finally");
                    fileOpen(nombreDeArchivo);
                    System.out.println("Archivo 2 Abierto Correctamente"); // no se ve
                }
            } finally {
                System.out.println("En 2 Finally");
                fileOpen("otroArchivo"); // entra y tira error null pointer exception pq llama unlugar del array que no existe

            }
        } catch (IOException e) {
            System.out.println("**********");
            System.out.println("Catching IOException: " + e.getMessage());
        } catch (Exception e) { // entra
            System.out.println("---------------");
            System.out.println("Catching Exception: " + e.getMessage());
        }

        System.out.println("Fin!");
    }

    private static void fileOpen(String fileName) throws IOException {
        System.out.println("FileOpen: " + array[count]);
        count++;
        if (fileName == nombreDeArchivo) {
            System.out.println("holaaa");
            throw new FileNotFoundException("Archivo no encontrado");
        } else {
            System.out.println("chauu");
            throw new EOFException("Fin del Archivo");
        }
    }
}

