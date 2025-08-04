
# 🎓 Cadastro de Membros Universitários em Java

Este é um projeto simples desenvolvido como parte do meu aprendizado em Java. O objetivo é praticar conceitos fundamentais da linguagem, como:

* Classes e objetos
* Construtores com validação
* Herança
* Polimorfismo
* Sobrescrita de métodos
* Interfaces
* Estrutura de repetição
* Entrada de dados com `Scanner`
* Utilização de `ArrayList`

---

## 🚀 O que o programa faz?

O programa permite que o usuário cadastre um número definido de membros acadêmicos, podendo ser:

* Aluno
* Professor
* Monitor

Para cada membro, o usuário informa:

* Nome
* Matrícula
* Informações específicas (ex: horas de estudo, aulas ministradas, disciplina, etc.)

Após o cadastro, o programa exibe:

* Os dados informados
* Uma apresentação personalizada
* A pontuação de atividade mensal, calculada conforme o tipo de membro

---

## 🧠 Aprendizados

Com este projeto, pratiquei os seguintes conceitos de Java:

* **Herança**: `Aluno`, `Professor` e `Monitor` herdam da classe abstrata `Pessoa`
* **Polimorfismo**: uso de um `ArrayList<Pessoa>` com objetos de diferentes subclasses
* **Interfaces**: todos os membros implementam a interface `MembroUniversitario`, que define o comportamento comum
* **Sobrescrita de métodos**: cada tipo de membro possui uma forma diferente de se apresentar e calcular sua pontuação
* **Encapsulamento**: uso de `getters` e `setters` para acessar os atributos privados
* **Scanner**: leitura de entradas do usuário no terminal
* **Estrutura de repetição e decisão**: para percorrer e classificar os membros cadastrados

---
