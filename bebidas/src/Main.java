import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-Vindo a máquina de Bebidas! Qual Bebida prefere tomar?");
        System.out.println("> CHA");
        System.out.println("> MilkShake");

        String opcao = scanner.nextLine();

        switch (opcao.toLowerCase()){
            case "cha":
                // Exemplo de uso da classe Cha
                cha meuCha = new cha();

                // Definindo a temperatura e escolhendo o sabor

                try {
                    System.out.println("Defina a temperatura de seu Chá, você quer QUENTE ou FRIO?");
                    String definirtemp = scanner.nextLine();
                    if (definirtemp.toLowerCase().equals("frio")) {
                        meuCha.setTemperatura(Temperatura.FRIO);
                    } else if (definirtemp.toLowerCase().equals("quente")) {
                        meuCha.setTemperatura(Temperatura.QUENTE);
                    } else {
                        throw new EscolhaInvalidaException("Insira uma resposta de Quente ou Frio!");
                    }
                }
                catch (EscolhaInvalidaException e) {
                // Capturando e tratando a exceção personalizada
                System.out.println("Erro: " + e.getMessage());
                }

                try {
                    // Solicitando ao usuário que insira um número correspondente a um sabor
                    System.out.println("Escolha um número para um sabor de Cha:");
                    for (int i = 0; i < meuCha.getSabor().size(); i++) {
                        System.out.println((i + 1) + ". " + meuCha.getSabor().get(i));
                    }

                    // Lendo a entrada do usuário
                    String escolhaCha = scanner.nextLine();

                    // Convertendo a escolha para um número
                    int escolha = Integer.parseInt(escolhaCha);

                    // Verificando se a escolha está dentro dos limites da lista
                    if (escolha > 0 && escolha <= meuCha.getSabor().size()) {
                        // Obtendo o sabor correspondente e imprimindo
                        String saborEscolhido = meuCha.getSabor().get(escolha - 1);
                        System.out.println("Seu chá " + meuCha.getTemperatura() + " de sabor " + saborEscolhido + " está servido");
                    } else {
                        // Lançando a exceção personalizada
                        throw new EscolhaInvalidaException("Só temos opcoes do 1 ao 5, por favor, insira um numero valido");
                    }
                } catch (EscolhaInvalidaException e) {
                    // Capturando e tratando a exceção personalizada
                    System.out.println("Erro: " + e.getMessage());
                } catch (NumberFormatException e) {
                    // Capturando e tratando a exceção de formato inválido
                    System.out.println("Você inseriu outro valor ao inves de um número, por favor, insira um valor valido.");
                } finally {
                    // Fechando o Scanner no bloco finally para garantir que seja fechado, mesmo em caso de exceção
                    scanner.close();
                }
                // Exibindo informações sobre o chá
                break;

            case "milkshake":
                // Criando uma instância da classe Milkshake
                milkShake meuMilkshake = new milkShake();

                try {
                    // Solicitando ao usuário que insira um número correspondente a um sabor
                    System.out.println("Escolha um número para um sabor de milkshake:");
                    for (int i = 0; i < meuMilkshake.getSabores().size(); i++) {
                        System.out.println((i + 1) + ". " + meuMilkshake.getSabores().get(i));
                    }

                    // Lendo a entrada do usuário
                    String escolhaStr = scanner.nextLine();

                    // Convertendo a escolha para um número
                    int escolha = Integer.parseInt(escolhaStr);

                    // Verificando se a escolha está dentro dos limites da lista
                    if (escolha > 0 && escolha <= meuMilkshake.getSabores().size()) {
                        // Obtendo o sabor correspondente e imprimindo
                        String saborEscolhido = meuMilkshake.getSabores().get(escolha - 1);
                        System.out.println("Seu MilkShake de Sabor " + saborEscolhido + " esta servido");
                    } else {
                        // Lançando a exceção personalizada
                        throw new EscolhaInvalidaException("Só temos opcoes do 1 ao 5, por favor, insira um numero valido");
                    }


                } catch (EscolhaInvalidaException e) {
                    // Capturando e tratando a exceção personalizada
                    System.out.println("Erro: " + e.getMessage());
                } catch (NumberFormatException e) {
                    // Capturando e tratando a exceção de formato inválido
                    System.out.println("Você inseriu outro valor ao inves de um número, por favor, insira um valor valido.");
                } finally {
                    // Fechando o Scanner no bloco finally para garantir que seja fechado, mesmo em caso de exceção
                    scanner.close();
                }
                break;

            default:
                System.out.println("Parece que você inseriu um valor errado, tente de novo");
                break;

        }
    }
}


