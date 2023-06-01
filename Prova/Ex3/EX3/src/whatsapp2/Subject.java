package whatsapp2;



public interface Subject{
    public void notificar(String mensagem, Observer pessoa);
    public void adicionar(Observer observer);
    public void remover(Observer observer);

}
