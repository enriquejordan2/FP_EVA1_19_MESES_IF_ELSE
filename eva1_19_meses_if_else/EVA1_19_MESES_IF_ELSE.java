/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_meses_if_else;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_19_MESES_IF_ELSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int Mes;
        Scanner captu = new Scanner(System.in);
         System.out.println("Numero corresponda al mes (1-12)");
         Mes = captu.nextInt();
         if(Mes == 1){
             System.out.println("enero");
         }else if (Mes == 2){
                     System.out.println("Febrero");
                     
         }else if (Mes == 3){
                     System.out.println("Marzo");
                }else if (Mes == 4){
                     System.out.println("Abril");
                     }else if (Mes == 5){
                     System.out.println("Mayo");
                     }else if (Mes == 6){
                     System.out.println("Junio");
                     }else if (Mes == 7){
                     System.out.println("Julio");
                     }else if (Mes == 8){
                     System.out.println("Agosto");
                     }else if (Mes == 9){
                     System.out.println("Septiembre");
                     }else if (Mes == 10){
                     System.out.println("Octubre");
                     }else if (Mes == 11){
                     System.out.println("Noviembre");
                     }else if (Mes == 12){
                     System.out.println("Diciembre");
                     }else{
                         System.out.println("MES INVALIDO ");
                     
         }
    }
 
}


    

