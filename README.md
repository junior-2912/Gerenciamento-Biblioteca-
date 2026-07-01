## Sistema de biblioteca
Um sistema de gerenciamento de biblioteca desenvolvido em Java, com foco em ser um projeto de estudos pra consolidação do Java core e na prática de conceitos fundamentais da linguagem e boas práticas de programação orientada a objetos.

O projeto permite cadastrar livros, usuários e empréstimos, além de realizar consultas e gerar relatórios utilizando a API de Streams do Java.

### Funcionalidades
- Cadastro de livros
- Cadastro de usuários
- Registro de empréstimos
- Devolução de livros
- Busca por ID
- Listagem de livros, usuários e empréstimos
- Relatório de livros atrasados
- Relatório dos usuários com mais empréstimos
- Top livros mais emprestados
- Persistência dos dados em arquivos .csv

### Conceitos praticados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Associações entre objetos
- Enums
- Exceptions personalizadas
- Generics
- Collections (Set, List, Map)
- Streams API
- Lambda Expressions
- Collectors.groupingBy()
- Comparator
- Persistência simples utilizando arquivos CSV
- Organização em camadas (application, entities, repository, exceptions, enums)

### Estrutura do projeto
````
src
├── application
├── entities
├── enums
├── exceptions
└── repository
````

### Regras de negócio
- Um livro só pode ser emprestado quando estiver disponível.
- Um usuário pode possuir no máximo 5 empréstimos ativos.
- Ao devolver um livro o status do livro volta para DISPONÍVEL e o empréstimo é marcado como FINALIZADO, preservando o histórico de empréstimos.
- Os relatórios são gerados utilizando Streams sobre o histórico completo de empréstimos.

### Tecnologias utilizadas
- Java
- IntelliJ IDEA
- Git
- GitHub

### Objetivo

O principal objetivo deste projeto foi praticar conceitos intermediários e avançados de Java Core antes do estudo de tecnologias como Spring Boot, bancos de dados e APIs REST.

Não visa ser um sistema completo para produção, o foco foi aprender a modelar entidades, organizar responsabilidades entre classes e aplicar recursos modernos do Java.

### Autor

Desenvolvido por Junior como projeto de estudos.