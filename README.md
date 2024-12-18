# Sistema de Gestão de Biblioteca 📚

Bem-vindo ao **Sistema de Gestão de Biblioteca**! Este projeto foi desenvolvido como parte dum desafio da trilha de Java do **Rocketseat**, com o objetivo de praticar conceitos fundamentais de Java, como herança, polimorfismo, estruturas de repetição, e manipulação de coleções e datas.

---

## 🚀 Funcionalidades

### **Gerenciamento de Livros**
- **Listar todos os livros disponíveis**: Exibe os livros que estão disponíveis para empréstimo.
- **Realizar empréstimo dum livro**: Permite que o usuário selecione um livro disponível e registre o empréstimo. O livro é marcado como indisponível durante a execução do programa.
- **Devolver um livro**: Permite que o usuário devolva um livro emprestado, marcando-o como disponível novamente.

### **Gerenciamento de Empréstimos**
- **Listar todos os empréstimos**: Exibe uma lista de todos os empréstimos realizados, mostrando o cliente, o livro e a data de empréstimo.

### **Gerenciamento de Autores**
- **Listar autores cadastrados**: Exibe uma lista de todos os autores cadastrados no sistema, com suas informações básicas.

---

## 🛠️ Estrutura do Projeto

O projeto é organizado em quatro classes principais:

### **1. Livro**
Representa os livros na biblioteca, com os seguintes atributos:
- `id`: Identificador único do livro.
- `titulo`: Nome do livro.
- `autor`: Autor do livro (referência a um objeto do tipo `Autor`).
- `disponivel`: Indica se o livro está disponível para empréstimo.
- `dataCadastro`: Data em que o livro foi adicionado ao sistema.
- `dataAtualizacao`: Última data de atualização do status do livro.

### **2. Autor**
Representa os autores dos livros, com os seguintes atributos:
- `id`: Identificador único do autor.
- `nome`: Nome do autor.
- `dataNascimento`: Data de nascimento do autor.

### **3. Empréstimo**
Gerência os empréstimos realizados, com as seguintes informações:
- `livro`: Referência ao livro emprestado.
- `cliente`: Nome do cliente que realizou o empréstimo.
- `dataEmprestimo`: Data em que o empréstimo foi realizado.

### **4. Biblioteca**
Gerência a coleção de livros, autores e empréstimos, oferecendo os seguintes métodos:
- `adicionarLivro`: Adiciona um novo livro à biblioteca.
- `adicionarAutor`: Adiciona um novo autor à biblioteca.
- `listarLivrosDisponiveis`: Exibe os livros disponíveis para empréstimo.
- `realizarEmprestimo`: Registra um empréstimo e marca o livro como indisponível.
- `devolverLivro`: Marca um livro emprestado como disponível novamente.
- `listarEmprestimos`: Exibe todos os empréstimos realizados.
- `listarAutores`: Exibe todos os autores cadastrados.

---

## 🏃‍♂️ Como Usar

1. Ao iniciar o programa, o menu principal será exibido.
2. Escolha uma das opções:
    - Listar livros disponíveis.
    - Realizar empréstimos.
    - Listar empréstimos realizados.
    - Devolver um livro emprestado.
    - Listar autores cadastrados.
    - Sair do sistema.
3. Siga as instruções no console para realizar as ações desejadas.

---

### Obrigado por conferir o Sistema de Gestão de Biblioteca! 😊