import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DiasLluviaTest {

    @Test
    void testRegistroDia1() {
        DiasLluvia calendario = new DiasLluvia();
        assertEquals(true, calendario.registroDia(15, 14, false));
    }

    @Test
    void testRegistroDia2() {
        DiasLluvia calendario = new DiasLluvia();
        assertEquals(true, calendario.registroDia(8, 14, false));
    }

    @Test
    void testRegistroDia3() {
        DiasLluvia calendario = new DiasLluvia();
        assertEquals(false, calendario.registroDia(8, 33, false));
    }

    @Test
    void testconsultarDia1() {
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(5, 12, true);
        assertEquals(true, calendario.consultarDia(05, 12));
    }

    @Test
    void testconsultarDia2() {
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(5, 12, true);
        assertEquals(true, calendario.consultarDia(5, 12));
    }

    @Test
    void testconsultarDia3() {
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(0, 30, true);
        assertEquals(true, calendario.consultarDia(0, 31));
    }

    @Test
    void testContarDiasLluviosos1() {
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(12, 15, true);
        calendario.registroDia(10, 12, true);
        calendario.registroDia(7, 1, true);
        calendario.registroDia(6, 4, true);
        assertEquals(4, calendario.contarDiasLluviosos());
    }

    @Test
    void testContarDiasLluviosos2() {
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(12, 15, true);
        calendario.registroDia(10, 12, true);
        calendario.registroDia(7, 1, false);
        calendario.registroDia(6, 4, true);
        assertEquals(3, calendario.contarDiasLluviosos());
    }

    @Test
    void testContarDiasLluviosos3() {
        DiasLluvia calendario = new DiasLluvia();
        calendario.registroDia(12, 15, true);
        calendario.registroDia(10, 12, false);
        calendario.registroDia(7, 1, false);
        calendario.registroDia(6, 4, true);
        assertEquals(4, calendario.contarDiasLluviosos());
    }

    @Test
    void testTrimestreMasLluvioso1() {

    }

    @Test
    void cont1rTrimestre() {
    }

    @Test
    void cont2nTrimestre() {
    }

    @Test
    void cont3rTrimestre() {
    }

    @Test
    void cont4tTrimestre() {
    }

    @Test
    void primerDiaLluvia() {
    }
}
