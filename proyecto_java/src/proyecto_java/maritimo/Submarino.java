/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_java.maritimo;

import proyecto_java.transportes.Maritimo;

/**
 *
 * @author Dev 01
 */
public class Submarino extends Maritimo{
    
    private String propulsion;
    private String tipoSubmarino;
    private String tipoSoporteVital;

    public Submarino(String propulsion, String tipoSubmarino, String tipoSoporteVital){
        this.propulsion = propulsion;
        this.tipoSubmarino = tipoSubmarino;
        this.tipoSoporteVital = tipoSoporteVital;
    }
    
    public String getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public String getTipoSubmarino() {
        return tipoSubmarino;
    }

    public void setTipoSubmarino(String tipoSubmarino) {
        this.tipoSubmarino = tipoSubmarino;
    }

    public String getTipoSoporteVital() {
        return tipoSoporteVital;
    }

    public void setTipoSoporteVital(String tipoSoporteVital) {
        this.tipoSoporteVital = tipoSoporteVital;
    }
    
}
