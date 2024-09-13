import java.lang.reflect.Type
import kotlin.reflect.typeOf

/*Declare variáveis var e val e observe as diferenças.
In Kotlin, you declare a variable starting with a keyword, val or var, followed by the
 name of the variable.

Use the val keyword to declare variables that are assigned a value only once.
 These are immutable, read-only local variables that can’t be reassigned a different
 value after initialization:*/

fun main( ){
    val x: Int = 5
    println("Variable x is $x")


    /*  Use the var keyword to declare variables that can be reassigned. These are mutable variables,
      and you can change their values after initialization:*/

    var y: Int = 7
    println("Variable y is $y")
    y += 1

    println("New y is $y")


    /*Kotlin supports type inference and automatically identifies the data type of a declared variable.
    When declaring a variable, you can omit the type after the variable name:*/
    // Declares the variable x with the value of 5;`Int` type is inferred
    var z = 8
    println("Variable z is $z")


    /*You can use variables only after initializing them. You can either initialize a variable at the moment of
    declaration or declare a variable first and initialize it later. In the second case, you must specify the data type:*/
    var k = 3
    var l: Int
    l = 9
    println("Val k is $k and val l is $l")


}
