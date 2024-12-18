import java.time.LocalDate;

public class Emprestimo {

    private final Livro livro;
    private final String cliente;
    private final LocalDate dataEmprestimo;

    public Emprestimo(Livro livro, String cliente) {
        this.livro = livro;
        this.cliente = cliente;
        this.dataEmprestimo = LocalDate.now();
    }

    public Livro getLivro ( ) {
        return livro;
    }

    @Override
    public String toString ( ) {
        return "Emprestimo: " +
                "livro: " + livro.getTitulo () +
                ", cliente: " + cliente +
                ", dataEmprestimo: " + dataEmprestimo;
    }
}
