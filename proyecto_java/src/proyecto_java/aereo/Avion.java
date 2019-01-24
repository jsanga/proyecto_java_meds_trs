/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_java.aereo;

import proyecto_java.transportes.Aereo;

/**
 *
 * @author Dev 02
 */
public class Avion extends Aereo{
    
    private String alas;
    private String alerones;
    private String spoiler;
    private String tamanio;
    
    public Avion(String alas, String alerones, String spoiler){
        this.alas = alas;
        this.alerones = alerones;
        this.spoiler = spoiler;
    }

    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }

    public String getAlerones() {
        return alerones;
    }

    public void setAlerones(String alerones) {
        this.alerones = alerones;
    }

    public String getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(String spoiler) {
        this.spoiler = spoiler;
    }
    
}
