import java.util.ArrayList;
import java.util.Scanner;

public class funcionesEp1 {
    public static void mostrarEventoBosque() {
        System.out.println("Te despiertas en el claro de un bosque. Todo está en calma, excepto por una\n" +
                "enorme puerta de piedra frente a ti. En ella hay una inscripción:\n" +
                "“Solo los sabios, los valientes y los justos pasarán.”\n" +
                "Una voz resuena en tu cabeza:\n" +
                "“Para salir del bosque, debes probar tu valía. La puerta solo se abrirá si tomas las\n" +
                "decisiones correctas.”");
    }

    public static void mostrarEventoInicial(ArrayList<Integer> opcionesSeleccionadas) {
        System.out.println("\n¿Qué haces?");

        if (!opcionesSeleccionadas.contains(1)) {
            System.out.println("1. Inspeccionar la puerta");
        }
        if (!opcionesSeleccionadas.contains(2)) {
            System.out.println("2. Explorar el bosque cercano");
        }
        if (!opcionesSeleccionadas.contains(3)) {
            System.out.println("3. Esperar y observar el entorno en silencio");
        }
    }

    public static void MostrarResultadoOpcionA() {
        System.out.println("No ocurre nada todavía. Se guarda la observación como pista.");
    }

    public static void mostrarResultadoOpcionB() {
        System.out.println("Mientras exploras, un cuervo aparece sobre una rama. Te observa fijamente, y\n" +
                "deja caer una gema azul a tus pies.\n" +
                "La recoges. Tal vez encaje en la puerta…");
    }

    public static void mostrarResultadoOpcionC() {
        System.out.println("Permaneces en silencio. Luego de un rato, un viejo sabio aparece entre los\n" +
                "árboles.\n" +
                "Te dice: “La gema está cerca, pero solo si sabes dónde buscar.”");
    }

    public static void evaluarOpcionSeleccionada(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 1:
                MostrarResultadoOpcionA();
                break;
            case 2:
                mostrarResultadoOpcionB();
                break;
            case 3:
                mostrarResultadoOpcionC();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    // Acertijo numérico
    public static boolean acertijoNumerico() {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        System.out.println("Soy un número de tres cifras.");
        System.out.println("La suma de mis cifras es 18.");
        System.out.println("La cifra del medio es 2 veces la última.");
        System.out.println("La primera cifra es 3 más que la última.");
        System.out.println("¿Qué número soy?\n");


        System.out.println("1) 693");
        System.out.println("2) 381");
        System.out.println("3) 621");
        System.out.println("4) 954");
        System.out.print("Elige opción (1-4): ");

        int opciones = sc.nextInt();
        if (opciones == 3) {
            System.out.println("Correcto, la puerta se abre");
            correcto = true;

        } else System.out.println("La puerta permanece cerrada");


        return correcto;
    }

    //Acertijo Reflejo
    public static boolean acertijoReflejo() {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        System.out.println("\nEl sabio aparece nuevamente:");
        System.out.println("“Una última prueba. No hay entrada sin entendimiento.”");
        System.out.println("\"Me puedes ver en el agua,");
        System.out.println("pero no me puedes tocar.");
        System.out.println("Siempre estoy contigo,");
        System.out.println("pero solo cuando hay luz.\"");


        System.out.println("\nOpciones:");
        System.out.println("1. Un reflejo");
        System.out.println("2. Una sombra");
        System.out.println("3. El viento");
        System.out.println("4. Un suspiro");
        System.out.print("Elige opción (1-4): ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¡Correcto! La puerta se abre y puedes continuar...");
                correcto = true;
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Incorrecto... la puerta permanece cerrada.\n");
                break;
            default:
                System.out.println("Opción no válida. Intenta de nuevo.\n");
        }


        return correcto;
    }

    public static boolean finalesEp1(boolean acertijoNumero, boolean acertijoReflejo) {
        System.out.println("\n---- FINAL DE LA AVENTURA ----");

        if (acertijoNumero && acertijoReflejo) {
            System.out.println("FINAL BUENO");
            System.out.println("Has completado ambos acertijos y un portal aparece...");
            return true;
        } else if (acertijoNumero || acertijoReflejo) {
            System.out.println("FINAL NEUTRAL");
            System.out.println("Solo has completado una parte del desafío...");
            return true;
        } else {
            System.out.println("FINAL FALLIDO");
            System.out.println("No lograste resolver los acertijos...");
            return false;
        }
    }
}
