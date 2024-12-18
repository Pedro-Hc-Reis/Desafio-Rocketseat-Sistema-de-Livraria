import java.time.LocalDate;

public class Livro {

    private final int id;
    private final String titulo;
    private final Autor autor;
    private final LocalDate dataCadastro;
    private boolean disponivel;
    private LocalDate dataAtualizacao;

    public Livro ( int id , String titulo , Autor autor ) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        this.dataCadastro = LocalDate.now ( );
        this.dataAtualizacao = LocalDate.now ( );
    }

    public int getId ( ) {
        return id;
    }

    public String getTitulo ( ) {
        return titulo;
    }

    public boolean isDisponivel ( ) {
        return disponivel;
    }

    public void setDisponivel ( boolean disponivel ) {
        this.disponivel = disponivel;
    }

    public void emprestar ( ) {
        this.disponivel = false;
        this.dataAtualizacao = LocalDate.now ( );
    }

    @Override
    public String toString ( ) {
        return "Livro: " + id +
                ", titulo: " + titulo +
                ", autor: " + autor +
                ", dataCadastro: " + dataCadastro +
                ", dataAtualizacao: " + dataAtualizacao;
    }
}
