// Leia um número do teclado e imprima-o.

fun main(){
    print("Digite um numero inteiro: ")
    var num = readLine()?.toIntOrNull()

    if(num != null ){
        print("O numero digitado foi : $num")
    } else{
        print("Você não digitou um numero inteiro")
    }

}