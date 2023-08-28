## Desafio 4: Formulário com Spring Boot e Validação 🎯

Neste desafio, você irá criar um formulário web utilizando o framework Spring Boot. O objetivo é receber dados do usuário por meio do formulário, validar esses dados e exibir mensagens de erro quando necessário.

### Passos do Desafio

1. Crie um novo Controller para lidar com as requisições relacionadas ao formulário.
2. Crie uma classe de modelo (entidade) que representará os dados submetidos pelo formulário.
3. Implemente uma página HTML com um formulário que permita aos usuários inserir informações.
4. Utilize anotações de validação do Spring para definir regras de validação para os campos do formulário, conforme descrito abaixo.
5. Exiba mensagens de erro na página do formulário quando a validação falhar.
6. Quando os dados forem submetidos corretamente, exiba uma página de confirmação.

### Validações

- Todos os campos, exceto os checkboxes, são obrigatórios.
- Os checkboxes permitem que o usuário marque no máximo 3 opções.
- A data de nascimento deve ser uma data válida.
- O campo de email deve conter o caractere "@".
- O DDD deve ser um valor válido.

### Exemplo de Uso

Suponha que você tenha concluído o desafio corretamente e o aplicativo esteja em execução.

1. Acesse a página do formulário:

```
GET http://localhost:8080/
```

2. Preencha o formulário com dados inválidos e submeta.

```
POST http://localhost:8080/

Resposta esperada (exibindo mensagens de erro na página):
- Todos os campos obrigatórios devem ser preenchidos
- Marque no máximo 3 checkboxes
- Data de nascimento inválida
- O campo Email deve conter "@"
- DDD inválido
```

3. Preencha o formulário com dados válidos e submeta.

```
POST http://localhost:8080/

Resposta esperada (página de confirmação):
- Dados submetidos com sucesso!
```

## Links

- [Model](./src/main/java/pweb2/form/Models/User.java) 
- [Controller](./src/main/java/pweb2/form/Controllers/UserController.java)
- [Repository](./src/main/java/pweb2/form/Respositories/UserRepository.java)
- [Formulario HTML](./src/main/resources/templates/form.html)
- [Formulario CSS](./src/main/resources/static/css/form.css)
- [Success html](./src/main/resources/templates/success.html)
- [Success CSS](./src/main/resources/static/css/success.css)

- [AZURE Deploy](https://form-form.azuremicroservices.io)
