import java.io.*;
import java.io.BufferedReader; 
import java.io.InputStreamReader;


public class Calculadora { 


        public Calculadora() { //Creamos un metoo donde se almacenan las operaciones
        } 

            public double suma(double a, double b){ //se crea la metodo suma 
            return a + b;                       // se regresa la operacion de suma 
            } 

                public double resta(double a, double b){ 
                return a - b; 
                } 

                    public double multiplicacion(double a, double b){ 
                    return a * b; 
                    } 

                        public double division(double a, double b){ 
                        if(b > 0){                              //Para hacer la division comprobamos 
                        return a / b;                           //que b sea mayor que cero, para poder 
                            } else {                            //realizar la operacion
                                return 0; 
                            } 
                        } 

    public static void main(String a[]){ 

        int opcion = 0;                          //Declaramos una variable para alamacenar las opciones 
        Calculadora objeto = new Calculadora(); 
            
            do{
                try{ 
                    while(true){  //declaramos un while (true) para validar que se cumpla la condicion, 
                                  //si se da otro valor sale del ciclo

                        System.out.println("Menu:"); 
                        System.out.println("\t1\tSumar"); 
                        System.out.println("\t2\tRestar"); 
                        System.out.println("\t3\tMultiplicar"); 
                        System.out.println("\t4\tDividir"); 
                        System.out.println("\t5\tSalir"); 

                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //para alamacenar  
                        opcion = Integer.parseInt(br.readLine());                 //la opcion que deseamos ejecutar

                            System.out.println("La opcion que elegiste es:" + opcion);

                            if(opcion > 0 && opcion < 5){     //if para comparar que se ingrese un numero 
                                                            //mayor a 0 y menor a 5
                                System.out.println("Ingrese primer numero:"); 
                                double n1 = Double.parseDouble(br.readLine()); 

                                System.out.println("Ingrese segundo numero:"); 
                                double n2 = Double.parseDouble(br.readLine()); 

                                switch(opcion){       //condicion donde almacenamos las opciones (casos)

                                    case 1: 
                                        System.out.println("\n\t\tEl resultado es: " + objeto.suma(n1, n2) + "\n"); 
                                    break; 

                                        case 2: 
                                            System.out.println("\n\t\tEl resultado es: " + objeto.resta(n1, n2) + "\n"); 
                                        break; 

                                            case 3: 
                                                System.out.println("\n\t\tEl resultado es: " + objeto.multiplicacion(n1, n2) + "\n"); 
                                            break; 

                                                case 4: 
                                                    System.out.println("\n\t\tEl resultado es: " + objeto.division(n1, n2) + "\n"); 
                                                break; 

                                                    default: 
                                                    break; 
                                } 
                            } 
                                else { 
                                     System.exit(0); //Sale del programa
                                } 
                    } 
                }
                    catch(Exception e){                                                    
                        e.printStackTrace(); 
                        System.out.println("Caracter no valido, ingrese una opcion valida");
                        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
                        //opcion = Integer.parseInt(br.readLine());
                    } 
            }
            while (opcion!=0 || opcion!=1 || opcion!=2 || opcion!=3 || opcion!=4 || opcion!=5 );
    } 
} 
