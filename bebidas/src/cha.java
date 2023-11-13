import java.util.ArrayList;
import java.util.List;

enum Temperatura {
    QUENTE,
    FRIO
}
public class cha {

    private Temperatura temperatura;
    private List<String> sabor;


    // Construtor da classe
    public cha() {
        this.temperatura = Temperatura.QUENTE;
        this.sabor = new ArrayList<>();

        inicializarSabores();
    }

    // Método privado para inicializar a lista de sabores disponíveis
    private void inicializarSabores() {
        sabor.add("Camomila");
        sabor.add("Hortelã");
        sabor.add("Frutas Vermelhas");
        sabor.add("Chá Verde");
        sabor.add("Gengibre");
    }

    // Método para definir a temperatura do chá
    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    // Método para escolher o sabor do chá


    // Método para obter a temperatura do chá
    public Temperatura getTemperatura() {
        return temperatura;
    }

    // Método para obter o sabor do chá
    public List<String> getSabor() {
        return sabor;
    }

}
