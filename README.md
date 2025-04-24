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
- Produção: `https://[SEU-DOMINIO]/swagger-ui.html`

## 📄 Licença

Este projeto está sob a licença MIT - veja o arquivo [LICENSE.md](LICENSE.md) para detalhes. 