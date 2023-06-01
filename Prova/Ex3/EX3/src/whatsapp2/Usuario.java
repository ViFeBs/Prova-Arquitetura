package whatsapp2;


public class Usuario implements Observer{
    private String nome;
    private int id;

    public Usuario(String nome, int id, Subject servidor) {
        this.nome = nome;
        this.id = id;
        servidor.adicionar(this);
    }

    @Override
    public void atualizar(Observer observer, String mensagem) {
       System.out.println(observer.toString() + " viu: " + mensagem);
    }
    @Override
    public void escrever(String mensagem, Subject servidor) {
        servidor.notificar(mensagem, this);
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario: " + nome;
    }
    
}
