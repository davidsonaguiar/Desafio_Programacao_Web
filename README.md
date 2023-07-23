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
content-encoding: gzip
content-type: text/html; charset=UTF-8
```
