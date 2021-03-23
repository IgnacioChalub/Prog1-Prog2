package austral.prog2.PracticaPrimerParcial.Parcial2018;

public class Matriz {

    int[][] matriz;

    public Matriz(int[][] matriz){
        this.matriz = matriz;
    }

    public int findHuecos(){
        int counter = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == 0){
                    counter++;
                }
            }
        }
        return counter;
    }

    public int sumAlValues(){
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
            }
        }
        return sum;
    }

    public void replaceElement(int number, int row, int col){
        if((row >= matriz.length || row < 0) && (col < 0 || col >= matriz[row].length)){
            throw new IndexOutOfBoundsException("No existe esa posicion en la matriz");
        }else{
            matriz[row][col] = number;
        }
    }

    public void erraseElement(int row, int col){
        replaceElement(0,row,col);
    }

}
