# Respostas dos Desafios da Aula de Programação Web 🏆

Bem-vindo(a) ao Repositório de Respostas dos Desafios da Aula de Programação Web! Neste repositório, você encontrará as soluções para os desafios propostos durante a disciplina de programação web. Cada desafio aborda tópicos específicos e oferece a oportunidade de praticar e aprimorar suas habilidades em desenvolvimento web.

## Desafio 1: Resolvendo Domínios em IP usando o DNSServlet 🎯

O primeiro desafio consiste em implementar um método que recebe uma requisição via GET, contendo o domínio, e retorne o IP correspondente. Para essa tarefa, usaremos o DNSServlet, uma ferramenta que nos permite resolver domínios em endereços IP.

### Exemplo de Uso

Suponha que o método foi implementado corretamente e está em execução. Se você fizer uma requisição GET para o seguinte endpoint:

```
GET /desafio/?domain=example7.com
```

A resposta esperada será algo como:

```
"192.168.1.7"
```
[Acesse a solução do Desafio 1](Desafio.java) 


## Desafio 2: Exibir Informações dos Cabeçalhos 🎯

Neste desafio, usamos o DNSServlet para pegar informações dos cabeçalhos `Content-Type`, `accept-encoding`, `path` e `scheme` de uma solicitação e exibir na saída padrão.

Além disso, também adicionamos as seguintes informações aos cabeçalhos de resposta:

- Cache-Control: max-age=1000
- Content-Encoding: gzip
- Content-Type: text/html; charset=UTF-8

### Exemplo de Uso

Suponha que o método foi implementado corretamente e está em execução. Se você fizer uma requisição GET para o seguinte endpoint:

```
GET http://localhost:8080/pweb01/desafio2/

HEADER REQUISICÃO
Path: http://localhost:8080/pweb01/desafio2/
Content-type: text/html
AcceptEncoding: gzip, deflate, br
Scheme: http
```

A resposta esperada será algo como:

```
Path: http://localhost:8080/pweb01/desafio2/
Content-type: text/html
AcceptEncoding: gzip, deflate, br
Scheme: http

HEADER RESPOSTA
cache-control: max-age=1000
content-encoding: gzip, text
content-type: text/html; charset=UTF-8
```
[Acesse a solução do Desafio 2](Desafio2.java) 

## Desafio 3: Gerenciamento de Sessão com Servlets 🎯

Neste desafio, você deve criar um novo Servlet capaz de receber requisições do tipo POST e DELETE.

### Método POST

No método POST, o Servlet deve verificar se o cliente possui uma sessão válida. Se não houver uma sessão válida para o cliente, o Servlet deve responder com a mensagem "Olá, este é seu primeiro acesso.". Caso já exista uma sessão para o cliente, o Servlet deve responder com a mensagem "Olá, você já esteve por aqui".

### Método DELETE

No método DELETE, o Servlet deve verificar o último acesso do cliente. Se o último acesso do cliente tiver ocorrido há mais de 30 segundos, o Servlet deve invalidar a sessão. Caso contrário, não é necessário fazer nenhuma ação.

### Exemplo de Uso

Suponha que o Servlet foi implementado corretamente e está em execução. 

1. Requisição POST sem sessão:

```
POST http://localhost:8080/pweb01/desafio3/
```

Resposta esperada:

```
"Olá, este é seu primeiro acesso."
```

2. Requisição POST com sessão válida:

```
POST http://localhost:8080/pweb01/desafio3/
```

Resposta esperada:

```
"Olá, você já esteve por aqui"
```

3. Requisição DELETE com último acesso há mais de 30 segundos:

```
DELETE http://localhost:8080/pweb01/desafio3/
```

Resposta esperada:

```
Sessão inválida. Último acesso ocorreu há mais de 30 segundos.
```

4. Requisição DELETE com último acesso há menos de 30 segundos:

```
DELETE http://localhost:8080/pweb01/desafio3/
```

Resposta esperada:

```
Sessão válida. Último acesso ocorreu há menos de 30 segundos.
```

[Em progresso](Desafio3.java) 

