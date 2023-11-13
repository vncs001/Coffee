import java.util.ArrayList;
import java.util.List;

public class milkShake {

    // Lista de sabores
    private List<String> sabores;

    // Construtor da classe
    public milkShake() {
        // Inicializa a lista de sabores no construtor
        this.sabores = new ArrayList<>();
        InicializarSabores();
    }

    // Método para adicionar um sabor à lista

    // Método para obter a lista de sabores


    private void InicializarSabores(){
        sabores.add("Morango");
        sabores.add("Chocolate");
        sabores.add("Baunilha");
        sabores.add("Caramelo");
        sabores.add("Banana");
    }

    public List<String> getSabores() {
        return sabores;
    }


}
