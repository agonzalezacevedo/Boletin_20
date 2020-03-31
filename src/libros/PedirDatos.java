package libros;

import java.util.Scanner;

/**
 *
 * @author agonzalezacevedo
 */
public class PedirDatos {
    
    public static int pedirInt() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Introduce numero unidades");
        a = sc.nextInt();
        return a;
    }

    public static float pedirFloat() {
        Scanner sc = new Scanner(System.in);
        float b;
        System.out.println("Introduce un precio");
        b = sc.nextFloat();
        return b;
    }

    public static String pedirString() {
        Scanner sc = new Scanner(System.in);
        String c;
        System.out.println("Introduce titulo, autor e ISBN");
        c = sc.nextLine();
        return c;
    }
}
