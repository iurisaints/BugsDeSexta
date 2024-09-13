### Enunciado:
Um campeonato de futebol envolve 4 times, e cada time jogará uma única vez contra cada um dos outros times. Cada vitória vale 3 pontos, empate 1 ponto e derrota 0 pontos. Sua tarefa é criar um sistema que calcule a pontuação final de cada time após todas as partidas.

Regras:
1. O programa recebe um array de partidas, onde cada partida é representada por um array com o nome dos dois times e o resultado do jogo.
2. O resultado do jogo será um objeto com as propriedades `golsTimeA` e `golsTimeB`, indicando a quantidade de gols de cada time na partida.
3. Se o time A marcar mais gols que o time B, o time A vence. Se marcarem a mesma quantidade de gols, ocorre um empate.

Seu objetivo é calcular e exibir a tabela de classificação com os nomes dos times e seus respectivos pontos.

### Entradas e saídas esperadas:

- Entrada:
    ```typescript
    const partidas = [
        { timeA: "Time 1", timeB: "Time 2", resultado: { golsTimeA: 2, golsTimeB: 1 } },
        { timeA: "Time 3", timeB: "Time 4", resultado: { golsTimeA: 0, golsTimeB: 0 } },
        { timeA: "Time 1", timeB: "Time 3", resultado: { golsTimeA: 3, golsTimeB: 1 } },
        { timeA: "Time 2", timeB: "Time 4", resultado: { golsTimeA: 2, golsTimeB: 2 } },
        { timeA: "Time 1", timeB: "Time 4", resultado: { golsTimeA: 0, golsTimeB: 1 } },
        { timeA: "Time 2", timeB: "Time 3", resultado: { golsTimeA: 1, golsTimeB: 3 } }
    ];
    ```

- Saída esperada:
    ```typescript
    [
        { time: "Time 1", pontos: 6 },
        { time: "Time 2", pontos: 2 },
        { time: "Time 3", pontos: 7 },
        { time: "Time 4", pontos: 5 }
    ]
    ```
