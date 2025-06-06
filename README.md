## <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"> DESAFIO: 🧩 Criando seu Board de Tarefas com Java

# Bradesco - Java Cloud Native 2025 

Esse é um projeto de gerenciamento de tarefas no estilo **Kanban**, onde você pode criar quadros (boards), adicionar tarefas (cards), mover, bloquear e acompanhar o status de tudo com um backend moderno, construído com Java 21 e Spring Boot.

---

## Autores ✍️

- [José Luiz Abreu Cardoso Junior](https://github.com/juniorjrjl)

## Tecnologias Utilizadas

<p align="left">
  <img src="https://img.shields.io/badge/Java-21-blue?style=for-the-badge&logo=openjdk" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.2.3-brightgreen?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/MySQL-8.0-orange?style=for-the-badge&logo=mysql" />
  <img src="https://img.shields.io/badge/Liquibase-Migrations-blueviolet?style=for-the-badge&logo=liquibase" />
  <img src="https://img.shields.io/badge/Gradle-Build%20Tool-02303A?style=for-the-badge&logo=gradle" />
  <img src="https://img.shields.io/badge/Lombok-Code%20Reduction-red?style=for-the-badge&logo=java" />
</p>

---

## Funcionalidades

- Criar e gerenciar boards com colunas personalizadas  
- Criar, mover, bloquear e cancelar cards  
- CRUD completo para tarefas  
- Classificação por categorias: `Pessoal`, `Trabalho`, `Estudo`  
- Controle de status: `Inicial`, `Pendente`, `Cancelado`, `Finalizado`  
- Banco de dados MySQL com versionamento via Liquibase
 
---

## 📁 Estrutura do Projeto

- controller 🎮
 Camada responsável pelos endpoints REST. Onde começam as requisições.

- dto 📦
 Objetos de transferência de dados entre as camadas.

- entity 🧬
 Representações das tabelas no banco: Board, Card, Task.

- repository 📁
 Interfaces que acessam o banco via Spring Data JPA.

- service 🔧
 Toda a lógica de negócio mora aqui — mover cards, validar regras, etc.

- exception 💣
 Controle centralizado de exceções como card bloqueado ou entidade não encontrada.

- persistence/config ⚙️
 Configura

````
board/
├── src/main/java/br/com/dio/
│ ├── controller/
│ │ ├── BoardController.java
│ │ ├── CardController.java
│ │ └── TaskController.java
│ ├── dto/
│ │ ├── BoardColumnDTO.java
│ │ ├── BoardColumnInfoDTO.java
│ │ ├── BoardDetailsDTO.java
│ │ └── CardDetailsDTO.java
│ ├── exception/
│ │ ├── CardBlockedException.java
│ │ ├── CardFinishedException.java
│ │ └── EntityNotFoundException.java
│ ├── persistence/
│ │ ├── config/ConnectionConfig.java
│ │ ├── converter/OffsetDateTimeConverter.java
│ │ ├── dao/
│ │ │ ├── BoardDAO.java
│ │ │ ├── CardDAO.java
│ │ │ └── TaskDAO.java
│ │ ├── entity/
│ │ │ ├── BoardEntity.java
│ │ │ ├── CardEntity.java
│ │ │ └── TaskEntity.java
│ │ └── migration/MigrationStrategy.java
│ ├── repository/
│ │ ├── BoardRepository.java
│ │ ├── CardRepository.java
│ │ └── TaskRepository.java
│ ├── service/
│ │ ├── BoardService.java
│ │ ├── CardService.java
│ │ └── TaskService.java
│ ├── ui/
│ │ ├── BoardMenu.java
│ │ └── MainMenu.java
│ └── Main.java
├── src/main/resources/
│ ├── db/changelog/migrations/
│ │ ├── db.changelog-task.sql
│ │ └── db.changelog-master.yml
│ ├── application-dev.yml
│ └── application-prd.yml
├── build.gradle.kts
└── settings.gradle.kts
`````
# IDE 

- ![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)

# Clone o repositório  

<img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"> [DIO](https://github.com/digitalinnovationone/board.git)

### Desenvolvido na linguagem Java por:

- [Ariana Eger](https://github.com/arisgerr)

## IMPORTANTE

Este projeto foi construído com um viés totalmente educacional para a DIO.

# A aplicação estará disponível em:
👉 http://localhost:8080
