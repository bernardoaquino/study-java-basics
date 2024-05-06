public class Cachorro extends Ser{ // Obrigatoriamente deve chamar o construtor da superclasse

    String nomeDono;
    public Cachorro(String nome, int idade, String nomeDono) {
        super(nome, idade);
        this.nomeDono = nomeDono;
    }

    @Override
    public String saudacao() {
        return "au au";
    }
}
