/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.bridge.part;

/**
 *
 * @author HP
 */
public class Cpu {

    private final String model;
    private final String manufacturer;
    private final String cores;
    private final String socket;

    public Cpu(String model, String manufacturer, String cores, String socket) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cores = cores;
        this.socket = socket;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getCores() {
        return cores;
    }

    public String getSocket() {
        return socket;
    }

}
