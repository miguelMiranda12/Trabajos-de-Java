import java.util.ArrayList;
import java.util.Scanner;

public class programaPrincipal {
    public static void main(String[] args) {
        boolean gameOver = false; //

        String nombreArchivo = "diario.txt";
        archivo.crearArchivo(nombreArchivo);
        archivo.escribirArchivo(nombreArchivo, "\n" +
                "resumen del juego:\n" +
                "\n" +
                "\n");
        archivo.escribirArchivo(nombreArchivo, "Empieza la aventura\n");

        do {
            ArrayList<Integer> OpcionesSeleccionadas = new ArrayList<>();
            boolean TieneGema = false;
            gameOver = false;

            funcionesEp1.mostrarEventoBosque();

            // Primer pregunta Episodio 1
            while (!OpcionesSeleccionadas.contains(2)) {
                funcionesEp1.mostrarEventoInicial(OpcionesSeleccionadas);
                int OpcionSeleccionada = utilidades.leerEntero();
                OpcionesSeleccionadas.add(OpcionSeleccionada);

                funcionesEp1.evaluarOpcionSeleccionada(OpcionSeleccionada);

                // Episodio 1 parte 2
                if (OpcionSeleccionada == 2) {
                    TieneGema = true;
                    System.out.println("has recogido la gema azul. Ahora puedes acercarte a la puerta.");
                    archivo.escribirArchivo(nombreArchivo, "Obtuviste la gema azul en el bosque.\n");
                }
            }

            // Episodio 1 parte 3
            if (TieneGema) {
                boolean numeroResuelto = funcionesEp1.acertijoNumerico();
                boolean reflejoResuelto = funcionesEp1.acertijoReflejo();
                funcionesEp1.finalesEp1(numeroResuelto, reflejoResuelto);
                archivo.escribirArchivo(nombreArchivo, "completaste los acertijos del bosque.\n");

                if (!numeroResuelto || !reflejoResuelto) {
                    System.out.println("has fallado. Reiniciando el juego");
                    gameOver = true;
                    continue;
                }
            }

            // Episodio 2
            funcionesEp2.mostrarEventoTunel();
            boolean resultado = funcionesEp2.determinarCaminoTunel(utilidades.leerString());

            if (!resultado) {
                System.out.println(" no superaste el laberinto. Reiniciando el juego\n");
                gameOver = true;
                continue;
            } else {
                System.out.println("has superado el laberinto\n");
                archivo.escribirArchivo(nombreArchivo, "superaste el laberinto con exito\n");
            }


            //episodio 3
            boolean eleccionFinal = false;
            boolean respuesta = false;

            String opcionElegida = funcionesEp3.primeraEleccionEp3(funcionesEp2.sc);

            //elije las puertas
            respuesta = funcionesEp3.preguntaLogica(funcionesEp2.sc);

            eleccionFinal = funcionesEp3.procesarFinalEp3(opcionElegida, respuesta);

            if (eleccionFinal) { //mejor final
                System.out.println("Has alcanzado el conocimiento supremo");
                archivo.escribirArchivo(nombreArchivo, "alcanzate el conocimiento supremo\n");
                System.out.println("FINAL");

            } else {
                gameOver = true;
            }



            // episodio 4
            String eleccion;

            funcionesEp4.mostrarEventoIniciaParte4();

            eleccion = funcionesEp4.mostrarOpcionesParte4();

            funcionesEp4.procesarEleccionParte4(eleccion);

            funcionesEp4.mostrarResultadoParte4(eleccion);
            archivo.escribirArchivo(nombreArchivo,"Te despertaste del sueño y descubrite que sos jugador de boca\n");


            archivo.leerArchivo(nombreArchivo);




        }   while (gameOver);

    }
}

