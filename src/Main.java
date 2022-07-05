/*
Crie uma estrutura de classes para simular o envio de uma mensagem por e-mail, mas, antes de enviar a mensagem,
disponibilizar diversos tipos de formatações. A mensagem pode ser enviada com nenhuma, uma ou mais de uma das
seguintes formatações

    Formatar tudo em maiúsculo
    Formatar tudo em minúsculo
    Formatar em camelCase
    Remover acentuação

 */

public class Main {
    public static void main(String[] args) {
        Frase f1 = new Frase();
        f1.setEntrada("tinha suspirado, tinha beijado o papel devotamente! Era a primeira vez que lhe escreviam aquelas sentimentalidades, e o seu orgulho dilatava-se ao calor amoroso que saía delas, como um corpo ressequido que se estira num banho tépido; sentia um acréscimo de estima por si mesma, e parecia-lhe que entrava enfim numa existência superiormente interessante, onde cada hora tinha o seu encanto diferente, cada passo condizia a um êxtase, e a alma se cobria de um luxo radioso de sensações!");
        System.out.println(f1.tudoMaiusculo());
        System.out.println(f1.tudoMinusculo());
        System.out.println(f1.camelCase());
        System.out.println(f1.retiraAcentos());
    }
}