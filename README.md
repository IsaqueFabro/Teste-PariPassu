# Desafio Técnico – Sistema de Aluguéis de Filmes

Este repositório contém a implementação de um sistema de gerenciamento de aluguéis de filmes, desenvolvido em Java utilizando JDBC com integração ao banco de dados PostgreSQL. O projeto segue os princípios de arquitetura em camadas e padrões DAO para abstração da persistência.

## 🛠️ Tecnologias Utilizadas

- Java 17
- JDBC
- PostgreSQL 14
- IntelliJ IDEA
- Maven

## 📦 Estrutura do Projeto

```
src/
├── main/
│   └── java/
│       └── org.example/
│           ├── dao/               # Interfaces de acesso a dados
│           ├── model/             # Entidades: Cliente, Filme, Aluguel
│           ├── util/              # Conexão com banco + classe Main
├── resources/
├── test/
└── app.sql                        # Script para criação e população do banco
```

## 🧪 Execução do Banco de Dados

1. Certifique-se de ter o PostgreSQL instalado e ativo.
2. Crie um banco com o nome:

```bash
createdb teste_java
```

3. Execute o script de estrutura e inserção de dados:

```bash
psql -d teste_java -f app.sql
```

Esse script cria as tabelas `en_cliente`, `en_filme`, `en_aluguel`, `re_aluguel_filme`, e popula com registros simulados, incluindo geração dinâmica de aluguéis aleatórios.

## 🎯 Funcionalidades Implementadas

- Estrutura de entidades (`Cliente`, `Filme`, `Aluguel`)
- Interfaces `FilmeDAO` e `AluguelDAO` para persistência
- Conexão via `DatabaseConnection.java` com PostgreSQL
- `app.sql` contendo toda a estrutura e dados do banco
- Classe `Main.java` com validação de conexão ao banco

## ⚠️ Observações

Consegui estruturar toda a base do projeto, incluindo as classes, entidades e conexões com o banco, mas acabei não finalizando a interface gráfica. Optei por desenvolver no IntelliJ IDEA, IDE com a qual ainda estou me familiarizando, e também estive envolvido intensamente na preparação de um seminário técnico de encerramento de semestre na faculdade, que ocorre na data de hoje.

Fico totalmente à disposição para esclarecimentos, revisões ou continuação da implementação, caso necessário.

## 📁 Arquivo de Script – `app.sql`

Inclui:

- Criação das tabelas com relacionamentos e constraints
- Inserções de clientes e filmes
- Geração aleatória de aluguéis com datas e valores simulados
- Consultas SQL para:
  - Filme mais antigo
  - Total de aluguéis por cliente
  - Total gasto por cliente por ano (desafio)

## ✅ Status

- [x] Estrutura de banco implementada
- [x] DAO e entidades modeladas
- [x] Conexão funcional com PostgreSQL
- [ ] Interface gráfica em desenvolvimento
