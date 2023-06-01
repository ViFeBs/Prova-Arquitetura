

public class App {
    public static void main(String[] args) throws Exception {
        int[] v = {5,3,5,6,8,9};

        Ordenacao o = (v1 -> {
            int aux = 0;
            for (int i = 0; i < v1.length - 1; i++) {
                for (int j = 0; j < v1.length - i - 1; j++) {
                    if (v1[j] > v1[j + 1]) { 
                        aux = v1[j];
                        v1[j] = v1[j + 1];
                        v1[j + 1] = aux;
                    }
                }
            }           
        });
        o.ordenar(v);
        o.exibir(v);
    }
}
