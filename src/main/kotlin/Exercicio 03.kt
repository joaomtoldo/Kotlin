import sun.font.TrueTypeFont

// Pratique tipos de dados básicos como Int, Double, String, Boolean.


fun main(){
//Declarar variáveis com os tipos básico
    // variável do tiop inteiro
    val age: Int = 40

//    variável do tipo ponto flutuante
    val height: Double = 1.85

//    Variável do tipo booleana
    val isStudent: Boolean = true

//    variável do tipo texto ( String)
    val name: String = "João"

//     exibindo os valores
    println("Nome: $name")
    println("Idade: $age")
    println("Altura: $height")
    println("É estudante?: $isStudent")





//     CONVERSÃO ENTRE TIPOS DE DADOS:

    val numero: Int = 10
    val double: Double = numero.toDouble() //Converte de Int para Double
    println("Número inteiro: $numero")
    println("Número decimal: $double")

    val text: String = "2024"
    val convertedNum: Int = text.toInt() //Converte string para inteiro
    println("texto convertido para inteiro: $convertedNum")


//    Usando operações com diferentes tipos de dados

    val num01: Int = 10
    val num02: Double = 5.5
    val resultado: Double = num01 + num02

    println("A soma de $num01 e $num02 é $resultado")

//    Declaração de constantes usando val e variaves mutáveis usando var

    val pi: Double = 3.14159 // constante não pode ser alterada
    var raio: Double = 2.0 // variavel mutável

    var areaCirculo: Double = pi * raio * raio
    println("A área do circulo é $areaCirculo")
//    mudando o valor do raio
    raio = 3.0
    var newArea: Double = pi * raio * raio
    println("A nova área do circulo é $newArea")


//    Entrada de dados do usuário e uso de tipos de dados:

    print("Digite sua idade: ")
    val idade = readLine()?.toIntOrNull() ?: 0 // lê a idade como string e converte para Int

    println("Digite sua altura: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0 // lê a altura como string e converte para Int

    if(idade > 0 && altura > 0.0){
        println("Sua idade é $idade e sua altura é $altura")
    }else{
        println("Entrada inválida")
    }

}
/*

Explicação:
readLine(): Lê uma linha de texto do teclado.
toIntOrNull(), toDoubleOrNull(): Tentam converter a entrada para Int ou Double. Se a conversão falhar,
retorna null. O operador ?: define um valor padrão em caso de falha.
Esses exemplos abordam tipos básicos de dados e conversões em Kotlin,
além de introduzir o uso de entradas de dados e variáveis imutáveis/mutáveis.*/
