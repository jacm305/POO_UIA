import java.io.*;
import java.util.*;
import java.util.GregorianCalendar;


class Fechas {

    private int dia;
    private int mes;
    private int anio;
    
   
    public static int FechaCorrecto(int fdia,int fmes, int fanio){
            dia=fdia;
            mes=fmes;
            anio=fanio;
                do{ if(anio>=1582){
                            if(anio%100==0 && anio%400==0){
                                if(anio%4==0){
                            if(mes<=12 || mes >=1 ){
                                if(dia>=1 || dia<=31){
                                System.out.println("La Fecha es:"+anio+"/"+mes+"/"+dia+"el año es Bisiesto");
                                if(mes==2){
                                    if(dia>=1 || dia<=29){
                                        System.out.println("La Fecha es:"+anio+"/"+mes+"/"+dia+"el año es Bisiesto");
                                }
                            }
                        }           
                    }
                }
            }   
        }if(anio>=1582){
                        if(mes>=1 || mes<=12){
                            if(dia>=1 || dia<=21){
                                System.out.println("La fecha es:"+anio+"/"+mes+"/"+dia);
                            }
                        }
                    }
            }while(anio!=1582);
            return 0;                            
        }

    public void AsignarFecha(){
           Calendar fecha = new GregorianCalendar();
            this.anio = fecha.get(Calendar.YEAR);
            this.mes = fecha.get(Calendar.MONTH);
            this.dia = fecha.get(Calendar.DAY_OF_MONTH);
            System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + anio);
           
        }
    public void AsignarFecha(int d){
           Calendar fecha = new GregorianCalendar();
            this.anio = fecha.get(Calendar.YEAR);
            this.mes = fecha.get(Calendar.MONTH);
            this.dia = d;
            System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + anio);
           
       }

    public void AsignarFecha(int d, int m){
           Calendar fecha = new GregorianCalendar();
            this.anio = fecha.get(Calendar.YEAR);
            this.mes = m;
            this.dia = d;
            System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + anio);
                       
        }

    public void AsignarFecha(int d, int m, int a){
           Calendar fecha = new GregorianCalendar();
            this.año = a;
            this.mes = m;
            this.dia = d;
            System.out.println("Fecha Actual: " + dia + "/" + (mes+1) + "/" + anio);
                       
        }


    public void printFecha () {
        
        System.out.println(dia + "/" + mes + "/" + anio);

    }

    //constructores

    public Fecha(){

        return 0;//AsignarFecha();
        
    }

    public Fecha(int dia){

        return 0; // AsignarFecha(dia);
        
    }

    public Fecha(int dia, int mes){

        return 0; // AsignarFecha(dia, mes);
        
    }

    public Fecha(int dia, int mes, int anio){

       return 0; //AsignarFecha(dia, mes, anio);
        
    }
      

    
    public class Practica07{
    public static void main(String[] args) {
            int dia;
            int mes;
            int anio;
            
            Scanner reader = new Scanner (System.in);
            

        System.out.println(" Fecha del Sistema ");
        Fecha uno = new Fecha();
        System.out.print("La fecha es: ");
        uno.printFecha();
        System.out.println();

        System.out.println(" Fecha con dia y mes introducido por el usuario .");
        System.out.print("Introduce un dia: ");
        dia = entrada.nextInt();
        System.out.print("Introduce un mes: ");
        mes = entrada.nextInt();
        Fecha tres = new Fecha(dia, mes);
        System.out.print("La fecha es: ");
        tres.printFecha();
        System.out.println();

        System.out.println(" Fecha con dia, mes, año introducido por el usuario .");
        System.out.print("Introduce un dia: ");
        dia = entrada.nextInt();
        System.out.print("Introduce un mes: ");
        mes = entrada.nextInt();
        System.out.print("Introduce un anio: ");
        anio = entrada.nextInt();
        Fecha cuatro = new Fecha(dia, mes, anio);
        System.out.print("La fecha es: ");      
        cuatro.printFecha();
        System.out.println();



                        

        }

}

}