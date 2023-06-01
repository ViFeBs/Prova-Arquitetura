

import java.util.ArrayList;
import java.util.List;

import whatsapp2.Observer;
import whatsapp2.Servidor;
import whatsapp2.Subject;
import whatsapp2.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        List<Observer> lst = new ArrayList<>();
        Subject servidor = new Servidor(lst);

        Observer pessoa1 = new Usuario("Bruno", 2,servidor);
        pessoa1.escrever("Teste1", servidor);

        Observer pessoa2 = new Usuario("Bruno2", 2,servidor);
        pessoa2.escrever("Teste", servidor);
        Observer pessoa3 = new Usuario("Bruno3", 2,servidor);
        pessoa3.escrever("Teste 2", servidor);
    }
}
