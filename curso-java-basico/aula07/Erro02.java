class Erro02 {

    public static void main (String[] args) {
        // var int cont;    // Vai dar erro de Semântica. Essa variável não foi inicializada. Não é assim que declaramos variávels no Java.
        int cont = 0;       // Erro corrigido. Variável inicializada.

        System.out.println("Você digitou: " + cont);
    }
}