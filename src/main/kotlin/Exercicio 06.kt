import java.time.Year

// Crie um programa que leia dois números e exiba a multiplicação entre eles.

fun multiply (a: Int, b: Int): Int {
    return a*b
}
fun main(){
    println("****** Programa para Multiplicar Dois Números simples ******")
    print("Digite o primeiro numero: ")
    val num01 = readLine()?.toIntOrNull() ?: 0
    print("Digite o segundo numero: ")
    val num02 = readLine()?.toIntOrNull() ?: 0
    val result01 = num01 * num02
    println("A multiplicação de $num01 e $num02 é $result01")
    println()
    println()
    println("****** Programa para Multiplicar Dois Números através de uma função ******")
    print("Digite o primeiro numero: ")
    val a = readLine()?.toIntOrNull()
    print("Digite o segundo numero: ")
    val b = readLine()?.toIntOrNull()
    if(a!=null && b!=null){
        println("A multiplicação entre $a e $b é ${multiply(a,b)}")
    }else{
        print("Valores inválidos")

    }
    println()
    println()
    println("Multiplicacão com validaão de entrada")
    fun lerNumero(mensagem: String): Double {
        var numero: Double? = null
        while (numero == null){
            print(mensagem)
            numero = readLine()?.toDoubleOrNull()
            if(numero==null){
                println("Entrada inválido, por favor digite um numero válido x.x")
            }
        }
        return numero
    }
    var x = lerNumero("Digite o primeiro número: ")
    var y = lerNumero("Digite o segundo número: ")
    var result02: Double = x * y
    println("A multiplicação entre $x e $y é $result02")
    println()
    println()


    println("##### Multiplicação com formatação de resultado #####")

    var z = lerNumero("Digite um número: ")
    var k = lerNumero("Digite o segundo número: ")
    var result03 = z * k
    println("O resultado da multiplicação de %.2f e %.2f é %.2f".format(z,k,result03))







}