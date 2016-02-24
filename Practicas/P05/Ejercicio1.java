import java.io.*;
public class Ejercicio1{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(isr);
        int num, media;
        int suma=0;
       
       do{
            System.out.println("Define el Tamaño del Arreglo:");
            num = Integer.parseInt(flujoE.readLine());

            if (num<=0){
                  System.out.println("Valor incorrecto, ingrse otro numero");
            }

        }
            while(num%2==0);
                  
            
                int a[] = new int[num];
                System.out.println("Ingresa los numeros para el Arreglo");
        
                for (int i =0; i < num; i++){
        
                    System.out.println("Valor "+ i + ":");
                    a[i] = Integer.parseInt(flujoE.readLine());
                    suma=suma +a[i];
                }
                    int mayor=a[0];     
                    int menor=a[0];
                    for(int m = 0; m < a.length; m++){ 
                        if(a[m] > mayor)
                            mayor = a[m]; 
                                if(a[m] < menor)
                                    menor = a[m];       
                    }
                        media=a.length-1;
        
                        System.out.println("El Valor de la Media es:" + a[media/2]);   
    }
}