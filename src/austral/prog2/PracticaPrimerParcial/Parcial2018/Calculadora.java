package austral.prog2.PracticaPrimerParcial.Parcial2018;

import austral.prog2.tp6.Ejercicio1.ArrayList;
import austral.prog2.tp6.Ejercicio1.List;

public class Calculadora extends Matriz{

    public Calculadora(int[][] matriz) {
        super(matriz);
    }

    public void erraseElement(int row, int col){

        int i = matriz.length;
        int j = matriz[0].length;

        if(row < 0 || col < 0){
            throw new IllegalArgumentException("No puede ser menor a cero");
        }else if(row >= i){
            i = row;
        }else if(col >= j){
            j = col;
        }else if(i == matriz.length && j == matriz[0].length){
            matriz[row][col] = 0;
        }

        int[][] newMatriz = new int[i][j];

        for (int k = 0; k < newMatriz.length; k++) {
            for (int l = 0; l < newMatriz.length; l++) {
                newMatriz[k][l] = 0;
            }
        }

        for (int k = 0; k < matriz.length; k++) {
            for (int l = 0; l < matriz[0].length; l++) {
                newMatriz[k][l] = matriz[k][l];
            }
        }

        matriz = newMatriz;
        matriz[row][col] = 0;

    }

}
