# Desafios de Lógica e Programação

Este repositório contém soluções em Java e texto para uma série de exercícios de lógica e programação.

## Exercícios

**1. Sequência de Fibonacci:**

Verifica se um número fornecido pertence à sequência de Fibonacci. O número é definido no código-fonte da classe `Main`, mas pode ser facilmente modificado para receber entrada do usuário. A solução utiliza a classe `Fibonacci` que calcula a sequência e verifica a pertinência do número.

**2. Analisador de String:**

Analisa uma string para verificar a ocorrência da letra 'a' (maiúscula ou minúscula) e conta quantas vezes ela aparece. A string é definida no código-fonte da classe `Main`, mas pode ser alterada para receber input externo. A solução é implementada na classe `StringAnalyzer`.

**3. Valor da Variável SOMA:**

Determina o valor final da variável `SOMA` após a execução de um trecho de código fornecido. A resposta (SOMA = 77) está detalhada na seção "Respostas" deste README.

**4. Lógica de Sequências:**

Completa o próximo elemento de diversas sequências numéricas, identificando a lógica por trás de cada uma. As respostas estão detalhadas na seção "Respostas" deste README.

**5. Desafio dos Interruptores:**

Propõe uma solução para o problema dos três interruptores e três lâmpadas, explicando como identificar qual interruptor controla qual lâmpada com apenas duas idas à sala das lâmpadas. A resposta está detalhada na seção "Respostas" deste README.

## Respostas
1. Implementado na classe `Fibonacci` e demonstrado na classe `Main`.
2. Implementado na classe `StringAnalyzer` e demonstrado na classe `Main`.
3. O valor da variável SOMA é 77.
4.
    a) 9 (Sequência de números ímpares consecutivos)
    b) 128 (Cada número é o dobro do anterior)
    c) 49 (Sequência dos quadrados perfeitos)
    d) 100 (Números pares ao quadrado)
    e) 13 (Sequência de Fibonacci)
    f) 20?
5. Ligue o interruptor A por 5 minutos e desligue-o. Ligue o interruptor B. Vá até a sala das lâmpadas. A lâmpada acesa corresponde ao interruptor B. A lâmpada apagada e quente corresponde ao interruptor A. A lâmpada apagada e fria corresponde ao interruptor C.


## Classes

* **`Fibonacci`**:  Contém métodos para gerar a sequência de Fibonacci, verificar a pertinência de um número à sequência e gerar a sequência até um determinado número.
* **`StringAnalyzer`**:  Contém métodos para analisar uma string e verificar a ocorrência e a quantidade de vezes que a letra 'a' aparece.
* **`Main`**: Classe principal que demonstra o uso das classes `Fibonacci` e `StringAnalyzer`.

## Como Executar

Para compilar e executar o código, você precisará de um ambiente Java Development Kit (JDK) instalado.

1. **Clone o repositório:** `git clone https://github.com/Laion459/test_TargetSistemas`
2. **Navegue até o diretório:** `cd [nome do diretório]`
3. **Compile o código:** `javac Main.java Fibonacci.java StringAnalyzer.java`
4. **Execute o código:** `java Main`


## Observações

O código foi escrito com comentários explicativos para facilitar a compreensão.  As classes `Fibonacci` e `StringAnalyzer` foram projetadas com encapsulamento e seguindo boas práticas de programação orientada a objetos.
