# ☕Diagrama de Classes do Projeto

## 📄 Integrantes 

<details>
  <summary>Clique para expandir a lista de integrantes</summary>
  
  - Pedro Antônio
  - Vinícius Moraes
  - Bruno Correa
</details>
  
 ## ✅Requisitos A

<details>
  <summary>Clique para expandir a lista de tarefas</summary>
  
  - [x] Programa estruturado em classes de acordo com o princípio de encapsulamento
  - [x] Mínimo de 5 classes
  - [x] 1 classe Abstrata
  - [x] 1 método Abstrato
  - [x] Total de 10 atributos e 10 métodos
  - [x] Duas relações de herança entre classes
  - [ ] Um método sobrescrito por uma subclasse(abstração não vale)
  - [x] Ao menos, uma chamada polimórfica de método (exemplo do Som de Animal)
  - [ ] uma relação de associação entre 2 classes (exemplo da comida com Animal)
  - [X] Ao menos, uma coleção de objetos (ArrayList)
</details>
  
## ☑Requisitos B
<details>
<summary>Clique para expandir a lista de tarefas</summary>

   - [X] Uma classe derivada do Exception
   - [x] Interface gráfica
   - [ ] ler dados de um arquivo csv ou txt
   - [ ] recuera e salva objetos persistentes
  
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

