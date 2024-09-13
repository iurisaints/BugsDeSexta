### Enunciado:

Na cultura popular, a **Sexta-feira 13** é considerada um dia de azar. Sua tarefa é criar um script em JavaScript que verifique se um dado ano terá uma Sexta-feira 13.

Você deve implementar uma função que, dado um ano, retorne todos os meses que têm uma Sexta-feira 13. Além disso, a função deve calcular quantas **Sextas-feiras 13** existem no ano.

Sua solução deve funcionar de acordo com as seguintes regras:
1. Verifique se o dia 13 de cada mês é uma sexta-feira.
2. Se for, adicione o mês correspondente a um array de meses que têm Sexta-feira 13.
3. Retorne o array dos meses e a quantidade total de Sextas-feiras 13.

### Entradas e saídas esperadas:

- **Entrada**: Um ano fornecido pelo usuário.
- **Saída esperada**:
    - Um array com os meses que têm Sexta-feira 13.
    - O número total de Sextas-feiras 13 no ano.

#### Exemplo:

- **Entrada**: `2023`
- **Saída esperada**:
    ```javascript
    {
      mesesComSexta13: ["Janeiro", "Outubro"],
      totalSexta13: 2
    }
    ```