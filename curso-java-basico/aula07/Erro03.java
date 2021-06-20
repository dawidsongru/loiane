class Erro03 {      // O Java é Case Sensitive (maiúsculo é diferente de minúsculo)
                                                        // Abaixo, 2 Erros em Tempo de Execução.
    public static void main (String[] args) {           // O método main é o ponto de entrada. Corrigido.
    // public static void Main (String[] args) {        // O método Main maiúsculo até compila, mas dá erro ao executar.
    // public static void Main (String args[]) {        // [] Colchetes no final até funciona, mas não é uma boa prática.
        System.out.println("Você digitou: ");           // 
        // System.out.println("Você digitou: + 1/0");   // O Java não aceita divisão por 0 (zero)
    }
}