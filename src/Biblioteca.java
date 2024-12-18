import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Livro> livros = new ArrayList<> ( );
    private final List<Autor> autores = new ArrayList<> ( );
    private final List<Emprestimo> emprestimos = new ArrayList<> ( );

    public List<Emprestimo> getEmprestimos ( ) {
        return emprestimos;
    }

    public void adicionarAutor ( Autor autor ) {
        autores.add ( autor );
    }

    public void adicionarLivro ( Livro livro ) {
        livros.add ( livro );
    }

    public void listarLivrosDisponiveis ( ) {
        System.out.println ( "Livros disponíveis:" );
        for (Livro livro : livros) {
            if ( livro.isDisponivel ( ) ) {
                System.out.println ( livro );
            }
        }
    }

    public void listarLivrosEmprestados ( ) {
        System.out.println ( "Livros emprestados:" );
        for (Livro livro : livros) {
            if ( ! livro.isDisponivel ( ) ) {
                System.out.println ( livro );
            }
        }
    }

    public Livro buscarLivroPorId ( int id ) {
        for (Livro livro : livros) {
            if ( livro.getId ( ) == id ) {
                return livro;
            }
        }
        return null;
    }

    public void realizarEmprestimo ( int livroId , String cliente ) {
        Livro livro = buscarLivroPorId ( livroId );
        if ( livro != null && livro.isDisponivel ( ) ) {
            livro.emprestar ( );
            Emprestimo emprestimo = new Emprestimo ( livro , cliente );
            emprestimos.add ( emprestimo );
            System.out.println ( "Empréstimo realizado com sucesso!" );
        } else {
            System.out.println ( "Livro não disponível ou ID inválido." );
        }
    }

    public void listarEmprestimos ( ) {
        if ( emprestimos.isEmpty ( ) ) {
            System.out.println ( "Nenhum empréstimo realizado até o momento." );
        } else {
            System.out.println ( "Lista de empréstimos:" );
            for (Emprestimo emprestimo : emprestimos) {
                System.out.println ( emprestimo );
            }
        }
    }

    public void devolverLivro ( int livroId ) {
        Emprestimo emprestimo = null;
        for (Emprestimo e : emprestimos) {
            if ( e.getLivro ( ).getId ( ) == livroId ) {
                emprestimo = e;
                break;
            }
        }

        if ( emprestimo == null ) {
            System.out.println ( "Nenhum empréstimo encontrado para o ID informado." );
            return;
        }

        Livro livro = emprestimo.getLivro ( );
        livro.setDisponivel ( true );

        emprestimos.remove ( emprestimo );

        System.out.println ( "O livro \"" + livro.getTitulo ( ) + "\" foi devolvido com sucesso." );
    }

    public void listarAutores ( ) {
        if ( autores.isEmpty ( ) ) {
            System.out.println ( "Nenhum autor cadastrado." );
        } else {
            System.out.println ( "Lista de autores:" );
            for (Autor autor : autores) {
                System.out.println ( autor );
            }
        }
    }

}
