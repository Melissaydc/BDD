<h1>AF_BDD_Melissa_224141</h1>


## Cenário

Imagine que você está planejando alugar um carro para uma viagem. Para facilitar esse processo, uma empresa de locação de carros desenvolveu um sistema com diferentes comportamentos, dependendo das circunstâncias da locação e do cliente.

Inicialmente, considere um cliente que deseja alugar um carro de luxo. Se esse cliente realizar a reserva com antecedência de pelo menos uma semana, o sistema deve oferecer um desconto especial no valor total da locação. Por outro lado, suponha um cliente que necessita alugar um carro utilitário de última hora, sem qualquer reserva prévia. Nesse caso, o sistema deve ainda conseguir encontrar um veículo disponível e processar a locação rapidamente, mesmo que isso implique em um custo um pouco mais elevado devido à demanda urgente.

Esses cenários exemplificam como o sistema de locação de carros responde às diferentes necessidades e condições dos clientes, adaptando-se para garantir uma experiência satisfatória de locação, seja para reservas antecipadas ou demandas de última hora.

## Gherkin do Cenário

```gherkin
Feature: Sistema de Locação de Carros

  Scenario: Cliente reserva carro de luxo com antecedência
    Given que o cliente deseja alugar um carro de luxo
    And que o cliente realiza a reserva com pelo menos uma semana de antecedência
    When o cliente confirma a reserva
    Then o sistema deve oferecer um desconto especial no valor total da locação

  Scenario: Cliente aluga carro utilitário de última hora
    Given que o cliente deseja alugar um carro utilitário
    And que o cliente não realizou reserva prévia
    When o cliente solicita a locação do carro
    Then o sistema deve encontrar um veículo disponível
    And o sistema deve processar a locação rapidamente
    And o sistema deve aplicar um custo adicional devido à demanda urgente
```
  
  <h2>Pré-requisitos</h2>
  <p>O projeto foi desenvolvido utilizando Java 17 e o IDE Intellij. Na branch "calculadorajunittest", foi utilizado o JUnity 5 para testes automatizados.</p>
  <div>
<img width="60" height="60" src="https://img.icons8.com/fluency/48/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> <img width="60" height="60" src="https://img.icons8.com/color/48/intellij-idea.png" alt="intellij-idea"/><img width="60" height="60" src="https://img.icons8.com/?size=100&id=rPAHs7H1vriV&format=png&color=000000" alt="eclipse-logo"/> <img width="60" height="60" src="https://junit.org/junit5/assets/img/junit5-logo.png" alt="junity-logo"/><img width="60" height="60" src="https://avatars.githubusercontent.com/u/320565?s=280&v=4" alt="cucumber-logo"/>
     
     
</div>

  <h2>Estrutura do Projeto</h2>
  <pre>
        BDD/
        ├── .idea/
        ├── .settings/
        ├── doc/
        ├── src/
        │   ├── main/
        │   │   └── java/
        │   │       └── Conta/
        │   └── test/
        │       └── java/
        │           ├── arquivos_teste.feature
        │           └── Runner
        ├── target/
        ├── .classpath
        ├── .project
        ├── pom.xml
        ├── External Libraries/
        └── Scratches and Consoles/
    </pre>
    <h2>Descrição das Pastas e Arquivos</h2>
    <ul>
        <li><strong>BDD/</strong>: Diretório raiz do projeto.
            <ul>
                <li><strong>.idea/</strong>: Contém os arquivos de configuração do projeto para o IntelliJ IDEA.</li>
                <li><strong>.settings/</strong>: Contém as configurações específicas do Eclipse.</li>
                <li><strong>doc/</strong>: Pasta destinada à documentação do projeto.</li>
                <li><strong>src/</strong>: Diretório principal do código-fonte e dos testes.
                    <ul>
                        <li><strong>main/</strong>: Contém o código-fonte principal do aplicativo.
                            <ul>
                                <li><strong>java/</strong>: Diretório onde o código Java está localizado.
                                    <ul>
                                        <li><strong>Conta/</strong>: Pacote que possivelmente contém classes relacionadas à funcionalidade de "Conta" no sistema.</li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li><strong>test/</strong>: Contém o código de teste.
                            <ul>
                                <li><strong>java/</strong>: Diretório onde os testes em Java estão localizados.
                                    <ul>
                                        <li><strong>arquivos_teste.feature</strong>: Arquivo de especificação de comportamento usando Gherkin para testes BDD.</li>
                                        <li><strong>Runner</strong>: Classe Java que configura e executa os testes BDD.</li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><strong>target/</strong>: Diretório onde os arquivos compilados e artefatos de build são armazenados.</li>
                <li><strong>.classpath</strong>: Arquivo que define o classpath do projeto (Eclipse).</li>
                <li><strong>.project</strong>: Arquivo de configuração do projeto (Eclipse).</li>
                <li><strong>pom.xml</strong>: Arquivo Maven que define as dependências e o build do projeto.</li>
                <li><strong>External Libraries/</strong>: Contém as bibliotecas externas utilizadas pelo projeto.</li>
                <li><strong>Scratches and Consoles/</strong>: Área onde podem ser criadas notas temporárias e consoles de execução.</li>
            </ul>
        </li>
    </ul>

  <h2>Implantações</h2>
  <p>O projeto inclui dois cenários de teste:
   
   - Cliente reserva carro de luxo com antecedência;
   - Cliente aluga carro utilitário de última hora

  <h2>Versionamento</h2>
  <p>Esta é a primeira versão do projeto.</p>

  <h2>Autor</h2>
  <p>O projeto foi desenvolvido por Melissa Yung da Cruz.</p>
  <p>Número de Registro Acadêmico: 224141</p>
  <p>Email de contato: melissaydc@gmail.com</p>