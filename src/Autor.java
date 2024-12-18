import java.time.LocalDate;

public class Autor {

    private final int id;
    private final String nome;
    private final LocalDate dataNascimento;

    public Autor ( int id , String nome , LocalDate dataNascimento ) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome ( ) {
        return nome;
    }

    @Override
    public String toString ( ) {
        return "Nome: " + nome +
                ", Data de Nascimento do Autor: " + dataNascimento;
    }
}
