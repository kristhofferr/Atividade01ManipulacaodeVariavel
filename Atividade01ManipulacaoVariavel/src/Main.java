public class Main {

    public static void main(String[] args) {
        // 1. Declaração de Variáveis
        int idade;
        double altura;
        String nome;
        boolean eEstudante;

        // 2. Atribuição de Valores
        idade = 28; // Exemplo de idade
        altura = 1.65; // Exemplo de altura em metros
        nome = "Ana"; // Exemplo de nome
        eEstudante = true; // Exemplo de status de estudante

        // 3. Operações Simples
        int idade1 = 20;
        int idade2 = 35;
        int somaIdades = idade1 + idade2; // Soma de duas idades

        double fator = 2;
        double alturaDuplicada = altura * fator; // Multiplicação da altura por 2

        String saudacao = "Olá, " + nome + "!"; // Concatenação com saudação

        // 4. Exibição de Resultados
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome);
        System.out.println("É estudante? " + eEstudante);
        System.out.println("Soma de idades: " + somaIdades);
        System.out.println("Altura duplicada: " + alturaDuplicada);
        System.out.println(saudacao);
    }
}
