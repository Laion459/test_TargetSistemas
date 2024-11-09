/**
 * Classe para operações relacionadas à sequência de Fibonacci.
 */
public class Fibonacci {

    private int numberForSequence;

    /**
     * Construtor padrão.
     */
    public Fibonacci() {}

    /**
     * Construtor com parâmetro para definir o número da sequência.
     *
     * @param numberForSequence Número para verificação na sequência de Fibonacci.
     */
    public Fibonacci(int numberForSequence) {
        if (numberForSequence < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }
        this.numberForSequence = numberForSequence;
    }

    /**
     * Obtém o número para verificação.
     *
     * @return Número para sequência de Fibonacci.
     */
    public int getNumberForSequence() {
        return numberForSequence;
    }

    /**
     * Define o número para verificação na sequência.
     *
     * @param numberForSequence Número para sequência de Fibonacci.
     */
    public void setNumberForSequence(int numberForSequence) {
        if (numberForSequence < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }
        this.numberForSequence = numberForSequence;
    }

    /**
     * Verifica se o número da instância pertence à sequência de Fibonacci.
     *
     * @return {@code true} se o número pertence à sequência, caso contrário {@code false}.
     */
    public boolean isFibonacci() {
        int a = 0, b = 1, temp;

        // Verificar se o número é 0 ou 1 (pertencem à sequência)
        if (numberForSequence == 0 || numberForSequence == 1) {
            return true;
        }

        // Gera a sequência de Fibonacci até alcançar ou ultrapassar o número informado
        while (b <= numberForSequence) {
            if (b == numberForSequence) {
                return true;
            }
            temp = a + b;
            a = b;
            b = temp;
        }

        return false;
    }

    /**
     * Gera a sequência de Fibonacci até o número definido na instância.
     *
     * @return String contendo a sequência de Fibonacci.
     */
    public String generateSequence() {
        StringBuilder sequence = new StringBuilder();
        int a = 0, b = 1, temp;

        sequence.append("0");

        while (b <= numberForSequence) {
            sequence.append(", ").append(b);
            temp = a + b;
            a = b;
            b = temp;
        }

        return sequence.toString();
    }

    /**
     * Retorna uma representação em String do objeto Fibonacci.
     *
     * @return Representação da sequência e se o número pertence ou não a ela.
     */
    @Override
    public String toString() {
        return "Número: " + numberForSequence +
                "\nPertence à sequência de Fibonacci? " + (isFibonacci() ? "Sim" : "Não") +
                "\nSequência até " + numberForSequence + ": " + generateSequence();
    }
}