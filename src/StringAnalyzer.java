/**
 * Classe para analisar a ocorrência da letra 'a' em uma string.
 */
public class StringAnalyzer {

    private String text;

    /**
     * Construtor padrão.
     */
    public StringAnalyzer() {}

    /**
     * Construtor que recebe uma string para análise.
     *
     * @param text Texto a ser analisado.
     */
    public StringAnalyzer(String text) {
        this.text = text;
    }

    /**
     * Obtém o texto a ser analisado.
     *
     * @return Texto para análise.
     */
    public String getText() {
        return text;
    }

    /**
     * Define o texto a ser analisado.
     *
     * @param text Texto para análise.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Verifica se a string contém a letra 'a' (maiúscula ou minúscula).
     *
     * @return {@code true} se a string contém a letra 'a', caso contrário {@code false}.
     */
    public boolean containsLetterA() {
        if (text == null || text.isEmpty()) {
            return false;
        }

        // Verifica se o texto contém 'a' ou 'A'
        return text.toLowerCase().contains("a");
    }

    /**
     * Conta quantas vezes a letra 'a' (maiúscula ou minúscula) aparece na string.
     *
     * @return Quantidade de ocorrências da letra 'a'.
     */
    public int countLetterA() {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int count = 0;
        // Percorre cada caractere da string
        for (char c : text.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    /**
     * Retorna uma representação em String do objeto StringAnalyzer.
     *
     * @return Representação da análise do texto.
     */
    @Override
    public String toString() {
        return "Texto: \"" + text + "\"" +
                "\nContém a letra 'a'? " + (containsLetterA() ? "Sim" : "Não") +
                "\nOcorrências da letra 'a': " + countLetterA();
    }
}