# Anotações
## Como a JVM permite multiplataforma
No java ao invés de precisar criar uma aplicação para cada tipo de distro, como linux, windows, macOS, etc, você cria uma única aplicação que roda em uma JVM (Java Virtual Machine) e o que se adapta a cada distro é a JVM, que é específica para cada sistema operacional. Dessa forma, o desenvolvedor escreve o código uma única vez e ele pode ser executado em qualquer sistema que tenha uma JVM compatível instalada.

## Como funciona a compilação e interpretação no Java
Java é uma linguagem compilada e interpretada, ou seja, você escreve o código num arquivo `.java` e ele compila para bytecode `.class` *(compilada)* para conseguir executar na JVM *(interpretada)*. Ou seja, o `.java` é o que conseguimos entender, e por um comando *(javac)* ele gera o arquivo `.class` um bytecode que o que a JVM consegue entender.

## O que é o JDK?
JDK = Java Development Kit -> JVM, compilador, ferramentas de debug. Geralmente se usa quando vai desenvolver, porque já vem tudo isso instalado junto.
## O que é o JRE?
JRE = Java Runtime Environment -> JVM. Geralmente se usa apenas quando precisa rodar a aplicação.