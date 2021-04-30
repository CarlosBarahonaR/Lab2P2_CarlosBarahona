/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_carlosbarahona;

/**
 *
 * @author Admin
 */
public class Computadora {
    private String modelo;
    private String numSerie; //Lo puse así porque normalmente tienen numeros y letras
    private int capDiscD;
    private int tamañoPant;
    private boolean tecladoNum;
    private String tipoProc;
    private String tajetaGraf;
    private String OSporDefecto;
    private int tiempoFab;
    private int capacidadBat;
    private int duracionBat;

    public Computadora() {
    }

    public Computadora(String modelo, String numSerie, int capDiscD, int tamañoPant, boolean tecladoNum, String tipoProc, String tajetaGraf, String OSporDefecto, int tiempoFab, int capacidadBat, int duracionBat) {
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.capDiscD = capDiscD;
        this.tamañoPant = tamañoPant;
        this.tecladoNum = tecladoNum;
        this.tipoProc = tipoProc;
        this.tajetaGraf = tajetaGraf;
        this.OSporDefecto = OSporDefecto;
        this.tiempoFab = tiempoFab;
        this.capacidadBat = capacidadBat;
        this.duracionBat = duracionBat;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public int getCapDiscD() {
        return capDiscD;
    }

    public void setCapDiscD(int capDiscD) {
        this.capDiscD = capDiscD;
    }

    public int getTamañoPant() {
        return tamañoPant;
    }

    public void setTamañoPant(int tamañoPant) {
        this.tamañoPant = tamañoPant;
    }

    public boolean isTecladoNum() {
        return tecladoNum;
    }

    public void setTecladoNum(boolean tecladoNum) {
        this.tecladoNum = tecladoNum;
    }

    public String getTipoProc() {
        return tipoProc;
    }

    public void setTipoProc(String tipoProc) {
        this.tipoProc = tipoProc;
    }

    public String getTajetaGraf() {
        return tajetaGraf;
    }

    public void setTajetaGraf(String tajetaGraf) {
        this.tajetaGraf = tajetaGraf;
    }

    public String getOSporDefecto() {
        return OSporDefecto;
    }

    public void setOSporDefecto(String OSporDefecto) {
        this.OSporDefecto = OSporDefecto;
    }

    public int getTiempoFab() {
        return tiempoFab;
    }

    public void setTiempoFab(int tiempoFab) {
        this.tiempoFab = tiempoFab;
    }

    public int getCapacidadBat() {
        return capacidadBat;
    }

    public void setCapacidadBat(int capacidadBat) {
        this.capacidadBat = capacidadBat;
    }

    public int getDuracionBat() {
        return duracionBat;
    }

    public void setDuracionBat(int duracionBat) {
        this.duracionBat = duracionBat;
    }

    @Override
    public String toString() {
        return "Computadora{" + "modelo=" + modelo + ", numSerie=" + numSerie + ", capDiscD=" + capDiscD + ", tama\u00f1oPant=" + tamañoPant + ", tecladoNum=" + tecladoNum + ", tipoProc=" + tipoProc + ", tajetaGraf=" + tajetaGraf + ", OSporDefecto=" + OSporDefecto + ", tiempoFab=" + tiempoFab + ", capacidadBat=" + capacidadBat + ", duracionBat=" + duracionBat + '}';
    }
    
    
}
