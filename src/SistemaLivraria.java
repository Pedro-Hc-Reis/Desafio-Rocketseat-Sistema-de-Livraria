import java.time.LocalDate;
import java.util.Scanner;

public class SistemaLivraria {
    public static void main ( String[] args ) {
        Biblioteca biblioteca = new Biblioteca ( );

        Autor autor1 = new Autor ( 1 , "Machado de Assis" , LocalDate.of ( 1839 , 6 , 21 ) );
        Autor autor2 = new Autor ( 2 , "Clarice Lispector" , LocalDate.of ( 1920 , 12 , 10 ) );

        biblioteca.adicionarAutor ( autor1 );
        biblioteca.adicionarAutor ( autor2 );

        biblioteca.adicionarLivro ( new Livro ( 1 , "Dom Casmurro" , autor1 ) );
        biblioteca.adicionarLivro ( new Livro ( 2 , "A Hora da Estrela" , autor2 ) );

        Scanner scanner = new Scanner ( System.in );
        boolean rodando = true;

        while ( rodando ) {
            System.out.print ( """
                    \s
                     Bem-vindo ao Sistema de Livraria!
                     1. Listar livros disponíveis
                     2. Realizar empréstimo
                     3. Listar empréstimos
                     4. Devolução de livro
                     5. Listar autores
                     6. Sair
                     Escolha uma opção:\s""" );
            int opcao;

            try {
                opcao = scanner.nextInt ( );
            } catch (Exception e) {
                System.out.println ( "Entrada inválida! Por favor, digite um número." );
                scanner.nextLine ( );
                continue;
            }

            System.out.println ( );
            switch (opcao) {
                case 1:
                    biblioteca.listarLivrosDisponiveis ( );
                    break;
                case 2:
                    biblioteca.listarLivrosDisponiveis ( );
                    System.out.println ( );
                    System.out.print ( "Digite o ID do livro que deseja emprestar: " );
                    int livroId;
                    try {
                        livroId = scanner.nextInt ( );
                    } catch (Exception e) {
                        System.out.println ( "Entrada inválida! Por favor, insira um número válido." );
                        scanner.nextLine ( );
                        break;
                    }
                    Livro livroSelecionado = biblioteca.buscarLivroPorId ( livroId );
                    if ( livroSelecionado == null ) {
                        System.out.println ( "Livro não encontrado ou não disponível para empréstimo." );
                        break;
                    }
                    scanner.nextLine ( );
                    System.out.print ( "Digite seu nome: " );
                    String cliente = scanner.nextLine ( );
                    biblioteca.realizarEmprestimo ( livroId , cliente );
                    System.out.println ( "O livro " + livroSelecionado.getTitulo ( ) + " foi emprestado para " + cliente );
                    break;
                case 3:
                    biblioteca.listarEmprestimos ( );
                    break;
                case 4:
                    if ( biblioteca.getEmprestimos ( ).isEmpty ( ) ) {
                        System.out.println ( "Nenhum empréstimo foi realizado." );
                        break;
                    }
                    biblioteca.listarLivrosEmprestados ( );
                    System.out.println ( );
                    System.out.print ( "Digite o ID do livro que está sendo devolvido: " );
                    int livroIdDevolucao;
                    try {
                        livroIdDevolucao = scanner.nextInt ( );
                    } catch (Exception e) {
                        System.out.println ( "Entrada inválida! Por favor, insira um número válido." );
                        scanner.nextLine ( );
                        break;
                    }

                    biblioteca.devolverLivro ( livroIdDevolucao );
                    break;
                case 5:
                    biblioteca.listarAutores ( );
                    break;
                case 6:
                    System.out.println ( "Encerrando o sistema. Até mais!" );
                    rodando = false;
                    break;
                default:
                    System.out.println ( "Opção inválida. Tente novamente." );
            }
        }

        scanner.close ( );
    }
}