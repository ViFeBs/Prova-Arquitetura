package subSistema;

import java.util.ArrayList;
import java.util.List;

public final class Base {
    private static List<Cliente> lstCliente = new ArrayList<>();
    private static List<Produto> lstProdutos = new ArrayList<>();

    public static void cadastrar(String nome, String rua, int numero){
        lstCliente.add(new Cliente(nome,new Endereco(rua, numero),lstProdutos));
    } 

    public static boolean realizarPedido(int id){
        if(!lstProdutos.isEmpty()){
            Cliente aux = new Cliente();
            for(Cliente c : lstCliente){
                if(c.getId() == id){
                    aux = c;
                    break;
                }
                return false;
            }
            aux.setLista(lstProdutos);
        }
        System.out.println("Para Realizar um pedido é nescessario adicionar produtos");
        return false;
    }

    public static void gerarCupomFiscal(int id){
        if(!lstProdutos.isEmpty()){
            Cliente aux = new Cliente();
            for(Cliente c : lstCliente){
                if(c.getId() == id){
                    aux = c;
                }
            }
            System.out.println(aux.toString());
        }else{
            System.out.println("Para Gerar um Cupom Fiscal é nescessario adicionar produtos");
        }
        
    }

    public static void adicionarProdutos(String nome, String categoria, double preco){
        if(!lstCliente.isEmpty()){
            lstProdutos.add(new Produto(nome, categoria, preco));
        }else{
            System.out.println("Para Adicionar Produtos é nescessario adicionar um Cliente");
        }
    }
}
