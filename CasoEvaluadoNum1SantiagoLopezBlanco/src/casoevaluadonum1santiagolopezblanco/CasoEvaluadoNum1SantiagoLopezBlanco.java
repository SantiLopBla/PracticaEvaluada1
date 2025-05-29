/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluadonum1santiagolopezblanco;

import javax.swing.JOptionPane;

/**
 *
 * @author sanlo
 */
public class CasoEvaluadoNum1SantiagoLopezBlanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Santiago López Blanco
          Universidad Fidélitas
          Introduccion a la Programacion
          Practica Evaluada 1
          28/7/2025
         */

        double salInd = 0; //Inicializar las variables
        double sEM = 0;
        double iVM = 0;
        double aSO = 0;
        double restSal = 0;
        double abCCSS = 0;
        String leer;

        leer = JOptionPane.showInputDialog(null, "Ingrese su salario individual: "); //Se ingresa el salario del usuario
        salInd = Integer.parseInt(leer); //Pasar de String a Integer

        sEM = salInd * 0.0925; //calculo del SEM
        iVM = salInd * 0.0508; //calculo del IVM
        restSal = salInd - sEM - iVM; //calculo del resto de salario
        abCCSS = sEM + iVM; //calculo de lo que la CCSS recibe
        aSO = restSal * 0.025; //Calculo de la asociacion

        //Imprimir variables
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de " + abCCSS + "por concepto de SEM y IVM.");
        JOptionPane.showMessageDialog(null, "Para la asociación de la empresa se le asigna un valor de " + aSO);
    }

}
