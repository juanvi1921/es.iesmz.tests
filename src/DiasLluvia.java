public class DiasLluvia {
    private boolean calendario [][];

    public DiasLluvia(boolean Llovido) {
        this.calendario = new boolean[12][31];
    }

    public boolean registroDia (int mes, int dia, boolean haLlovido) {
        if ((mes > 0 && mes <= 12) && (dia > 0 && dia <= 31)) {
            if (haLlovido) {
                calendario[mes][dia] = true;
                System.out.println("Dia registrado.");
                return true;
            } else {
                calendario[mes][dia] = false;
                System.out.println("Dia registrado.");
                return true;
            }
        } else {
            System.err.println("FECHA INCORRECTA.");
        }
        return false;
    }

    public boolean consultarDia (int dia, int mes) {
        return false;
    }

    public int contarDiasLluviosos() {
        int contDiasLluviosos = 0;
        contDiasLluviosos++;
        return contDiasLluviosos;
    }

}
