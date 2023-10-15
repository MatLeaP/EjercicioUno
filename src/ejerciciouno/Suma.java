/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciouno;

import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class Suma {
    
    int numeroUno;
    int numeroDos;
    int resultado;
    
    public void ingresarNumeros(){
        
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    }
    
    public void suma(){
        
        resultado = numeroUno + numeroDos;
    }
    
    public void mostrarResultado(){
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
}
