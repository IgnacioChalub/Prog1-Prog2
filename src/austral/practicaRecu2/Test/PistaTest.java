package austral.practicaRecu2.Test;

import austral.practicaRecu2.Clases.Pista;
import austral.prog2.tp6.Ejercicio1.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PistaTest {

    @Test
    public void crearPistaTest(){
        ArrayList segmentos = new ArrayList();
        Pista pista = new Pista("gg",segmentos);
        assertEquals(pista.getTipo(), "gg");
        assertTrue(pista.getSegmentos().size() == 0);
    }


}
