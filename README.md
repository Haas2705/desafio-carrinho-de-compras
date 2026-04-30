# Carrinho de Compras em Java (Array)

## 1. Descrição

Este projeto consiste na implementação de um sistema de carrinho de compras em Java utilizando um array unidimensional. O desenvolvimento foi realizado com o objetivo de aplicar conceitos fundamentais de Programação Orientada a Objetos (POO) e manipulação de estruturas de dados básicas.

O sistema permite a realização de operações essenciais sobre um conjunto de produtos, simulando o comportamento de um carrinho de compras em ambiente de console.

---

## 2. Objetivos de Aprendizagem

* Aplicar conceitos de Programação Orientada a Objetos
* Trabalhar com arrays de tamanho fixo
* Controlar manualmente o estado de ocupação de um array
* Implementar operações de inserção, remoção e busca
* Estruturar um sistema simples em múltiplas classes
* Praticar entrada e saída de dados com a classe Scanner

---

## 3. Estrutura do Projeto

O sistema foi organizado em três classes principais, cada uma com responsabilidade bem definida.

### 3.1 Classe Produto

Responsável pela representação de um produto.

**Atributos:**

* nome (String)
* preco (double)

**Métodos:**

* Construtor para inicialização dos atributos
* Getters e setters
* Método `toString()` para exibição formatada dos dados

---

### 3.2 Classe Carrinho

Responsável pela lógica de manipulação dos produtos.

**Atributos:**

* `Produto[] produtos`
* `int tamanhoAtual`
* `static final int TAMANHO_MAXIMO`

**Responsabilidades:**

* Gerenciar a inserção de produtos no array
* Realizar remoção com reorganização dos elementos
* Controlar o número de posições ocupadas
* Disponibilizar métodos de acesso e busca

---

### 3.3 Classe Main

Responsável pela interação com o usuário.

**Funções:**

* Exibir menu de opções
* Capturar entradas via Scanner
* Direcionar as ações para a classe Carrinho

---

## 4. Funcionalidades Implementadas

### 4.1 Adicionar Produto

Insere um novo produto na próxima posição disponível do array, respeitando o limite máximo definido.

### 4.2 Remover Produto

Remove um produto a partir de um índice informado. Após a remoção, os elementos subsequentes são deslocados para manter a continuidade do array.

### 4.3 Exibir Carrinho

Percorre o array até a posição definida por `tamanhoAtual` e exibe os produtos armazenados.

### 4.4 Acessar Produto

Permite recuperar os dados de um produto específico com base no índice informado.

### 4.5 Pesquisar Produto

Realiza a busca de um produto pelo nome, utilizando comparação de strings sem distinção entre maiúsculas e minúsculas.

---

## 5. Decisões de Implementação

* Utilização de array fixo para reforçar o controle manual de memória e índices
* Separação de responsabilidades entre classes (modelo, lógica e interface)
* Controle do estado do array por meio da variável `tamanhoAtual`
* Implementação manual do algoritmo de remoção com deslocamento de elementos

---

## 6. Limitações

* Estrutura baseada em array com tamanho fixo
* Ausência de tratamento robusto de exceções para entrada de dados
* Interface limitada ao console
* Ausência de persistência de dados

---

## 7. Evolução do Projeto

O projeto será evoluído em etapas, mantendo controle de versões:

* v1: Implementação inicial com array (versão atual)
* v2: Refatoração e validações de entrada
* v3: Substituição do array por ArrayList
* v4: Reestruturação utilizando Spring Boot com arquitetura em camadas

---

## 8. Execução

Para compilar e executar o projeto:

```bash
javac Main.java
java Main
```

---

## 9. Considerações Finais

O projeto cumpre o objetivo de consolidar conceitos fundamentais de programação em Java, especialmente no que se refere à manipulação de arrays e organização de código em um modelo orientado a objetos.
