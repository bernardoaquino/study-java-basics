public class Ser { // Toda Pessoa é um Ser, mas nem todo Ser é uma Pessoa
    String nome;
    int idade;

    public Ser(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    public String saudacao() {
        return null;
    }
}