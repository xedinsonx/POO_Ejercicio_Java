
package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        llenarPoligono();
    
        mostrarResultados();
    }    
    
    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do{
            System.out.println("Digite que poligono desea "); 
            System.out.println("1.Triangulo ");
            System.out.println("2.Retangulo ");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
        }while(opcion<1 || opcion>2);
        
        switch(opcion){
            case 1:
                break;
            case 2:
               break;
               }
        System.out.println("\nDesea Introducir otro Poligono(s/n): ");
        respuesta = entrada.next().charAt(0);
        System.out.println("");
    while(respuesta=='s' || respuesta=='S');
    }
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        
        System.out.println("\nDigite el lado1 del triangulo:");
        lado1 = entrada.nextDouble();
        System.out.println("\nDigite el lado2 del triangulo:");
        lado2 = entrada.nextDouble();
        System.out.println("\nDigite el lado3 del triangulo:");
        lado3 = entrada.nextDouble();

      Triangulo triangulo= new Triangulo(lado1, lado2, lado3);
    
        poligono.add(triangulo);
        
    }
        public static void llenarRectangulo(){
            
            double lado1,lado2;
            
            System.out.println("\nDigite el lado1 del rectangulo: ");
            lado1= entrada.nextDouble();
            System.out.println("\nDigite el lado2 del rectangulo: ");
            lado2= entrada.nextDouble();
            
            Rectangulo rectangulo = new Rectangulo(lado1, lado2);
            
            poligono.add(rectangulo);
        }
        public static void mostrarResultados(){
            for(Poligono poli: poligono){
                System.out.println(poli.ToString());
                System.out.println("Area= "+poli.area());
                System.out.println("");
            }
        }
    }   

