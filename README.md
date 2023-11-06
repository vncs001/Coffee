# ☕Diagrama de Classes do Projeto

## 📄 Integrantes 

<details>
  <summary>Clique para expandir a lista de integrantes</summary>
  
  - Pedro Antônio
  - Vinícius Moraes
  - Bruno Correa
</details>

## ✅Requisitos

<details>
  <summary>Clique para expandir a lista de tarefas</summary>
  
  - [ ] Programa estruturado em classes de acordo com o princípio de encapsulamento
  - [ ] Mínimo de 5 classes
  - [ ] 1 classe Abstrata
  - [ ] 1 método Abstrato
  - [ ] Total de 10 atributos e 10 métodos
  - [ ] 
  - [ ]
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

