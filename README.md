# ☕Diagrama de Classes do Projeto

## 📄 Integrantes 

<details>
  <summary>Clique para expandir a lista de integrantes</summary>
  
  - Pedro Antônio
  - Vinícius Moraes
  - Bruno Correa
</details>





```mermaid

classDiagram
    class Menu {
        - Desligar()
        - Confirmar()
        - Selecionar()
    }

    class Bebidas {
        - Filtrar()
        - Tamanho()
        - Adoçar()
    }

    class Cappuccino {
        <<Bebidas>>
        
    }

    class Expresso {
        <<Bebidas>>
        // Implementação específica de Expresso
    }

    class Chá {
        <<Bebidas>>
        // Implementação específica de Chá
    }

    class Milkshake {
        <<Bebidas>>
        // Implementação específica de Milkshake
    }

    class Mochaccino {
        <<Bebidas>>
        // Implementação específica de Mochaccino
    }

   
    Cappuccino --|> Bebidas : Herda
    Expresso --|> Bebidas : Herda
    Chá --|> Bebidas : Herda
    Milkshake --|> Bebidas : Herda
    Mochaccino --|> Bebidas : Herda

