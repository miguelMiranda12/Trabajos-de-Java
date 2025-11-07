import java.util.Scanner;

public class funcionesEp2 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean superoPruebaLaberinto;

    // Método principal: ejecuta el episodio y devuelve true o false
    public static void mostrarEventoTunel(){
        System.out.println("Al cruzar la puerta, te encuentras en un túnel de piedra. \n" +
                "Dos caminos se abren frente a ti. En cada uno hay una versión diferente de ti mismo:\n " +
                "Uno parece más fuerte. \n" +
                "Otro, más sabio. \n" +
                "Sientes que cada camino representa una parte de ti.\n" +
                " Pero también puedes buscar otra salida. \n" +
                "\n" +
                "Opciones: \n" +
                "A: Seguir al Lior fuerte \n" +
                "B: Seguir al Lior sabio \n" +
                "C: Buscar un tercer camino por su cuenta");

        System.out.print("Elige una opción: ");
    }

    public static boolean determinarCaminoTunel(String caminoElegido) {

        switch (caminoElegido) {
            case "A" : pruebaLiorFuerte();
                break;
            case "B" : pruebaLiorSabio();
                break;
            case "C" : pruebaLiorSolo();
                break;
            default : System.out.println("Opción no válida. Debes elegir A, B o C.");
            return false;
        }

        return superoPruebaLaberinto;
    }

    // --- FUNCIONES DE LOS CAMINOS ---

    public static void pruebaLiorFuerte() {
        System.out.println("Recorres pasajes pesados y oscuros. Llegas a una sala con paredes móviles. \n" +
                "Quedas atrapado entre muros que se abren y cierran automáticamente. \n" +
                "Para escapar, debes calcular el momento justo en que podrás cruzarlos.\n" +
                "“Un muro se abre cada 15 segundos. El primero se abre en el segundo 0.\n " +
                "Hay 8 muros seguidos. \n" +
                "Si cruzas cada uno justo cuando se abre, ¿cuánto tiempo tardarás en total?” \n" +
                "\n" +
                "Opciones:\n " +
                "A. 105 segundos \n" +
                "B. 120 segundos \n" +
                "C. 90 segundos \n" +
                "D. 150 segundos");

        System.out.print("Tu respuesta: ");
        String respuesta = sc.nextLine().trim().toUpperCase();

        if (respuesta.equals("B")) {
            superoPruebaLaberinto = true;
        }
    }

    public static void pruebaLiorSabio() {
        System.out.println("Sigues al Lior sabio hasta una sala con símbolos antiguos.\n " +
                "En el centro, una inscripción mágica brilla con este acertijo:\n" +
                "“Soy la hermana de la noche, el ojo de los poetas,\n " +
                "cuento los ciclos, pero nunca hablo.”\n" +
                "¿Qué soy? \n" +
                "\n" +
                "Opciones: \n" +
                "A. Reloj \n" +
                "B. Estrella \n" +
                "C. Luna \n" +
                "D. Tiempo");

        System.out.print("Tu respuesta: ");
        String respuesta = sc.nextLine().trim().toUpperCase();

        if (respuesta.equals("C")) {
            superoPruebaLaberinto = true;
        }
    }

    public static void pruebaLiorSolo() {
        System.out.println(" Te adentras solo por una grieta en el muro.\n " +
                "Llegas a una sala con un espejo. Al mirarte, tu reflejo cobra vida y te dice:\n" +
                "“Para avanzar, debes enfrentar tu mayor miedo.” \n" +
                "\n" +
                "Opciones:\n " +
                "A. La oscuridad\n" +
                "B. El fracaso \n" +
                "C. La soledad");

        System.out.print("Elige una opción: ");
        String miedo = sc.nextLine().trim().toUpperCase();
        if (miedo.equals("C,B,A")){
            System.out.println("opcion incorrecta");
            superoPruebaLaberinto = false;
        }

        superoPruebaLaberinto = true;
    }
}