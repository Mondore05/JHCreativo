public class pruebaVectores {
    public static void main(String[] args) {

        String inventario1 [] = new String[2];
        String inventario2 [] = new String[2];
    
        String tipoR[] = new String[]{"franela","camisa","sueter"};
        String tipoT[] = new String[]{"malla","cola de dragon","prepucio"};
    
        int vectorAux[] = new int[]{1,1};

        inventario1 [0] = "ropa 1";
        inventario1 [1] = "ropa 2";
        
        inventario2 [0] = "tela 1";
        inventario2 [1] = "tela 2";

        int pedido1 [] = new int[2];
        pedido1 [0] = 1;
        pedido1 [1] = 0;
 
        //forma de mostrar las propiedades 
    for (int i = 0; i < vectorAux.length; i++) {
        if (i == 0) {
            System.out.println(tipoR[vectorAux[0]]);
        }
        if (i == 1) {
            System.out.println(tipoT[vectorAux[1]]);;
        }
    }

        //inventario 1 
/*        for (int i = 0; i < 2; i++){

            if (i == pedido1[0]) {
                System.out.println(inventario1[i]);
            }
        }

        //inventario 2
         
        for (int i = 0; i < 2; i++){

            if (i == pedido1[1]) {
                System.out.println(inventario2[i]);
            }
        } */
    }
}