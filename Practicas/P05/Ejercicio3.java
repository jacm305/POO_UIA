

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] alumnos = new String[10];
        double[] calificaciones = new double[10];
        String[] notas = new String [10];
        int i = 0;

        
        System.out.println("Lista de Alumnos: ");
        System.out.print("Alumno " + (i + 1) + ": ");
        alumnos[i] = sc.nextLine();
        System.out.print("Calificacion: ");
        calificaciones[i] = sc.nextDouble();

        
        for (i = 1; i < alumnos.length; i++) {
            sc.nextLine(); 
            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = sc.nextLine();
            System.out.print("Calificacion: " + (i + 1) + " ");
            calificaciones[i] = sc.nextDouble();
            
            if (calificaciones[i] <= 4.99) {
                //System.out.println(alumnos[i] + calificaciones[i] +"....");
                //notas[i] = sc.nextLine();
                //if (calificaciones [i] = 5 || calificaciones[i] < 6.99){
                  //  System.out.println(alumnos[i] + calificaciones[i] + "bien");
                    //notas[i] = sc.nextLine();
                    //if (calificaciones [i] = 7 || calificaciones [i] < 8.99){
                      //  System.out.println(alumnos[i] + calificaciones[i] + "notable");
                        //notas[i] = sc.nextLine();
                        //if (calificaciones [i] = 9 || calificaciones [i] = 10){
                          //  System.out.println(alumnos [i] + calificaciones [i] + "sobresaliente");
                            //notas[i] = sc.nextLine();
                       // }
                   // }
               // }
            System.out.println("Alumnos: " + alumnos[i] + calificaciones[i] + notas[i] );
            }
        }

        //mostrar resultados
        
        //System.out.println("Sueldo: " + mayorSueldo);
    }
}
