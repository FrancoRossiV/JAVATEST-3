/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.pkg2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        String cna = "";
        
        String[] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
              
        
        

        
        System.out.println("Ingrese un numero correspondiente a la posicion de una letra en el abecedario para agregarla a la cadena comenzando desde 0, ingrese -1 si quiere salir : ");
        Scanner sas = new Scanner(System.in);

        for(int num=0;num!=-1;){
            
            num = sas.nextInt();
            if(num !=-1 && num<=26){
                cna+=letras[num];
            }else if(num>26){
                System.out.println("Error ingrese el numero de nuevo");
            }else{
                break;
            } 
            
            
        }        
                    
                    
         System.out.println(cna);           
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

