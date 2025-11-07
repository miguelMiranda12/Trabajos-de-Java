import java.util.Scanner;

public class utilidades {
    static Scanner Lector = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);

    public static int leerEntero() {
        return Lector.nextInt();
    }
    public static String leerString(){
        return sc.nextLine().trim().toUpperCase();
    }
}