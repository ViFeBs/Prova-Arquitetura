import java.util.ArrayList;

@FunctionalInterface
public interface Ordenacao {
    public void ordenar(int[] v);

    default void exibir(int[] v){
        for(int c : v){
            System.out.println(c);
        }
    }
}
