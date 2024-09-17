//  Crie uma função que receba dois números inteiros e retorne a soma.

fun sum(a: Int,b: Int): Int{
    return a+b
}

// A function body can be an expression. Its return type is inferred:

fun sum1(a: Int, b: Int) = a + b


//A function that returns no meaningful value:

fun printSun(a: Int,b: Int): Unit{
    println("fun printSun: A soma entre $a e $b é: ${a+b}")
}

fun main(){
    print("função sum: A soma entre 3 e 5 é: ")
    println(sum(3,5))

    println("Fun sum1: a soma entre 12 e 7 é : ${sum1(12,7)}")

    printSun(7,40)

}