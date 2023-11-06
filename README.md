classDiagram
    class Menu {
        + Desligar()
        + Confirmar()
        + Selecionar()
    }

    class Bebidas {
        + Filtrar()
        + Tamanho()
        + Adoçar()
    }

    class Cappuccino {
        // Implementação dos métodos específicos de Cappuccino
    }

    class Expresso {
        // Implementação dos métodos específicos de Expresso
    }

    class Chá {
        // Implementação dos métodos específicos de Chá
    }

    class Milkshake {
        // Implementação dos métodos específicos de Milkshake
    }

    class Mochaccino {
        // Implementação dos métodos específicos de Mochaccino
    }

    Menu --|> Bebidas
    Cappuccino --|> Bebidas
    Expresso --|> Bebidas
    Chá --|> Bebidas
    Milkshake --|> Bebidas
    Mochaccino --|> Bebidas
