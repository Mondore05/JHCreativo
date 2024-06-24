public class pruebaVectores {
    public static void main(String[] args) {

        String inventario1 [] = new String[2];
        String inventario2 [] = new String[2];

        inventario1 [0] = "ropa 1";
        inventario1 [1] = "ropa 2";
        
        inventario2 [0] = "tela 1";
        inventario2 [1] = "tela 2";

        int pedido1 [] = new int[2];
        pedido1 [0] = 1;
        pedido1 [1] = 0;
        
        //inventario 1 
        for (int i = 0; i < 2; i++){

            if (i == pedido1[0]) {
                System.out.println(inventario1[i]);
            }
        }

        //inventario 2
         
        for (int i = 0; i < 2; i++){

            if (i == pedido1[1]) {
                System.out.println(inventario2[i]);
            }
        }
    }
}