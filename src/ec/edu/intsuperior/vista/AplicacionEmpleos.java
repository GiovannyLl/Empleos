/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Futbolista;
import ec.edu.intsuperior.modelo.Persona;

/**
 *
 * @author USER
 */
public class AplicacionEmpleos {
    
    public static void main(String[] args) {
       Futbolista ft1 = new Futbolista();
       ft1.setCedula(1711698900);
        System.out.println("Datos del Futbolista"+ft1.getCedula());
    }
    
}
