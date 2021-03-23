package austral.prog2.tp5.Ejercicio2;

public class Polinomio implements Function{

    int grado;
    double[] coeficientes;

    public Polinomio(int grado) {
        this.grado = grado;
        coeficientes = new double[grado + 1];
    }

    public void setCoeficiente(int grado, double coeficiente){
        coeficientes[grado] = coeficiente;
    }

    public double[] derivar(){
        double[] derivado = new double[grado];
        for(int i = 0; i<derivado.length; i++){
            derivado[i] = coeficientes[i+1]*(i+1);
            System.out.println(derivado[i]); // esta solo para probar si funcionaba
        }
        return derivado;
    }

    public double evaluate(double value){
        double result = 0;
        for(int i = 0; i<coeficientes.length; i++){
            result = result + Math.pow(value, i) * coeficientes[i];
        }
        return result;
    }








}
