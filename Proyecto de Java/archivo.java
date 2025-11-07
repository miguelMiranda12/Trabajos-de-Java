import java.io.*;

public class archivo {
    public static void crearArchivo(String nombreArchivo){
        try{
            BufferedWriter archivo = new BufferedWriter(new FileWriter(nombreArchivo));
            archivo.close();
        } catch (IOException e) {
            System.out.println("Error al crear archivo");
        }
    }

    public static void escribirArchivo(String nombreArchivo, String texto){
        try{
            BufferedWriter escribir = new BufferedWriter(new FileWriter(nombreArchivo,true));
            escribir.write(texto);
            escribir.close();
        }catch (IOException e){
            System.out.println("Error al escribir archivo");
        }
    }

    public static void leerArchivo(String nombreArchivo){
        try{
            BufferedReader leer = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = leer.readLine()) != null){
                System.out.println(linea);
            }
        }catch (IOException e){
            System.out.println("Error al leer archivo");
        }
    }
}
