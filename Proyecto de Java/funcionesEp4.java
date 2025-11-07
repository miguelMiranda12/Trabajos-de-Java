import java.util.Scanner;

public class funcionesEp4 {

        public static void mostrarEventoIniciaParte4() {
        System.out.println("Abrís los ojos entre el ruido de los bombos y los cantos de la hinchada.");
        System.out.println("Ya no hay torre ni figuras misteriosas: estás jugando para Boca.");
        System.out.println("Es el día del superclásico contra River. te encuentras la pelota a 3/4 de cancha\n" +
                "y tu compañero te dice:");
        System.out.println("'Lior, apurate haz algo rapido . ¿que es lo que vas a hecer?'\n");
    }

        public static String mostrarOpcionesParte4() {
            String[] opciones = {
                    "A. Patear al arco.",
                    "B. Dar un pase a cavani.",
                    "C. Regatear a toda la defensa.",
                    "D. Juegas la pelota para atras y te organizas."
            };

            for (int i = 0; i < opciones.length; i++) {
                System.out.println(opciones[i]);
            }

            System.out.print("\nElegí una opción (A, B, C o D): ");
            String eleccion = utilidades.leerString().trim().toUpperCase();

            return eleccion;
        }

        public static void procesarEleccionParte4(String eleccion) {
            switch (eleccion) {
                case "A":
                    System.out.println("Decides patear al arco y la pelota viaja directo al angulo haciendo un golazo");
                    break;

                case "B":
                    System.out.println("das una asistencia perfecta para tu compañero cavani dejandolo solo en frente del arco\n" +
                            "pero no logra controlar bien la pelota");
                    break;

                case "C":
                    System.out.println("Tomás la pelota y decides empezar a regatar a la defensa del equipo rival \n" +
                            "y logras que te hagan una falta al borde del area");
                    break;

                case "D":
                    System.out.println("Decides dar un pase hacia la defensa asi logras acomodarte en tu posicion\n" +
                            "y vuelven a armar la jugada ");
                    break;

                default:
                    System.out.println("Te quedás inmovil y te roban la pelota. Tienes la posibilidad de volver a elejir una opcion");
            }
        }

       public static void mostrarResultadoParte4(String eleccion){
        System.out.println("\nEl árbitro pita el final del partido... la Bombonera estalla.\n");

           if (eleccion.equals("A")) {
               System.out.println("Decidiste patear al arco desde fuera del área en el minuto 90,\n" +
                       "clavás un gol al ángulo. ¡Boca gana el superclásico 2-1!");
           } else if (eleccion.equals("D")) {
               System.out.println("Al armar la jugada lograron dejar solo a Merentiel para que convierta el gol de la victoria ganando 2-1.");
           } else if (eleccion.equals("B")) {
               System.out.println("Cavani no logra controlar la pelota y pierde una oportunidad única, terminan empatando 1-1.");
           } else if (eleccion.equals("C")) {
               System.out.println("Decides hacerte cargo del tiro libre... con una buena pegada lograste convertir un golazo ganando el partido 1-0.");
           } else {
               System.out.println("Te quedás inmóvil y el rival recupera la pelota. Fin del partido.");
           }


           System.out.println("\nLa torre tal vez fue un sueño... o quizás, el comienzo de algo más grande.\n" +
                "¡Aguante BOCA BOCA! ");

    }
}
