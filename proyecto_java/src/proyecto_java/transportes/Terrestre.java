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
public class Terrestre extends MedioDeTransporte {

    private String traccion;
    private String transmision;
    private String combustible;
    private int kilometraje;
    private boolean electrico;
    private boolean hibrido;
    private String conductor;
    
    public Terrestre(){
    
    }
    
    public Terrestre(String traccion, String transmision, String combustible, int kilometraje,
            boolean electrico, boolean hibrido){
        this.traccion = traccion;
        this.transmision = transmision;
        this.combustible = combustible;
        this.kilometraje = kilometraje;
        this.electrico = electrico;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public boolean isHibrido() {
        return hibrido;
    }

    public void setHibrido(boolean hibrido) {
        this.hibrido = hibrido;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
    
}
