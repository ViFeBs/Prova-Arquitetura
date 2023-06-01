import subSistema.Base;

public class App {
    public static void main(String[] args) throws Exception {
        Base.cadastrar("Bruno", "Rua Amelia Petrela Zuanazzi", 21);
        Base.adicionarProdutos("Leite", "Liquido", 12.40);
        Base.adicionarProdutos("Pão", "Alimento", 2.40);
        Base.gerarCupomFiscal(1);
    }
}
