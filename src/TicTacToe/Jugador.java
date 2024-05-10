/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToe;

import java.awt.Color;

/**
 *
 * @author xavis
 */
public class Jugador {
    private String nombre;
    private Color color;
    
    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    
    public Jugador(String nombre, String color) {
        this.nombre = nombre;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
