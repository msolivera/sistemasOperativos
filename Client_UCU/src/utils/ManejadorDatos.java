/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Meki
 */
public class ManejadorDatos {

    public String manejarDatos(String cedula) {

        String resultado = "";

        String[] personasBase = ManejadorArchivosGenerico.leerArchivo("src/client_ucu/files/personas.txt", false);
        for (String lineaPersona : personasBase) {
            String[] lineaAProcesar = lineaPersona.split("\\|");

            if (lineaAProcesar[0].compareTo(cedula) == 0) {
                resultado = lineaPersona;
            }
        }

        return resultado;
    }

}
