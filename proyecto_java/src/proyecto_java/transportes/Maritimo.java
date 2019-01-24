/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_java.transportes;

import proyecto_java.MedioDeTransporte;

/**
 *
 * @author Dev 01
 */
public class Maritimo extends MedioDeTransporte{
    
    private int numCascos;
    private String capitan;
    private int tripulacion;

    public Maritimo(){
    
    }
    
    public Maritimo(int numCascos, String capitan, int tripulacion){
        this.numCascos = numCascos;
        this.capitan = capitan;
        this.tripulacion = tripulacion;
    }
    
    public int getNumCascos() {
        return numCascos;
    }

    public void setNumCascos(int numCascos) {
        this.numCascos = numCascos;
    }

    public String getCapitan() {
        return capitan;
    }

    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    public int getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }
    
}
