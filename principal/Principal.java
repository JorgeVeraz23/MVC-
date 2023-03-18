/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import controlador_1.Controlador;
import modelo_1.Modelo;
import vista_1.Vista;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args){
        Vista vista1 = new Vista();
        Modelo modelo1 = new Modelo();
        Controlador controlador = new Controlador(vista1, modelo1);
        
        vista1.setVisible(true);
    }
}
