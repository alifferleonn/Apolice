# Sistema de Gestão de Apólices

Este projeto em Java implementa um sistema simples para gerenciar apólices de seguro, permitindo a criação, visualização e cálculo do valor de apólices com base em parâmetros como idade, sexo e valor do automóvel.

## Estruturas Principais

### 1. Classe `Apolice`
A classe `Apolice` representa uma apólice de seguro e contém informações básicas como número da apólice, nome do segurado, idade, sexo e valor do automóvel.

#### Atributos:
- **`numero`**: Número da apólice.
- **`nome`**: Nome do segurado.
- **`idade`**: Idade do segurado.
- **`sexo`**: Sexo do segurado (definido pela enumeração `Sexo`).
- **`valorAutomovel`**: Valor do automóvel do segurado.

#### Métodos:
- **`getNumero()`**: Retorna o número da apólice.
- **`getNome()`**: Retorna o nome do segurado.
- **`getIdade()`**: Retorna a idade do segurado.
- **`getSexo()`**: Retorna o sexo do segurado.
- **`getValorAutomovel()`**: Retorna o valor do automóvel.
- **`calcularValor()`**: Calcula o valor da apólice com base em regras de idade e sexo do segurado.
- **`imprimir()`**: Retorna uma string formatada com as informações da apólice e o valor calculado.

### 2. Classe `MainAppApoliceGUI`
A classe `MainAppApoliceGUI` é responsável pela interface gráfica do sistema, construída com a biblioteca **Swing**.

#### Atributos:
- **`frame`**: Janela principal da aplicação.
- **`apolices`**: Lista de apólices armazenadas em um `ArrayList`.

#### Métodos:
- **`placeComponents()`**: Configura os componentes da interface gráfica, como campos de entrada e botões.
- **`showApplianceData()`**: Exibe uma janela com os dados das apólices armazenadas.
- **`main()`**: Inicia a aplicação.

### 3. Enum `Sexo`
A enumeração `Sexo` define os valores possíveis para o sexo do segurado:

- **`MASCULINO`**
- **`FEMININO`**

## Funcionalidades

- **Criação de Apólices**: Permite que o usuário insira o número da apólice, nome, idade, sexo e valor do automóvel.
- **Cálculo Automático**: O sistema calcula o valor da apólice com base em critérios como idade e sexo do segurado.
- **Validação de Dados**: Verifica a entrada do usuário e garante que os dados sejam válidos.
- **Visualização de Apólices**: Exibe os dados das apólices cadastradas em uma tabela.

## Exemplo de Uso

1. Adiciona uma nova apólice com os seguintes dados: número, nome, idade, sexo e valor do automóvel.
2. Calcula o valor da apólice automaticamente com base nas regras estabelecidas.
3. Exibe os dados de todas as apólices criadas em uma tabela.
4. Valida as entradas do usuário para evitar erros.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Swing**: Biblioteca para a construção da interface gráfica.
- **POO**: Programação Orientada a Objetos para a estruturação do projeto.
