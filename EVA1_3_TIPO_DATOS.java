/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_tipo_datos;

/**
 *
 * @author rubra
 */
public class EVA1_3_TIPO_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte pruebaByte; // 1 byte = 8 bits -> 256
        //pruebaByte = 256; //256 no cabe en la variable
        pruebaByte = -127;
        pruebaByte = 127; //acepta de -128 a 127
        pruebaByte = -128;
        
        short pruebaShort; //2 bytes =16 bits = --> 65536
        //pruebaShort = -32768; no cabe
        pruebaShort = -32768;
        pruebaShort = 32767;
        System.out.println(pruebaShort);//imprime la variable
        pruebaShort++;//++ --> operador, suma uno al contenido de variable 
        System.out.println(pruebaShort);
    }
    
}
