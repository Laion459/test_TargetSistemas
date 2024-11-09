//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício N° 1 ");
        System.out.println("Teste N° 1 ");
        Fibonacci fibonacci = new Fibonacci(21);
        System.out.println(fibonacci);

        System.out.println("Teste N° 2 ");
        Fibonacci fibonacci1 = new Fibonacci(56);
        System.out.println(fibonacci1);

        System.out.println("\n#############################\n");

        System.out.println("Exercício N° 2 ");

        System.out.println("Teste N° 1 ");
        StringAnalyzer stringAnalyzer = new StringAnalyzer("As linguagens de programação são algo incrível!");
        System.out.println(stringAnalyzer);

        System.out.println("Teste N° 2 ");
        StringAnalyzer stringAnalyzer1 = new StringAnalyzer("Bananas são frutas ricas em potasio!");
        System.out.println(stringAnalyzer);
    }
}