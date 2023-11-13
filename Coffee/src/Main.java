public class Main {
    public static void main(String[] args) {
        Cappuccino meuCappuccino = new Cappuccino();

        System.out.println("Tamanho: " + meuCappuccino.tamanho);
        System.out.println("Nome: " + meuCappuccino.nome);

        meuCappuccino.filtrar(" " + meuCappuccino.nome + " ");
        meuCappuccino.adocar();
        meuCappuccino.adicionarCanela();
    }
}



