# Estudo Java - NLW Expert Trilha de Java

Este é um projeto em desenvolvimento como parte do curso gratuito oferecido pela Rocketseat. O objetivo do projeto é desenvolver uma aplicação back-end em Java, utilizando Maven, Spring Boot, API Rest, Lombok, Integração com PostgreSQL Database, Implementando JDBC Template, príncipios do SOLID, JPA, utilização de entidades, cardinalidades entre tabelas e dto's.

## Pré-requisitos

Certifique-se de ter o seguinte instalado em sua máquina:

- [Java JDK 17](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Docker](https://www.docker.com/get-started)
- [HTTPie](https://httpie.io/) ou [Postman](https://www.postman.com/downloads/)

## Configuração do Projeto

1. **Clone o repositório:**
    ```bash
    git clone https://github.com/fabyanroger/estudo_java.git
    cd estudo_java
    ```

2. **Executando o Projeto:**
    ```bash
    mvn spring-boot:run
    ```

## Usando HTTPie para Testar a API

### Exemplo de Verificação de Certificação:

1. **Endpoint:** `/students/verifyIfHasCertification`
2. **Método:** `POST`
3. **Corpo da Solicitação usando HTTPie:**
    ```bash
    http POST http://localhost:8080/students/verifyIfHasCertification email="exemplo@gmail.com" technology="JAVA"
    ```
   Certifique-se de ajustar o URL, o e-mail e a tecnologia conforme necessário.

   - Ou, se preferir, use o Postman com configurações semelhantes.

## Contribuindo

Sinta-se à vontade para contribuir para o projeto. Abra uma *issue* para discutir novas funcionalidades ou correções, e envie *pull requests* para colaborar no desenvolvimento.
