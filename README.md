Dockerized: Spring Boot + Postgres + React
============================

Projeto de uma simples plataforma de blog com backend e frontend executados em contêineres docker.

Sobre o projeto
-------------------
O que foi utilizado?

Backend:
 - Java
 - Spring Boot
 - Spring Web
 - Spring Data JPA (Hibernate)
 - Maven
 - Postgres

Frontend:
 - JavaScript
 - React

Como executar?
-------------------
Para construir e iniciar os contêineres:

   ``docker-compose up -d``

Como o backend é uma RESTful API, pode-se fazer solicitações HTTP GET e acessar todas as postagens numa representação JSON através do browser http://localhost:8080/api/Postagens

Acesse através do browser http://localhost:3000/

Obs: No caso de utilização do Docker Toolbox, deve-se utilizar o endereço IP da máquina virtual Dokcer Toolbox e não o endereço localhost.

Para descobrir o endereço IP da máquina virtual Dokcer Toolbox:

``docker-machine ip default``