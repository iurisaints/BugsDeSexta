Aqui está o enunciado padronizado para o desafio das **Olimpíadas de Bugs** utilizando **Java**, seguindo o mesmo formato dos outros exemplos:

---

### Enunciado:

A **educação financeira** envolve o aprendizado de como lidar com dinheiro de forma consciente e eficiente, visando o uso adequado dos recursos financeiros para alcançar prosperidade. Um aluno do curso Técnico em Desenvolvimento de Sistemas implementou uma classe `AplicDepositoRegular` em **Java** para estimar o valor final de um investimento com depósitos regulares, de acordo com uma fórmula de juros compostos mensais.

A fórmula para o cálculo do valor final (Sn) de um investimento com depósitos regulares é:

\[ Sn = p \left( \frac{{(1 + j)^n - 1}}{j} \right) \]

Onde:
- **n** = Número de meses do investimento
- **j** = Taxa de juros mensal
- **p** = Valor do depósito regular
- **Sn** = Valor total obtido ao final do período

Contudo, devido a um erro no código, o sistema não retorna o valor esperado para o montante final da aplicação. Sua tarefa é corrigir o código para que ele calcule o valor corretamente, de acordo com as entradas e saídas fornecidas.

### Entradas:
1. Número de meses: 100, Taxa de juros mensal: 0,15, Valor do depósito regular: 100
2. Número de meses: 50, Taxa de juros mensal: 0,2, Valor do depósito regular: 200
3. Número de meses: 36, Taxa de juros mensal: 0,09, Valor do depósito regular: 800

### Saídas esperadas:
1. R$ 10.796,42
2. R$ 10.527,07
3. R$ 29.284,59