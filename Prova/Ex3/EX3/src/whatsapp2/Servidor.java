package whatsapp2;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements Subject{
    private List<Observer> listaPessoas = new ArrayList<>();    

    public Servidor(List<Observer> lst) {
        listaPessoas = lst;
    }
    public Servidor(Observer pessoa) {
        this.listaPessoas.add(pessoa);
    }

    @Override
    public void notificar(String mensagem, Observer pessoa) {
        System.out.println(listaPessoas.get(listaPessoas.size() - 1) + " enviou : " + mensagem);
        for(Observer o : listaPessoas){
            if(o != pessoa)
                pessoa.atualizar(o, mensagem);
        }
    }

    @Override
    public void adicionar(Observer observer) {
        listaPessoas.add(observer);
    }

    @Override
    public void remover(Observer observer) {
        listaPessoas.remove(observer);
    }



    public List<Observer> getListaPessoas() {
        return listaPessoas;
    }



    public void setListaPessoas(List<Observer> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    
  
}
