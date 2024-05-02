import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersion Java");

        //Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlan = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("evaluacion Promedio: " + evaluacion);
        System.out.println("Incluido en tu plan: " + incluidoEnElPlan);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de evaluacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula Popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver.");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a matrix");
            double notaMatrix = teclado.nextDouble();
             mediaEvaluacionUsuario += notaMatrix;
        }
        System.out.println("la media calculada por el usuario es: " + mediaEvaluacionUsuario / 3);

    }
}