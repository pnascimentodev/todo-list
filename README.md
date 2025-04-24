# Todo List API

API REST para gerenciamento de tarefas desenvolvida com Spring Boot.

## 🚀 Tecnologias

- Java 21
- Spring Boot 3.4.4
- PostgreSQL
- Swagger/OpenAPI
- Docker

## 📋 Pré-requisitos

- Java 21
- Docker e Docker Compose (para ambiente de desenvolvimento)
- Maven ou Wrapper do Maven (incluído no projeto)

## 🔧 Instalação e Execução Local

1. Clone o repositório:
```bash
git clone [URL_DO_SEU_REPOSITORIO]
cd todo-list
```

2. Inicie o banco de dados com Docker:
```bash
docker-compose up -d
```

3. Execute o projeto:
```bash
./mvnw spring-boot:run
```

4. Acesse a documentação Swagger:
```
http://localhost:8080/swagger-ui.html
```

## 🌐 Deploy

Este projeto está configurado para deploy automático no Railway.

### Variáveis de Ambiente Necessárias:

- `DATABASE_URL`: URL de conexão com o PostgreSQL
- `PGUSER`: Usuário do PostgreSQL
- `PGPASSWORD`: Senha do PostgreSQL
- `PORT`: Porta da aplicação (opcional, padrão: 8080)

## 📚 Documentação

A documentação completa da API está disponível através do Swagger UI:

- Local: `http://localhost:8080/swagger-ui.html`  

<br>

<div align="center">
  <a href="https://www.linkedin.com/in/devpnascimento/" target="_blank">
    <img src="https://img.shields.io/badge/Me%20chama%20no%20LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn">
  </a>
</div>
