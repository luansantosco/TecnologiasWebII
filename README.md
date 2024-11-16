
# [CURSO ADS] Tecnologias Web II - 2024.2

### Trabalho Efetivo Discente (TED) - Uniesp

---

### Projeto: API REST de Gerenciamento de Usuários

Desenvolva uma **API REST utilizando o Spring Boot** com um Resource chamado Usuario, que deve ter os seguintes campos: id, nome, email, dataNascimento e password.
O aluno deve implementar os métodos: obterTodosOsUsuarios(), obterUsuarioPorId(), adicionarUsuario(), removerUsuario() e editarUsuario().

---

#### Solução da atividade

1. **Implementar uma API RESTful**: Criar endpoints para manipulação do recurso **Usuário**.
2. **Realizar operações CRUD**: Incluir métodos para criação, leitura, atualização e exclusão de usuários.

#### Estrutura do Recurso `Usuario`

O recurso `Usuario` possui os seguintes campos obrigatórios:

- **Id**: Identificador único do usuário.
- **Nome**: Nome completo do usuário.
- **Email**: Endereço de e-mail do usuário.
- **Data de Nascimento**: Data de nascimento do usuário.
- **Password**: Senha do usuário.

### Endpoints da API

| Método HTTP | Endpoint             | Descrição                              |
|-------------|----------------------|----------------------------------------|
| GET         | `/usuarios`          | Obtém a lista de todos os usuários     |
| GET         | `/usuarios/{id}`     | Obtém as informações de um usuário específico por ID |
| POST        | `/usuarios`          | Adiciona um novo usuário               |
| DELETE      | `/usuarios/{id}`     | Remove um usuário específico por ID    |
| PUT         | `/usuarios/{id}`     | Edita as informações de um usuário específico por ID |

#### Requisitos do Projeto

Para concluir o projeto, implemente os seguintes métodos:

1. **obterTodosOsUsuarios()**: Retorna uma lista de todos os usuários registrados.
2. **obterUsuarioPorId()**: Retorna um usuário específico baseado em seu ID.
3. **adicionarUsuario()**: Adiciona um novo usuário ao sistema.
4. **removerUsuario()**: Remove um usuário específico do sistema com base em seu ID.
5. **editarUsuario()**: Atualiza as informações de um usuário específico.

#### Tecnologias Utilizadas

- **Spring Boot**: Framework principal para a construção da API REST.
- **Java**: Linguagem de programação para o desenvolvimento da aplicação.
- **MySql**: Sistema de gerenciamento de banco de dados.
- **Maven**: Gerenciador de dependências.

#### Instruções para Rodar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/luansantosco/TecnologiasWebII
   cd TecnologiasWebII
   ```

2. **Compile e rode a aplicação**:
   ```bash
   mvn spring-boot:run
   ```

3. **Acesse a API**:
   A API estará disponível em `http://localhost:8080`.
