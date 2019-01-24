/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_java;

/**
 *
 * @author Dev 01
 */
public class MedioDeTransporte {
    
    private int tipo;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private float potencia;
    private float torque;
    private boolean dePasajeros;
    private boolean deCarga;
    private boolean urbano;
    private boolean publico;
    private int cantidadPasajeros;
    private float cargaKg;
    private String estructura;

    public MedioDeTransporte(){
    
    }
    
    public MedioDeTransporte(int tipo, String marca, String modelo, int anioFabricacion, float potencia, float torque,
            boolean dePasajeros, boolean deCarga, boolean urbano, boolean publico, int cantidadPasajeros, float cargaKg, String estructura){
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.potencia = potencia;
        this.torque = torque;
        this.dePasajeros = dePasajeros;
        this.deCarga = deCarga;
        this.cantidadPasajeros = cantidadPasajeros;
        this.cargaKg = cargaKg;
        this.estructura = estructura;
    }
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public boolean isDePasajeros() {
        return dePasajeros;
    }

    public void setDePasajeros(boolean dePasajeros) {
        this.dePasajeros = dePasajeros;
    }

    public boolean isDeCarga() {
        return deCarga;
    }

    public void setDeCarga(boolean deCarga) {
        this.deCarga = deCarga;
    }

    public boolean isUrbano() {
        return urbano;
    }

    public void setUrbano(boolean urbano) {
        this.urbano = urbano;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getTorque() {
        return torque;
    }

    public void setTorque(float torque) {
        this.torque = torque;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public float getCargaKg() {
        return cargaKg;
    }

    public void setCargaKg(float cargaKg) {
        this.cargaKg = cargaKg;
    }
    
}
