/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo_1.Modelo;
import vista_1.Vista;

/**
 *
 * @author USER
 */
public class Controlador implements ActionListener{
    private Vista vista;
    private Modelo model;

    public Controlador(Vista vista, Modelo model) {
        this.vista = vista;
        this.model = model;
        this.vista.btn_suma.addActionListener(this);
        this.vista.btn_resta.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNumero_uno(Integer.parseInt(vista.cajaN1.getText()));
        model.setNumero_dos(Integer.parseInt(vista.cajaN2.getText()));
        if(e.getSource() == vista.btn_suma){
            model.sumar();
            vista.cajaRes.setText(String.valueOf(model.getResultado()));
        }else if(e.getSource() == vista.btn_resta){
            model.restar();
            vista.cajaRes.setText(String.valueOf(model.getResultado()));
        }
    }
    
    
}
