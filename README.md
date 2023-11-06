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
        // Implementação específica de Cappuccino
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

    Menu --|> Bebidas : Herda
    Cappuccino --|> Bebidas : Herda
    Expresso --|> Bebidas : Herda
    Chá --|> Bebidas : Herda
    Milkshake --|> Bebidas : Herda
    Mochaccino --|> Bebidas : Herda

