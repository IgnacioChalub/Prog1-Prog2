package austral.prog2.PracticaPrimerParcial.Intento2Recuperatorio2018.Ejercicio1;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public class Competidor {

    int dni;
    String surname;
    int edad;
    boolean certificadoMedico;
    boolean sabeNadar;
    Bicicleta bicicleta;
    List<Informe> informes;

    public Competidor(int dni, String surname, int edad, boolean certificadoMedico, boolean sabeNadar, Bicicleta bicicleta) {
        this.dni = dni;
        this.surname = surname;
        this.edad = edad;
        this.certificadoMedico = certificadoMedico;
        this.sabeNadar = sabeNadar;
        this.bicicleta = bicicleta;
        this.informes = new ArrayList<>();
    }

    public boolean requisitosMinimos(){
        return certificadoMedico && edad >= 18;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public boolean sabeNadar() {
        return sabeNadar;
    }

    public void addInforme(Informe informe){
        informes.add(informe);
    }

    public List<Integer> rankHistoryByCompetition(String tipo){
        List<Integer> rankHistory = new ArrayList<>();
        for (int i = 0; i < informes.size(); i++) {
            if(informes.get(i).getTipo().equals(tipo)){
                rankHistory.add(informes.get(i).getRanking());
            }
        }
        return rankHistory;
    }

    public List<Integer> timeHistoryByCompetition(String tipo){
        List<Integer> timeHistory = new ArrayList<>();
        for (int i = 0; i < informes.size(); i++) {
            if(informes.get(i).getTipo().equals(tipo)){
                timeHistory.add(informes.get(i).getTiempo());
            }
        }
        return timeHistory;
    }

    public Double promedioDePerformance(String tipo){
        double velocidadAcumulada = 0;
        double cantidadDeCarreras = 0;
        for (int i = 0; i < informes.size(); i++) {
            if (informes.get(i).getTipo().equals(tipo)){
                velocidadAcumulada += informes.get(i).getVelocity();
                cantidadDeCarreras++;
            }
        }
        return velocidadAcumulada/cantidadDeCarreras;
    }

    public int getCantidadDeEventos(){
        return informes.size() + 1;
    }

    public int getDNI(){
        return dni;
    }


}
