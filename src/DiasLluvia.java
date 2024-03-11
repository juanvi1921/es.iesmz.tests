public class DiasLluvia {
    private boolean calendario [][];

    public DiasLluvia() {
        this.calendario = new boolean[13][32];
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

    public boolean consultarDia (int mes, int dia) {
        if (calendario[mes][dia]) {
            System.out.println("Ese dia ha llovido.");
            return true;
        } else {
            System.out.println("Ese dia no ha llovido.");
            return false;
        }
        //return calendario[mes][dia]; Es pot fer en una linea si no vols fer els print.
    }

    public int contarDiasLluviosos() {
        int contDiasLluviosos = 0;
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j]) {
                    contDiasLluviosos++;
                }
            }
        }
        return contDiasLluviosos;
    }

    public int trimestreMasLluvioso() {
        int dies1rTrimestre = cont1rTrimestre();
        int dies2nTrimestre = cont2nTrimestre();
        int dies3rTrimestre = cont3rTrimestre();
        int dies4tTrimestre = cont4tTrimestre();

        int trimestreMasLluvioso = Math.max(dies1rTrimestre, Math.max(dies2nTrimestre, Math.max(dies3rTrimestre, dies4tTrimestre)));

        if(trimestreMasLluvioso == dies1rTrimestre) {
            return 1;
        } else if (trimestreMasLluvioso == dies2nTrimestre) {
            return 2;
        } else if (trimestreMasLluvioso == dies3rTrimestre) {
            return 3;
        } else if (trimestreMasLluvioso == dies4tTrimestre) {
            return 4;
        } else {
            return 0;
        }

    }

    public int cont1rTrimestre() {
        int dies1rTrimestre = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j]) {
                    dies1rTrimestre++;
                }
            }
        }
        return dies1rTrimestre;
    }

    public int cont2nTrimestre() {
        int dies2nTrimestre = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j]) {
                    dies2nTrimestre++;
                }
            }
        }
        return dies2nTrimestre;
    }

    public int cont3rTrimestre() {
        int dies3rTrimestre = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j]) {
                    dies3rTrimestre++;
                }
            }
        }
        return dies3rTrimestre;
    }

    public int cont4tTrimestre() {
        int dies4tTrimestre = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j]) {
                    dies4tTrimestre++;
                }
            }
        }
        return dies4tTrimestre;
    }

    public int primerDiaLluvia() {
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (calendario[i][j]) {
                    return (j + 1) + (i * calendario[i].length);
                }
            }
        }
        return -1;
    }
}
