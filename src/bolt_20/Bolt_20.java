package bolt_20;

import java.util.*;
import libros.Libro;
import libros.Metodos;

/**
 *
 * @author agonzalezacevedo
 */
public class Bolt_20 {

    public static void main(String[] args) {
        ArrayList<Libro> libro = new ArrayList();
        Metodos obx = new Metodos();
        int resposta;

        do {
            System.out.println("\n------Menu------"
                            + "\n 1.-Crear libro."
                            + "\n 2.-Vender libro."
                            + "\n 3.-Mostrar libros."
                            + "\n 4.-Dar de baixa un libro se has unidades son 0."
                            + "\n 5.-Ordenar."
                            + "\n 0.-Saír.");
            Scanner sc = new Scanner(System.in);
            resposta = sc.nextInt();
            switch (resposta) {
                case 1:
                    libro.add(obx.crearLibro());
                    break;
                case 2:
                    obx.venderLibro(libro);
                    break;
                case 3:
                    obx.amosar(libro);
                    break;
                case 4:
                    obx.darBaixa(libro);
                    break;
                case 5:
                    obx.consultarLibro(libro);
                    break;
            }
        } while (resposta != 0);

    }
}
