# **ContaTerminal - README**

O código fornecido é uma aplicação simples em Java que simula a criação de uma conta bancária em um terminal. Ele interage com o usuário através do console para obter detalhes da conta, como nome do cliente, número da agência, número da conta e saldo inicial. O objetivo principal deste código é praticar a entrada de dados pelo console e manipulação básica de strings e números em Java.

# **Estrutura do Código**

- O código está estruturado como uma classe Java chamada **'ContaTerminal'**.
- A entrada do programa é gerenciada pelo método **'main'**, que é o ponto de entrada para a execução do programa.
- O código utiliza a classe __'Scanner'__ para obter entradas do usuário a partir do console. Ele também usa a configuração de localização **'Locale.US'** para lidar com a formatação de números, permitindo o uso de ponto decimal para números fracionados.

# **Passo a Passo**

1. **Configuração do Scanner:**
- O **'Scanner'** é configurado para usar a configuração de localização **'Locale.US'**.
2. **Interação com o Usuário:**
- O programa solicita informações ao usuário sobre o nome do cliente, número da agência, número da conta e saldo inicial.
- As informações são coletadas por meio de chamadas ao **'scanner.nextLine()'** para strings e **'scanner.nextDouble()'** para números decimais.
3. **Exibição dos Resultados:**
- Após coletar as informações necessárias, o programa exibe uma mensagem de confirmação para o usuário. A mensagem resume os detalhes da conta recém-criada, incluindo o nome do cliente, o número da agência, o número da conta e o saldo inicial disponível para saque.


# **Instruções de Uso**
1. **Compilação do Código:**
- Para compilar o código, use um compilador Java como o **'javac''**.
- No terminal, navegue até o diretório onde o arquivo **'ContaTerminal.java'** está localizado e execute o comando:
```
 javac ContaTerminal.java 
```
2. **Execução do Programa:**
- Após a compilação bem-sucedida, execute o programa com o comando:
```
java ContaTerminal
```
3. **Interação com o Programa:**
- Siga as instruções do console para fornecer as informações solicitadas.
- Após inserir todos os dados, o programa exibirá uma mensagem de confirmação com os detalhes da conta.


# **Observações Finais**
- Este programa é uma simulação básica e não interage com bancos reais ou persistência de dados.
- Use este código para praticar conceitos básicos de entrada/saída em Java e para aprender como interagir com o usuário por meio do console.


