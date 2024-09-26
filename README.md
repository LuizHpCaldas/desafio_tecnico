
# Desafio Técnico - Target Sistemas

Este repositório contém as soluções para o desafio técnico de estágio na **Target Sistemas**. As soluções foram implementadas em **Java** e abordam problemas como cálculo de sequência de Fibonacci, contagem de letras, lógica de sequência, e mais.

## Estrutura do Projeto

O projeto está dividido em diferentes classes, cada uma resolvendo um dos problemas propostos no desafio técnico.

```plaintext
desafio_tecnico/
│
├── src/
│   └── desafio_tecnico/
│       ├── FibonacciCheck.java          # Verifica se um número pertence à sequência de Fibonacci
│       ├── ContagemLetraA.java          # Conta a ocorrência da letra 'a' (maiúscula ou minúscula)
│       ├── SomaIndice.java              # Calcula a soma com base no loop dado
│       ├── SequenciaLogica.java         # Resolve as sequências lógicas propostas
│       └── Main.java                    # Classe opcional para testes
│
├── .gitignore
├── README.md                            # Explicação do projeto
└── pom.xml                              # Caso use Maven (opcional)
```

## Descrição das Soluções

### 1. FibonacciCheck.java

Este programa calcula a sequência de Fibonacci até um número informado e verifica se ele pertence à sequência. Ele recebe o número através do `Scanner` e realiza a verificação.

- **Exemplo de uso**:
  - Input: `8`
  - Output: `8 pertence à sequência de Fibonacci.`

### 2. ContagemLetraA.java

Este programa verifica se a letra 'a' (maiúscula ou minúscula) aparece em uma string informada e conta a quantidade de ocorrências.

- **Exemplo de uso**:
  - Input: `"Java é uma linguagem de programação"`
  - Output: `A letra 'a' ocorre 5 vezes.`

### 3. SomaIndice.java

Este programa simula o processamento de uma variável `SOMA` e `K` com base no loop descrito na questão 3. Ele calcula o valor final de `SOMA` após a execução.

- **Resultado**:
  - A variável `SOMA` terá o valor final de **77** após o loop.

### 4. SequenciaLogica.java

Esta classe resolve diferentes tipos de sequências lógicas propostas no desafio, completando os próximos elementos:

- **a)** Sequência de números ímpares: **1, 3, 5, 7, _9_**
- **b)** Sequência de potências de 2: **2, 4, 8, 16, 32, 64, _128_**
- **c)** Sequência de quadrados perfeitos: **0, 1, 4, 9, 16, 25, 36, _49_**
- **d)** Quadrados perfeitos dos pares: **4, 16, 36, 64, _100_**
- **e)** Sequência de Fibonacci: **1, 1, 2, 3, 5, 8, _13_**
- **f)** Alternância entre pares e ímpares: **2, 10, 12, 16, 17, 18, 19, _20_**

### 5. Main.java (Opcional)

Esta classe é opcional e pode ser utilizada para testar todas as implementações de forma centralizada. Ela permite chamar as funções de cada classe e exibir os resultados para facilitar a validação.

## Como Executar o Projeto

### 1. Clonar o Repositório

Para clonar o repositório, execute o seguinte comando no terminal:

```bash
git clone https://github.com/seuusuario/desafio-target-sistemas.git
```

### 2. Importar o Projeto na IDE

Abra sua IDE favorita (IntelliJ IDEA, Eclipse, NetBeans) e importe o projeto Java apontando para a pasta clonada.

### 3. Executar Cada Classe

Execute as classes individualmente para testar suas respectivas funcionalidades:

- **FibonacciCheck.java**: Verifica se um número pertence à sequência de Fibonacci.
- **ContagemLetraA.java**: Conta quantas vezes a letra 'a' aparece em uma string.
- **SomaIndice.java**: Calcula a soma conforme o loop descrito.
- **SequenciaLogica.java**: Resolve os desafios de sequência lógica.

### 4. Executar Main.java (Opcional)

A classe `Main.java` pode ser usada para testar todas as implementações de uma só vez. Ela chama cada função e exibe os resultados para facilitar a avaliação.

---

### Informações Adicionais

Caso tenha alguma dúvida ou necessidade de ajuste, fique à vontade para entrar em contato. Este projeto foi desenvolvido com o objetivo de demonstrar habilidades técnicas em Java e solucionar os problemas propostos no desafio da **Target Sistemas**.
