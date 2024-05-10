/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToe;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author xavis
 */
public class Tablero {
    private JLabel[] posicion;
    private int[][] matriz;
    //juego
    private Juego juego;
    private String turno;
    private JLabel txtTurno;
    private boolean ronda;
    private String siguiente_juego="O";
    //pyu
    private JLabel puntoX;
    private JLabel puntoO;
    //jugadores
    private String jugador1;
    private String jugador2;
    //tablero
    private JRadioButton rbt3x3;
    private JRadioButton rbt4x4;
    private JRadioButton rbt5x5;
    Color color3x3 = new Color(0xDE, 0x2D, 0x7B);
    Color color4x4 = new Color(0xF4, 0xA1, 0x35);
    Color color5x5 = new Color(0xEF, 0xE6, 0x7F);
    
//////////////// TABLERO    

   public Tablero(Juego juego){
      jugador1=juego.getJugador1();
      jugador2=juego.getJugador2();
    }

    public Tablero(JLabel[] posicion, int[][] matriz, JLabel txtTurno, JLabel puntoX, JLabel puntoO, boolean ronda, JRadioButton rbt3x3, JRadioButton rbt4x4, JRadioButton rbt5x5) {
        this.posicion = posicion;
        this.matriz = matriz;
        this.ronda = true;
        this.turno = "X"; 
        this.txtTurno = txtTurno;
        //puntos
        this.puntoX = puntoX;
        this.puntoO = puntoO;
        this.rbt3x3 = rbt3x3;
        this.rbt4x4 = rbt4x4;
        this.rbt5x5 = rbt5x5;
    }

  
    public void ficha(int casilla) {
        if (posicion[casilla - 1].getText().equals("") && ronda) {
            posicion[casilla - 1].setText(turno);      
            comprobarEmpate();
            turnos();
            if(rbt3x3.isSelected()){
                ganador3x3();
            } else if(rbt4x4.isSelected()){
                ganador4x4();
            } else if(rbt5x5.isSelected()){
                ganador5x5();
            }
        }
    }
    
//////////////// JUGABILIDAD   

    public void turnos() {
        if (turno.equals("X")){
            turno = "O";
            txtTurno.setText("Turno de "+turno);
        }else{
            turno = "X";
            txtTurno.setText("Turno de "+turno);
        }   
    }
    
    public boolean cambioEstado(){
        return ronda=true;
    }

    public void ganador3x3() {
    for (int i = 0; i < matriz.length; i++) {
        if (posicion[matriz[i][0] - 1].getText().equals("X") 
            && posicion[matriz[i][1] - 1].getText().equals("X") 
            && posicion[matriz[i][2] - 1].getText().equals("X")) {
            marcarGanador3x3("X");  
            
        } else if (posicion[matriz[i][0] - 1].getText().equals("O") 
                && posicion[matriz[i][1] - 1].getText().equals("O") 
                && posicion[matriz[i][2] - 1].getText().equals("O")) {
            marcarGanador3x3("O");        
            return;
            
        }
    }
}
    
    public void ganador4x4() {
    for (int i = 0; i < matriz.length; i++) {
        if (posicion[matriz[i][0] - 1].getText().equals("X") 
            && posicion[matriz[i][1] - 1].getText().equals("X") 
            && posicion[matriz[i][2] - 1].getText().equals("X")
            && posicion[matriz[i][3] - 1].getText().equals("X")) {
            marcarGanador4x4("X");  
            
        } else if (posicion[matriz[i][0] - 1].getText().equals("O") 
                && posicion[matriz[i][1] - 1].getText().equals("O") 
                && posicion[matriz[i][2] - 1].getText().equals("O")
                && posicion[matriz[i][3] - 1].getText().equals("O")) {
            marcarGanador4x4("O");        
            return;
            
        }
    }
}
    
    public void ganador5x5() {
    for (int i = 0; i < matriz.length; i++) {
        if (posicion[matriz[i][0] - 1].getText().equals("X") 
            && posicion[matriz[i][1] - 1].getText().equals("X") 
            && posicion[matriz[i][2] - 1].getText().equals("X")
            && posicion[matriz[i][3] - 1].getText().equals("X")
            && posicion[matriz[i][4] - 1].getText().equals("X")) {
            marcarGanador5x5("X");  
            
        } else if (posicion[matriz[i][0] - 1].getText().equals("O") 
                && posicion[matriz[i][1] - 1].getText().equals("O") 
                && posicion[matriz[i][2] - 1].getText().equals("O")
                && posicion[matriz[i][3] - 1].getText().equals("O") 
                && posicion[matriz[i][4] - 1].getText().equals("O")){
            marcarGanador5x5("O");        
            return;
            
        }
    }
}

    private void marcarGanador3x3(String jugador) {
    for (int i = 0; i < matriz.length; i++) {
        if (posicion[matriz[i][0] - 1].getText().equals(jugador) 
            && posicion[matriz[i][1] - 1].getText().equals(jugador) 
            && posicion[matriz[i][2] - 1].getText().equals(jugador)) {
                Border border = new LineBorder(color3x3, 3); 
                posicion[matriz[i][0] - 1].setBorder(border);
                posicion[matriz[i][1] - 1].setBorder(border);
                posicion[matriz[i][2] - 1].setBorder(border);

            if (jugador.equals("X")) {
                puntoX.setText(String.valueOf(Integer.parseInt(puntoX.getText()) + 1));
                JOptionPane.showMessageDialog(null, "Ha ganado X!");

            } else {
                puntoO.setText(String.valueOf(Integer.parseInt(puntoO.getText()) + 1));
                JOptionPane.showMessageDialog(null, "Ha ganado O!");
            }
            ronda = false;
        }
    }
}
    
    private void marcarGanador4x4(String jugador) {
    for (int i = 0; i < matriz.length; i++) {
        if (posicion[matriz[i][0] - 1].getText().equals(jugador) 
            && posicion[matriz[i][1] - 1].getText().equals(jugador) 
            && posicion[matriz[i][2] - 1].getText().equals(jugador)
            && posicion[matriz[i][3] - 1].getText().equals(jugador)) {
                Border border = new LineBorder(color4x4, 3); 
                posicion[matriz[i][0] - 1].setBorder(border);
                posicion[matriz[i][1] - 1].setBorder(border);
                posicion[matriz[i][2] - 1].setBorder(border);
                posicion[matriz[i][3] - 1].setBorder(border);

            if (jugador.equals("X")) {
                puntoX.setText(String.valueOf(Integer.parseInt(puntoX.getText()) + 1));
                JOptionPane.showMessageDialog(null, "Ha ganado X!");

            } else {
                puntoO.setText(String.valueOf(Integer.parseInt(puntoO.getText()) + 1));
                JOptionPane.showMessageDialog(null, "Ha ganado O!");
            }
            ronda = false;
        }
    }
}
    
    private void marcarGanador5x5(String jugador) {
    for (int i = 0; i < matriz.length; i++) {
        if (posicion[matriz[i][0] - 1].getText().equals(jugador) 
            && posicion[matriz[i][1] - 1].getText().equals(jugador) 
            && posicion[matriz[i][2] - 1].getText().equals(jugador)
            && posicion[matriz[i][3] - 1].getText().equals(jugador)
            && posicion[matriz[i][4] - 1].getText().equals(jugador)) {
                Border border = new LineBorder(color5x5, 3); 
                posicion[matriz[i][0] - 1].setBorder(border);
                posicion[matriz[i][1] - 1].setBorder(border);
                posicion[matriz[i][2] - 1].setBorder(border);
                posicion[matriz[i][3] - 1].setBorder(border);
                posicion[matriz[i][4] - 1].setBorder(border);

            if (jugador.equals("X")) {
                puntoX.setText(String.valueOf(Integer.parseInt(puntoX.getText()) + 1));
                JOptionPane.showMessageDialog(null, "Ha ganado X!");

            } else {
                puntoO.setText(String.valueOf(Integer.parseInt(puntoO.getText()) + 1));
                JOptionPane.showMessageDialog(null, "Ha ganado O!");
            }
            ronda = false;
        }
    }
}

/////////////// REGLAS JUEGO
    
    public boolean estaLleno(JLabel[] posicion) {
        for (JLabel casilla : posicion) {
            if (casilla.getText().isEmpty()) {
                return false; 
            }
        }
        return true; 
    }
    
    public void reinicioJuego(){
        for (int i = 0; i < posicion.length; i++) {
            posicion[i].setText("");
            Border border = new LineBorder(new Color(0, 0, 0, 0));
            posicion[i].setBorder(border);
        }
        ronda = true;
        turno = "X";
        txtTurno.setText("");
    }
    
    public void sigienteJuego(){
        turno=siguiente_juego;
        if (siguiente_juego.equals("O")){
            siguiente_juego="X";
        }else {
            siguiente_juego="O";
        }
        txtTurno.setText("Turno de "+turno);
    }
    
    public void comprobarEmpate(){
        if (estaLleno(posicion)== true){
             for (int i=0; i<posicion.length; i++){
            posicion[i].setText("");
            posicion[i].setBackground(Color.white);
            
            sigienteJuego(); 
            cambioEstado();
        }
        }
    }   
}
