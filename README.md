# Gestão Biblioteca 🚀

Este projeto é uma aplicação Spring Boot que gerencia **Bibliotecários**, **Livros**, **Empréstimos**, **Visitantes** e **Membros** em uma biblioteca. Ele inclui operações CRUD (Create, Read, Update, Delete) para todas as entidades, utilizando um banco de dados PostgreSQL.

---

## Funcionalidades ✨

- **Cadastro de entidades**: Adicione novos bibliotecários, livros, empréstimos, visitantes e membros.
- **Listagem de entidades**: Veja todos os registros cadastrados.
- **Atualização de entidades**: Atualize as informações de registros existentes.
- **Exclusão de entidades**: Remova registros da base de dados.

---

## Pré-requisitos 📋

Antes de começar, você precisará ter instalado:

- **Java 17** ou superior.
- **Maven** para gerenciamento de dependências.
- **PostgreSQL** como banco de dados.
- **Postman** ou qualquer outra ferramenta para testar os endpoints da API.

---

## Instalação 🛠️

Siga os passos abaixo para configurar o projeto:

1. Clone o repositório:
   ```bash
   git clone https://github.com/MiguelFazioAssuncao/project-mini-exercise.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd project-mini-exercise
   ```
3. Configure o banco de dados:
   - Crie um banco de dados no PostgreSQL chamado project_mini_exercise.
   - Atualize as configurações no arquivo application.properties: properties
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/project_mini_exercise
   spring.datasource.username=seu-usuario
   spring.datasource.password=sua-senha
   ```
4. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```
   
## Como Usar 🚀
A API estará disponível em http://localhost:8080. Aqui estão os endpoints disponíveis:

### Endpoints para Bibliotecários

- GET /bibliotecarios: Lista todos os bibliotecários.  
- GET /bibliotecarios/{id}: Busca um bibliotecário pelo ID.
- POST /bibliotecarios: Cria um novo bibliotecário.
    ```json
   {
     "nome": "João Silva",
     "email": "joao.silva@example.com",
     "senha": "senha123"
   }
   ```
- PUT /bibliotecarios/{id}: Atualiza um bibliotecário existente.
- DELETE /bibliotecarios/{id}: Deleta um bibliotecário pelo ID.

### Endpoints para Livros

- GET /livros: Lista todos os livros.
- GET /livros/{id}: Busca um livro pelo ID.
- POST /livros: Cria um novo livro.

    ```json
      {
      "titulo": "Dom Quixote",
      "autor": "Miguel de Cervantes",
      "anoPublicacao": 1605
     }
   ```
- PUT /livros/{id}: Atualiza um livro existente.
- DELETE /livros/{id}: Deleta um livro pelo ID.
### Endpoints para Empréstimos

- GET /emprestimos: Lista todos os empréstimos.
- GET /emprestimos/{id}: Busca um empréstimo pelo ID.
- POST /emprestimos: Cria um novo empréstimo.

   ```json
       {
        "titulo": "Dom Quixote",
        "autor": "Miguel de Cervantes",
        "anoPublicacao": 1605
       }
    ```
- PUT /emprestimos/{id}: Atualiza um empréstimo existente.
- DELETE /emprestimos/{id}: Deleta um empréstimo pelo ID.

### Endpoints para Visitantes

- GET /visitantes: Lista todos os visitantes.
- GET /visitantes/{id}: Busca um visitante pelo ID.
- POST /visitantes: Cria um novo visitante.

   ```json
       {
        "nome": "Carlos Souza",
        "telefone": "31977777777"
       }
    ```
- PUT /visitantes/{id}: Atualiza um visitante existente.
- DELETE /visitantes/{id}: Deleta um visitante pelo ID.

### Endpoints para Membros

- GET /membros: Lista todos os membros.
- GET /membros/{id}: Busca um membro pelo ID.
- POST /membros: Cria um novo membro.

   ```json
       {
        "nome": "Maria Oliveira",
        "endereco": "Rua B, 456, Rio de Janeiro",
        "telefone": "21988888888"
       }
    ```
- PUT /membros/{id}: Atualiza um membro existente.
- DELETE /membros/{id}: Deleta um membro pelo ID.
