import java.util.Scanner;

public class pruebaMochila {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int vectorAux[] = new int[3];
        int pedidos = 1;
        int r = 1;
        boolean respuesta = true;
        int mochila1[] = new int[3];
        int mochila2[] = new int[3];
        int mochila3[] = new int[3];

        do {
            vectorAux = mochila(pedidos, mochila1, mochila2, mochila3);
            llenarVector(pedidos, vectorAux);
            mochilaReverse(pedidos, vectorAux, mochila1, mochila2, mochila3);
            System.out.println(mochila1[0]);
            // mostrarResultado(pedidos, mochila1, mochila2, mochila3);

            System.out.println("¿desea ingresar otro pedido? 0: no, 1: si");
            r = scanner.nextInt();

            if (r == 0) {
                respuesta = false;
            } else {
                pedidos++;
            }

        } while (respuesta == true);

        mostrarResultado(pedidos, mochila1, mochila2, mochila3);
    }

    private static void llenarVector(int pedidos, int[] vectorAux) {
        for (int i = 0; i <= 2; i++) {
            i++;
            System.out.println("ingrese la posicion " + i + " del vector " + pedidos);
            i--;
            vectorAux[i] = scanner.nextInt();
        }
    }

    public static int[] mochila(int pedidos, int[] mochila1, int[] mochila2, int[] mochila3) {

        switch (pedidos) {

            case 1:
                return mochila1;

            case 2:
                return mochila2;

            default:
                return mochila3;
        }

    }

    public static void mochilaReverse(int pedidos, int[] vectorAux, int[] mochila1, int[] mochila2, int[] mochila3) {

        switch (pedidos) {
            case 1:
                mochila1 = vectorAux;
                break;
            case 2:
                mochila2 = vectorAux;
                break;
            case 3:
                mochila3 = vectorAux;
                break;
        }
    }

    private static void mostrarResultado(int pedidos, int[] mochila1, int[] mochila2, int[] mochila3) {

        if (pedidos >= 1) {
            System.out.println("mochila 1");
            for (int i = 0; i <= 2; i++) {
                System.out.print(mochila1[i] + ",");
            }
        }
        if (pedidos >= 2) {
            System.out.println("");
            System.out.println("mochila 2");
            for (int i = 0; i <= 2; i++) {
                System.out.print(mochila2[i] + ",");
            }
        }
        if (pedidos >= 3) {
            System.out.println("");
            System.out.println("mochila 2");
            for (int i = 0; i <= 2; i++) {
                System.out.print(mochila3[i] + ",");
            }
            System.out.println("mochilas llenas");
        }

    }
}
