Aqui está o enunciado padronizado para o desafio envolvendo o sistema de criaturas, utilizando **JavaScript** ou **TypeScript**:

---

### Enunciado:

Você está criando um sistema para gerenciar criaturas que podem **aparecer** e **atacar**. Há uma interface chamada `Criatura` que define os comportamentos básicos que todas as criaturas devem ter, como os métodos **aparecer** e **atacar**. Além disso, existe uma classe `Monstro` que implementa essa interface, e uma classe `Lobisomem` que herda de `Monstro`.

No entanto, a implementação da classe `Lobisomem` não está respeitando corretamente a funcionalidade completa esperada, causando problemas no comportamento da criatura. Sua tarefa é corrigir o código para garantir que a classe `Lobisomem` respeite todos os comportamentos da interface `Criatura` e da classe `Monstro`.

### Entradas:
1. Uma criatura deve ser capaz de **aparecer** e **atacar**, implementando esses métodos.
2. O **Lobisomem** deve herdar corretamente as funcionalidades de **Monstro**, mas com comportamentos específicos ao aparecer e atacar.

### Saída esperada:
A criatura `Lobisomem` deve:
1. Exibir uma mensagem específica ao **aparecer** (por exemplo: "Lobisomem apareceu sob a lua cheia").
2. Exibir uma mensagem ao **atacar** (por exemplo: "Lobisomem ataca ferozmente").
