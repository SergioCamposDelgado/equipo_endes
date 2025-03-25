package com.endes.entidad;

/**
 * @author Sergio Campos Delgado
 */
public class ResponsablePruebas extends Personal {
    private int bugsDetectados;

    /**
     * Crear un responsable de pruebas
     * @param dni el dni del responsable
     * @param nombre el nombre del responsable
     * @param sueldoBase el sueldo del responsable
     * @param bugsDetectados la cantidad de bugs detectados
     * @throws IllegalArgumentException si alguno de los parametros no son validos
     */
    public ResponsablePruebas(String dni, String nombre, double sueldoBase, int bugsDetectados) {
        super(dni, nombre, sueldoBase);
        setBugsDetectados(bugsDetectados);
    }

    /**
     * Obtiene el numero de bugs detectados
     * @return el numero de bugs detectados
     */
    public int getBugsDetectados() {
        return bugsDetectados;
    }

    /**
     * Pone el numero de bugs detectados
     * @param bugsDetectados
     * @throws IllegalArgumentException si los bugs son negativos
     */
    public void setBugsDetectados(int bugsDetectados) {
        if (bugsDetectados < 0) {
            throw new IllegalArgumentException("El número de bugs detectados no puede ser negativo.");
        }
        this.bugsDetectados = bugsDetectados;
    }
   
    /**
     * Calcula la profuctividad en base a los bugs detectados
     */
    @Override
    public double calcularProductividad() {
        return getSueldoBase() * (1 + 0.02 * bugsDetectados);
    }
}
