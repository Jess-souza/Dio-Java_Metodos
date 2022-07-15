public class Main {

    /**
     * Classe principal dos exercícios da Aula 1 de Métodos, pratica
     */

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(9, 5);
        Calculadora.subtracao(7, 2.5);
        Calculadora.multiplicacao(5, 6);
        Calculadora.divisao(10, 2);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(17);
        Mensagem.obterMensagem(3);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1200, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(900, Emprestimo.getTresParcelas());
        Emprestimo.calcular(3000, 6);
    }
}
