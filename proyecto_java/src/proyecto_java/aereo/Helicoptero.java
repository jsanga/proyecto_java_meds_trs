/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_java.aereo;

import proyecto_java.transportes.Aereo;

/**
 *
 * @author Dev 01
 */
public class Helicoptero extends Aereo{
    
    private String tipoRotor;
    private String tipoVuelo;
    private String tipoMotor;

    public Helicoptero(String tipoRotor, String tipoVuelo, String tipoMotor){
        this.tipoMotor = tipoMotor;
        this.tipoRotor = tipoRotor;
        this.tipoVuelo = tipoVuelo;
    }
    
    public String getTipoRotor() {
        return tipoRotor;
    }

    public void setTipoRotor(String tipoRotor) {
        this.tipoRotor = tipoRotor;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
}
