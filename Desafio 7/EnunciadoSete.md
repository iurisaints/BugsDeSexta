Aqui está o enunciado padronizado para o **Desafio 03** das **Olimpíadas de Bugs**, utilizando **Java**, conforme a estrutura dos exemplos anteriores:

---

### Enunciado:

O **imposto** é um tributo pago pelos cidadãos para custear o setor público e as atividades relacionadas, incluindo serviços básicos como saúde, educação, e segurança. O **INSS** e o **IRRF** incidem diretamente sobre o salário do trabalhador, sendo descontados da folha de pagamento. Um aluno do curso Técnico em Desenvolvimento de Sistemas implementou uma classe `ImpostosSalario` em Java, com o objetivo de estimar o total devido em uma remuneração, considerando deduções para dependentes.

Devido a um erro de codificação, o sistema não está retornando corretamente os valores descontados de INSS e IRRF, bem como o salário líquido. Sua tarefa é corrigir o código para que o cálculo seja feito corretamente.

### Entradas:
1. **Salário Base**: R$ 8.000,00, **Dependentes**: 2
2. **Salário Base**: R$ 2.450,00, **Dependentes**: 1
3. **Salário Base**: R$ 17.800,00, **Dependentes**: 0

### Saídas esperadas:
1. **Valor descontado de INSS**: R$ 938,82, **Valor descontado de IRRF**: R$ 952,59, **Salário Líquido**: R$ 6.108,59
2. **Valor descontado de INSS**: R$ 199,32, **Valor descontado de IRRF**: R$ 0,00, **Salário Líquido**: R$ 2.250,68
3. **Valor descontado de INSS**: R$ 908,86, **Valor descontado de IRRF**: R$ 3.760,10, **Salário Líquido**: R$ 13.131,04
