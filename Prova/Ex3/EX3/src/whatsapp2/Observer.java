package whatsapp2;


public interface Observer {
    public void atualizar(Observer observer, String mensagem);
    public void escrever(String mensagem, Subject servidor);
}
