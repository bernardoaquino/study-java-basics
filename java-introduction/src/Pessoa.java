public class Pessoa extends Ser {
    /**
     * - Herança - A classe que herda vai ter todos os atributos e métodos que não são privados da classe que está sendo herdada
     * Superclasse (Classe Pai) - Classe que está sendo herdada
     * Subclasse (Classe Filha) - Classe que está herdando (Pode adicionar novos atributos e métodos)
     */

    /*
    * É um comportamento que está bem ligado com a herança.
    * É a habilidade de objetos de diferentes classes responderem a mesma mensagem de maneira diferente.
    * # Podem existir varios seres, mas cada um executar o método comer de maneira diferente
    * */

    String sobrenome;

    public Pessoa(String nome, int idade, String sobrenome) {
        super(nome, idade); // Chama o construtor da superclasse
        this.sobrenome = sobrenome;
    }

    void criaMain() {
        Main meuMain = new Main("Nome");
        System.out.println(meuMain.nome);
        this.idade = 22;

        Ser meuSerAnimal = new Pessoa("nome", 18, "sobrenome"); // Toda subclasse é do tipo da superclasse
        // Polimorfismo - Herdam da mesma superclasse, mas se comportam de maneira diferente
        meuSerAnimal.saudacao(); // Não importa se é um cachorro ou uma pessoa, o método saudacao() vai ser chamado.
    }

    @Override
    public String saudacao() {
        return "Olá, meu nome é " + this.nome;
    }
}
