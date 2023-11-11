public class Aula4Recursividade {

    public static void main(String[] args) {
       // repercucao(10);
        System.out.println(fatRec(5));

    }


    private static int fatRec(int valor) {
        if (valor==1);
        return 1;
        return valor * fatRec(valor-1);
    }

    private static int fat(int valor) {
        for (int i = valor-1; i > 0; i--) {
            valor = valor * i;

        }

        return valor;
    }

    private static void repercucao(int contador) {
        System.out.println(contador);
        contador = contador-1;
        if (contador == 0) {
            return;
        }
        repercucao(contador);

    }
}
