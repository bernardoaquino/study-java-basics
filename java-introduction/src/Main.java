import java.util.ArrayList;

// Compilar: javac Main.java (Compilar o arquivo no terminal - cd java-introduction/src/)
// Compila a classe Main e todas as outras classes que estão sendo referenciadas
// Executar: java Main
public class Main {
    /*
     * Classes são um elemento fundamental do programa, pois servem para modelar objetos. Através de atributos (variáveis) e métodos (comportamentos)
     * # Só pode ter uma classe pública por arquivo Java. (O nome da classe tem que ser igual ao nome do arquivo)
     * */

    // Atributos - Posso refenciar eles em todos os métodos que pertencem à instância da classe
    String nome;
    static String nome2;
    int idade;

    /** Construtores são métodos chamados para inicializar uma instância da classe
     * É um método com o mesmo nome da classe
    */

    public Main(String nome) {
        this.nome = nome;
    }

    public Main(String nome, int idade) { // Overload/Sobrecarga - Mesmo nome, mas com parâmetros diferentes
        this.nome = nome; // O this é uma referência para o objeto que está sendo instanciado
        this.idade = idade;
    }

    /**
     * Modificadores de Acesso (Determinam o nível de visibilidade de uma classe, atributo ou método)
     * - public: atributos e métodos podem ser acessados por qualquer classe no programa
     * - private: atributos e métodos só podem ser acessados pela própria classe (Geralmente para funcionamento interno)
     * - protected: atributos e métodos podem ser acessados pela própria classe e por classes que herdam dela. (Mesmo pacote - Ex: src)
     * # Ex: Foi importado a classe ArrayList do pacote java.util. Se dentro da classe ArrayList tiver um atributo protected,
     *       ele vai ser visível para as classes que pertencem ao pacote java.util. Mas não para a Classe Main que está no pacote src.
     * */

    public String name; // Vai ser visível para qualquer classe que criar uma instância da classe Main
    private String name2; // Vai ser visível apenas para a própria classe Main
    protected String name3; // Vai ser visível para a própria classe Main e para classes que herdam dela

    private void atualizaName2() {
        this.name2 = "Nome";
    }

    public String getName2() {
        return this.name2;
    }

    // Métodos - Comportamentos

    static void teste() {

    }

    void declaraNome() {
        System.out.println(nome2);
        Main.teste(); // Não é necessário instanciar a classe para chamar o método main
        nome = "Nome";

        Main meuMain = new Main("Nome");
        meuMain.declaraNome(); // Só consegue chamar se tiver uma instância (Objeto)
        System.out.println(meuMain.nome);
    }

    String getNome() {
        return nome;
    }

    /** Métodos estáticos pertencem à classe e não a instância. Não podem acessar atributos da instância.
    * Esse método vai ser igual a todos os objetos da classe. Você pode criar 10 objetos, mas o método vai ser o mesmo para todos.
    * Enxerga apenas atributos estáticos
    */
    // Quando o programa é executado, o método main é o primeiro a ser chamado. Ele não vai precisar de uma instância da classe para ser chamado
    // String[] args é um array de argumentos que podem ser passados para o programa no terminal
    public static void main(String[] args) {
        /*
         *   Declaração de variáveis
         *  tipo nome = valor;
        */
        int idade = 22;
        int salario;
        salario = 400;

        // Variáveis de escopo local - Inferi o tipo através do valor
        var nome = "nome";

        // No Java existem 8 tipos primitivos

        /*
        4 deles são usados para inteiros. A diferença entre eles está na faixa de representação.
        * - byte = Inteiros pequenos = (-127 até 128) = 1 byte = 8bits
        * - short = Inteiros pequenos = (-32.768 até 32.767) = 2 bytes = 16bits
        * - int = Inteiros = (-2.147.483.648 até 2.147.483.647) = 4 bytes = 32bits
        * - long = Inteiros grandes = (-9.223.372.036.854.775.808 até 9.223.372.036.854.775.807) = 8 bytes = 64bits
        *
        * # Muitos programadores usam o tipo int para representar números inteiros, pois ele é o mais comum.
        */
        byte numeroByte = 10;
        short numeroShort = 10;
        int numeroInteiro = 10;
        long numeroLong = 10;

        /*
        * - boolean =  (true ou false)
        */
        boolean isTrue = true;

        /*
        * - char = 1 caractere
        */
        char caractere = 'A';

        /*
         * - double = Números decimais = 64 bits (Mais precisa / Números depois da vírgula)
         * - float = Números decimais = 32 bits (Menos precisa / Números depois da vírgula)
         */
        double numeroDouble = 10.0;
        float numeroFloat = 10.0f; // Se não colocar o 'f' no final, o Java vai entender que é um double

        /*
         * - String = sequência de caracteres
         *
         * # String é uma classe auxiliar, não um tipo primitivo
         */
        String texto = "Texto";

        /* Arrays
         * tipo[] nome;
         * tipo[] nome = new tipo[tamanho];
         * tipo[] nome = {valor1, valor2, valor3};
         *
         * # O tamanho do array é fixo, não pode ser alterado
        */
        int[] idades = new int[10];
        idades[0] = 10;
        String[] nomes = new String[10];
        boolean[] booleans = {true, false, true};
        System.out.println(booleans.length); // Tamanho do array

        /* ArrayList
         * É uma classe que vem em uma biblioteca padrão do Java (java.util)
         * É uma estrutura de dados que representa uma lista dinâmica
         */

        // Não pode passar tipos primitivos, tem que passar a classe nativa (Integer). Semelhante à classe String
        ArrayList<Integer> idadesDinamicas = new ArrayList<Integer>();
        idadesDinamicas.add(10);
        idadesDinamicas.add(20);
        idadesDinamicas.add(30);
        idadesDinamicas.remove(0);
        idadesDinamicas.get(1);
        idadesDinamicas.size();

        /*
        * Casting
        *
        * - Implícito: Quando o Java faz a conversão automaticamente
        * - Explicito: Quando o programador faz a conversão (Está ciente que está perdendo uma parte da faixa de representação - Ex: Perdendo os valores decimais
        * */
        int numeroInt = 10;
        double numeroDouble2 = numeroInt; // Implícito
        //numeroInt = numeroDouble2; // Não é possível fazer o casting implícito de double para int. Porque o double é maior que o int
        numeroInt = (int) numeroDouble2; // Explicito

        char letra = 'a';
        String letras = String.valueOf(letra); // Convertendo char para String
        letra = nome.charAt(0); // Convertendo String para char

        String letras2 = String.valueOf(numeroInt); // Convertendo int para String
        numeroInt = Integer.parseInt(letras2); // Convertendo String para int (Nem sempre é possível fazer essa conversão)
    }
}