/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;

import java.io.IOException;
import java.util.Properties;

public class Idioma extends Properties {

    private static final long serialVersionUID = 1L;

    public Idioma(String idioma) {

        //Modificar si quieres añadir mas idiomas
        //Cambia el nombre de los ficheros o añade los necesarios
        switch (idioma) {
            case "Español":
                getProperties("espanol.properties");
                break;
            case "Inglés":
                getProperties("ingles.properties");
                break;
            case "Alemán":
                getProperties("aleman.properties");
                break;
            case "Francés":
                getProperties("frances.properties");
                break;
            default:
                getProperties("espanol.properties");
        }

    }

    private void getProperties(String idioma) {
        try {
            this.load(getClass().getResourceAsStream(idioma));
        } catch (IOException ex) {

        }
    }
}
