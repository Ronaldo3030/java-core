# Anotações aula 2
## Como a JVM permite multiplataforma
No java ao invés de precisar criar uma aplicação para cada tipo de distro, como linux, windows, macOS, etc, você cria uma única aplicação que roda em uma JVM (Java Virtual Machine) e o que se adapta a cada distro é a JVM, que é específica para cada sistema operacional. Dessa forma, o desenvolvedor escreve o código uma única vez e ele pode ser executado em qualquer sistema que tenha uma JVM compatível instalada.

## Como funciona a compilação e interpretação no Java
Java é uma linguagem compilada e interpretada, ou seja, você escreve o código num arquivo `.java` e ele compila para bytecode `.class` *(compilada)* para conseguir executar na JVM *(interpretada)*. Ou seja, o `.java` é o que conseguimos entender, e por um comando *(javac)* ele gera o arquivo `.class` um bytecode que o que a JVM consegue entender.

## O que é o JDK?
JDK = Java Development Kit -> JVM, compilador, ferramentas de debug. Geralmente se usa quando vai desenvolver, porque já vem tudo isso instalado junto.

## O que é o JRE?
JRE = Java Runtime Environment -> JVM. Geralmente se usa apenas quando precisa rodar a aplicação.

---

# Anotações aula 5

## Como rodar um código java da maneira mais simples possível
Criar um arquivo `.java` com mesmo nome da classe, seguindo os padrões do JAVA.
```Java
public class OlaMundoDoido {
  public static void main (String[] args) {
    System.out.println("Teste teteste tteete");
  }
} 
```
Compilar esse arquivo com o `javac` para gerar o seu bytecode `.class`, com o bytecode `.class` consegue rodar a aplicação com a JVM usando o comando `java nomeDoArquivo` sem usar o prefixo `.class`. Com isso terá o resultado no console: 
```Bash
Teste teteste tteete 
```
Sempre que fizer uma modificação tem que rodar novamente o `javac` para compilar de novo e conseguir ver as modificações no bytecode `.class`.

---

# Anotação aula 10
## Tipos primitivos
Os tipos primitivos são os tipos que já vem como base do Java, e são palavras reservadas, são eles: `int, float, double, char, byte, short, long, boolean`.

No java a atribuição de uma variável funciona da seguinte maneira. Quando você declara uma variável de tipo primitivo, a JVM já reserva uma quantidade de espaço grande o suficiente para armazenar um valor daquele tipo *(por exemplo, 4 bytes para um int)*, e quando você atribui um valor como 10 `age = 10`, você está alocando o valor 10 dentro do espaço da memória de `age`.