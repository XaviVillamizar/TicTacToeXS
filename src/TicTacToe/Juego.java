/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToe;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;


/**
 *
 * @author xavis
 */
public class Juego {
    private String jugador1;
    private String jugador2;
    private String color_j1;
    private String color_j2;
    
    public Juego(String jugador1,String jugador2, String color_j1, String color_j2 ){
        this.jugador1= jugador1;
        this.jugador2=jugador2;
        this.color_j1=color_j1;
        this.color_j2=color_j2;
    }



    public void iniciarJuego() {
        
    }
    
    public void  finalizarPartida(){
        System.exit(0);
        
    }
    
    
    
    public void manejarEntradaUsuario(){
        
        
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public String getColor_j1() {
        return color_j1;
    }

    public String getColor_j2() {
        return color_j2;
    }

}
