package austral.prog2.PracticaPrimerParcial.Recuperatorio2018.Ejercicio1;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public class Competidor {

    String dni;
    int edad;
    String apellido;
    boolean certificadoMedico;
    boolean sabeNadar;
    Bicicleta bicicleta;
    List<Informe> informes;

    public Competidor(String dni, int edad, String apellido, boolean certificadoMedico, boolean sabeNadar, Bicicleta bicicleta) {
        this.dni = dni;
        this.edad = edad;
        this.apellido = apellido;
        this.certificadoMedico = certificadoMedico;
        this.sabeNadar = sabeNadar;
        this.bicicleta = bicicleta;
        informes = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean isCertificadoMedico() {
        return certificadoMedico;
    }

    public boolean sabeNadar() {
        return sabeNadar;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public boolean puedeCompetir(){
        return edad >= 18 && certificadoMedico;
    }

    public void endCarrera(Carrera carrera, int ranking, int tiempo){
        Informe informe = new Informe(ranking, carrera.getClass().getSimpleName(), tiempo, carrera.getDistance());
        informes.add(informe);
    }

    public double promedioPerformance(String tipo){
        double sumaVelocidad = 0;
        int cantidad = 0;
        for (int i = 0; i < informes.size(); i++) {
            if (tipo.equals(informes.get(i).getTipo())){
                sumaVelocidad += informes.get(i).getVelocidad();
                cantidad++;
            }
        }
        return sumaVelocidad/cantidad;
    }

    public List<Integer> rankingHistory(String tipo){
        List<Integer> rankingHistory = new ArrayList<>();
        for (int i = 0; i < informes.size(); i++) {
            if(informes.get(i).getTipo().equals(tipo)){
                rankingHistory.add(informes.get(i).getRanking());
            }
        }
        return rankingHistory;
    }

}
