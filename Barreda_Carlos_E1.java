
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author David Barreda
 */
public class Barreda_Carlos_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int menu = 0;
        Scanner lea = new Scanner(System.in);

        while(menu != 5){
            System.out.println("----MENU----");
            System.out.println("(1) Piramide");
            System.out.println("(2) El mayor");
            System.out.println("(3) Venta de Television digital");
            System.out.println("(4) Caracteres vocales");
            System.out.println("(5) Salir");
            System.out.print("=");
            menu = lea.nextInt();

            switch(menu){

                case 1:
                    
                    System.out.println("Bienvenido a piramide");
                    try{
                    int iteracion = 0, suma = 0, espacio = 0, numero = 1;

                    System.out.println("Ingrese la cantidad de fila ");
                    int fila = lea.nextInt();

                    for (iteracion = 1; iteracion <= fila; iteracion++) {
                        suma = 0;

                        for (espacio = 1; espacio <= iteracion; espacio++) {
                            System.out.print(numero + " ");
                            suma += numero;
                            numero += 2;
                        }

                        System.out.println("= " + suma);
                    }
                    }catch(Exception e){
                        System.out.println("Caracter invalido");
                    }
                    break;

                case 2:
                    System.out.println("Bienvenido al numero MAYOR");
                    try{
                    boolean estado = true;
                    int numeroingresado = 0, sumaNumeros = 0, conteo = 0, mayor = 0;
                    String respuesta = "SI";

                    while(estado){
                        System.out.println("Ingrese un numero: ");
                        numeroingresado = lea.nextInt();

                        sumaNumeros += numeroingresado;
                        conteo++;
                        
                        if(conteo ==1 || numeroingresado > mayor){
                            mayor = numeroingresado;
                            
                        }
                        
                        System.out.println("Desea agregar numeros? (SI/NO): ");
                        respuesta = lea.next().toUpperCase();
                        
                        if(respuesta.equals("NO")){
                            estado = false;
                        }
                        
                    }    
                        double promedio = sumaNumeros/ conteo;
                        
                        System.out.println("El numero mayor es: " + mayor);
                        System.out.println("El numero promedio es: "+ promedio);
                        System.out.println(" ");
                    }catch(Exception e){
                        System.out.println("Caracter incorrecto");
                    }  
                    break;

                       

                case 3:
                    
                    int HD = 0, normal = 0, subtotal = 0;
                    String salida = "SI";
                    System.out.println("Ingrese el nombre de cliente: ");
                    String nombre = lea.next();
                    boolean estadocliente = true;
                    while(estadocliente){
                        System.out.println("Tipo de canal:"
                                + " HD o Normal");
                        String canal =lea.next().toUpperCase();
                        if(canal.equals("HD")){
                            HD++;
                            subtotal+= 30;
                        }else if(canal.equals("NORMAL")){
                            normal++;
                            subtotal+= 20;
                        }else{
                            System.out.println("Canal no valido");
                            
                        }
                        
                        System.out.println("Desea ingresar otro canal(SI/NO):");
                        salida = lea.next().toUpperCase();
                        
                        if(salida.equals("NO")){
                            estadocliente = false;
                            
                        }
                        
                    }
                    System.out.println("Cajas digitales: ");
                        System.out.println("LIGHTBOX");
                        System.out.println("HDBOX");
                        System.out.println("DVRBOX");
                        System.out.println("Seleccione una opcion: ");
                        String caja = lea.next().toUpperCase();
                        
                        if(caja.equals("LIGHTBOX")){
                            subtotal += 50;
                            
                        }else if(caja.endsWith("HDBOX")){
                            subtotal += 100;
                        }else if(caja.equals("DVRBOX")){
                            subtotal += 150;
                        }
                    
                    System.out.println("----FACTURA----");
                    if(HD>0){
                        System.out.println("Canales HD:"+ HD);
                    }
                    if(normal>0){
                        System.out.println("Canales normales: "+ normal);
                    }
                    double impuesto = subtotal*0.15 + subtotal;
                    System.out.println("Subtotal: "+ subtotal);
                    System.out.println("Total a pagar (15% impuesto): " + String.format("%.2f", impuesto));
                    
                break;

                
                case 4:
                    
                    System.out.println("Contador de vocales");
                    System.out.println("Ingrese una palabra");
                    String palabra = lea.next();
                    int lectura = 0;
                    int contador= 0;
                    
                    for(lectura =0; lectura< palabra.length();lectura++){
                        char vocal = palabra.charAt(lectura);
                        
                        switch(vocal){
                            case 'a':
                                contador++;
                            break;    
                            case 'e':
                                contador++;
                            break;    
                            case 'i':
                                contador++;
                            break;    
                            case 'o':
                                contador++;
                            break;    
                            case 'u':
                                contador++; 
                            break;    
                            
                                
                        }
                       
                    }
                    System.out.println("Cantidad de vocales: "+ contador);
                    break;
                    
                case 5:
                    System.out.println("Cerrando programa");
                    System.out.println("Hasta luego");
                    break;

                
            }
            
        }
        
        
    }
    
}
