## Projeto - Sistema de Controle de funcionarios com banco de dados
### Centro Paula Souza - Fatec Ferraz - Curso de Análise e Desenvolvimento de Sistemas
### Disciplina – Engenharia de Software III – Prof. Alecio

- Diego Fernandes Lins

### Objetivo
Reduzir o esforço necessário para escrever códigos para o gerenciamento de objetos que devem persitidos em bancos de dados relacionais
Ao seguir a estrutura do 'JPA Provider’, será permitida a fácil interação com uma instância de banco de dados

### Processo de Desenvolvimento
Divisão da arquitetura em 3 fases
### Fase 1
Fase de dados do objeto, contém classes POJO, interfaces de serviço e classes. 
É a principal camada de componente de negócios, que possui operações e atributos de lógica de negócios.
### Fase 2
Fase de mapeamento ou persistência, que contém o provedor JPA, o arquivo de mapeamento (ORM.xml), o JPA Loader e a Grade de Objetos.
JPA Provider 
Eclipselink, Toplink, Hibernate
Mapping file
Arquivo de mapeamento (ORM.xml) 
JPA Loader
Funciona como memória cache, que pode carregar os dados da grade relacional. 
Interage com as classes de serviço dos dados POJO (Atributos da classe POJO).
Object Grid 
Local temporário que pode armazenar a cópia de dados relacionais
Todas as consultas no banco de dados são efetuadas primeiro nos dados na grade de objetos. 
### Fase 3
Contém os dados relacionais conectados logicamente ao componente de negócios

### Backlog do produto
- REQ01 – Criar um banco de dados
- REQ02 – Cadastrar funcionario
Então: o sistema valida os dados E apresenta uma mensagem confirmando o cadastro do funcionario
- REQ03 - Consultar funcionario
- REQ04 - Alterar funcionario
- REQ05 - Excluir funcionario



