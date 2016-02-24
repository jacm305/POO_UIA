

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] alumnos = new String[10];
        double[] calificaciones = new double[10];
        String[] notas1 = new String [10];
        String[] notas2 = ("suspenso", "bien", "notable", "sobresaliente");
        int i = 0;

    try{
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
            
            if (calificaciones[i] >= 0 && califiaciones[i] <= 4.99) {
                notas1[i] = notas2[0];
                notas2[i] = sc.nextLine();
            }
                else if (calificaciones[i] >= 5 && califiaciones[i] <= 6.99) {
                    notas1[i] = notas2[1];
                    notas2[i] = sc.nextLine();
                }
                    else if (calificaciones[i] >= 7 && califiaciones[i] <= 8.99) {
                        notas1[i] = notas2[2];
                        notas2[i] = sc.nextLine();
                    }
                        else if (calificaciones[i] >= 9 && califiaciones[i] <= 10) {
                            notas1[i] = notas2[3];
                            notas2[i] = sc.nextLine();
                        }

    }
            catch (Exception e) {

                System.out.println("Ingrese solo valores entre 0 y 10");
            }

                System.out.println("Alumnos: " + alumnos[i] + calificaciones[i] + notas1[i] );
            }
        }
    }
}
