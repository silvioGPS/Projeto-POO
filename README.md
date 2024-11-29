# Projeto de Gerenciamento de Veículos e Funcionários

## Objetivos do Projeto
O objetivo deste projeto é desenvolver um **sistema de gerenciamento de veículos e funcionários**, permitindo a realização de **cadastros**, **abastecimentos** e **verificações de troca de óleo**. O sistema será dividido em diferentes classes que representam **veículos** (Carro, Moto, Caminhão) e **funcionários**, utilizando conceitos de **programação orientada a objetos** para garantir uma estrutura clara e eficiente.

## Funcionalidades Pretendidas

### 1. Cadastro de Veículos
- Cadastrar **Carros**, **Motos** e **Caminhões** com informações como:
  - Modelo
  - Tipo de combustível
  - Tipo de óleo
  - Quilometragem atual
  - Capacidade do tanque

### 2. Abastecimento de Veículos
- Permitir que o usuário abasteça os veículos cadastrados, calculando o custo com base no tipo de combustível.

### 3. Verificação de Troca de Óleo
- Implementar uma funcionalidade que verifica se o veículo precisa de troca de óleo com base na quilometragem.

### 4. Cadastro de Funcionários
- Cadastrar **funcionários** com informações como:
  - Nome
  - ID

### 5. Listagem de Funcionários
- Listar os **funcionários cadastrados**.

## Cronograma de Desenvolvimento

| Etapa                         | Descrição                                                      | Prazo         |
|-------------------------------|----------------------------------------------------------------|---------------|
| **1. Planejamento**            | Definição de requisitos e funcionalidades                      | 01/11/2023    |
| **2. Estrutura Inicial**       | Criação das classes principais e estrutura do projeto          | 05/11/2023    |
| **3. Implementação Veículos**  | Implementação das funcionalidades de cadastro e abastecimento de veículos | 15/11/2023    |
| **4. Implementação Funcionários** | Implementação das funcionalidades de cadastro e listagem de funcionários | 20/11/2023    |
| **5. Testes e Ajustes**        | Testes de funcionalidades e correção de bugs                   | 25/11/2023    |
| **6. Documentação Final**     | Documentação do projeto e do processo de desenvolvimento       | 30/11/2023    |

# Documentação do Processo de Desenvolvimento

## Introdução
Esta documentação descreve o processo de desenvolvimento do **sistema de gerenciamento de veículos e funcionários**. O projeto foi realizado utilizando princípios de **programação orientada a objetos**, com foco na modularidade e na clareza do código.

---

## Desafios Enfrentados

### 1. Estruturação do Projeto
Um dos primeiros desafios foi definir a estrutura do projeto e as interações entre as diferentes classes (**Carro**, **Moto**, **Caminhão**, **Funcionario** e **Veiculo**). Para resolver isso, utilizei **diagramas de classe** para visualizar as relações e heranças entre os objetos.

### 2. Implementação da Lógica de Abastecimento
A implementação da lógica de abastecimento foi desafiadora, pois exigia que o sistema calculasse o custo do abastecimento com base no **tipo de combustível**. Para garantir que o código fosse reutilizável e fácil de entender, criei **métodos específicos em cada classe de veículo** para calcular o custo do abastecimento.

### 3. Verificação da Troca de Óleo
Outro desafio foi a implementação da **verificação de troca de óleo**. Tive que garantir que a lógica considerasse a **quilometragem atual** e a **última troca de óleo**. Para isso, utilizei métodos que comparam essas duas variáveis e retornam mensagens apropriadas ao usuário.

### 4. Cadastro e Listagem de Funcionários
A funcionalidade de **cadastro** e **listagem de funcionários** exigiu atenção especial à manipulação de dados. Para isso, implementei **métodos de getter** e **setter** na classe **Funcionario**, garantindo que as informações fossem armazenadas e recuperadas corretamente.

---

## Uso do Git

O **Git** foi uma ferramenta essencial para gerenciar o desenvolvimento do projeto. Abaixo estão algumas das maneiras como utilizei o Git durante o processo:

### **Branches**
Criei **branches separadas** para cada funcionalidade, permitindo que eu trabalhasse em partes do projeto de forma isolada sem afetar a branch principal. Isso facilitou a implementação e os testes de cada funcionalidade antes de integrá-las ao projeto principal.

### **Commits Frequentes**
Realizei **commits frequentes** com **mensagens descritivas**, o que ajudou a manter um histórico claro das mudanças e a identificar rapidamente quando e onde um problema poderia ter sido introduzido.

### **Merges**
Após concluir cada funcionalidade, fiz o **merge das branches** na **branch principal**. Isso não apenas integrou as novas funcionalidades, mas também garantiu que a branch principal sempre refletisse a versão mais atualizada do projeto.

---

## Conclusão
Este projeto foi uma excelente oportunidade para aplicar conceitos de **programação orientada a objetos** e de **controle de versão** com **Git**. Os desafios enfrentados durante o desenvolvimento permitiram melhorar minhas habilidades de planejamento, implementação e organização do código.

Se você tiver alguma dúvida sobre o processo de desenvolvimento ou quiser colaborar, fique à vontade para abrir **issues** ou **pull requests**!



