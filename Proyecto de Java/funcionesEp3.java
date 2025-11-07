import java.util.Scanner;

public class funcionesEp3 {

    public static String primeraEleccionEp3(Scanner sc) {
        System.out.println("Una figura encapuchada te espera en la cima de la torre. Su voz retumba como un trueno: \n" +
                "“Lior, has llegado lejos. Pero el conocimiento tiene precio. Debes elegir qué deseas.” \n" +
                "\n" +
                "Opciones: \n" +
                "A. Saber toda la verdad, aunque no puedas cambiarla \n" +
                "B. Tener poder para cambiar el mundo, pero sin comprenderlo todo \n" +
                "C. Volver a tu vida anterior, sin recuerdos de esta aventura");

        String opcion = sc.nextLine().trim().toUpperCase();

        while (!opcion.equals("A") && !opcion.equals("B") && !opcion.equals("C")) {
            System.out.println("Opción no válida. Escribe A, B o C:");
            opcion = sc.nextLine().trim().toUpperCase();
        }

        return opcion;
    }

    public static boolean preguntaLogica(Scanner sc) {
        System.out.println("La figura encapuchada señala tres puertas. \n" +
                "“Una de ellas lleva a la verdad. Las otras a la ilusión. \n" +
                "Frente a cada puerta hay un guardián: uno siempre miente, otro siempre dice la verdad, y el tercero responde al azar. \n" +
                "Puedes hacer una sola pregunta a un solo guardián. \n" +
                "¿Qué preguntarás para elegir la puerta correcta?” ");

        String pregunta = sc.nextLine().toLowerCase();

        String[] palabrasClave = {"puerta", "verdad"};
        boolean contienePalabraClave = false;

        for (String clave : palabrasClave) {
            if (pregunta.contains(clave)) {
                contienePalabraClave = true;
            }
        }

        if (contienePalabraClave) {
            System.out.println("La figura asiente lentamente: “Has comprendido más de lo que parece...”");
            return true;
        } else {
            System.out.println("El encapuchado suspira: “Tus palabras carecen de claridad...”");
            return false;
        }
    }

    public static boolean procesarFinalEp3(String opcion, boolean respuestaLogicaCorrecta) {
        boolean eleccionFinal = false;

        if (opcion.equals("A") && respuestaLogicaCorrecta) {
            eleccionFinal = true;
            System.out.println("La torre se disuelve y accedes a todo el conocimiento oculto del mundo, PERO...");
        } else if (opcion.equals("B")) {
            System.out.println("Obtienes habilidades mágicas para cambiar el mundo, pero el vacío del conocimiento perdido te persigue Y... ");
        } else if (opcion.equals("C")) {
            System.out.println("La torre se cierra. No estabas listo.\nVolverás cuando estés preparado EN ESO... ");
        }

        return eleccionFinal;
    }
}


