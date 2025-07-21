//basic lambda expreesion
/*fun main(){
    val cold=coffee
    cold()
}
val coffee={
    println("I take cold coffee")
}*/

//using function as a data type
/*fun main(){
    val milkShakeVariable=chooseItem(scopes )
    milkShakeVariable()
}
val coldcoffee:()-> Unit={
    println("I take a coldcoffee")
}
val milkShake:()-> Unit={
    println("i take milk shake")
}
val scopes:(Int)-> String={
    numberOfScope->"i took $numberOfScope scope of ice cream"
}
fun chooseItem(scoops:(Int)-> String):()-> Unit{
    println(scopes(2))
    return milkShake
}*/

//higher order function
/*fun main(){
    repeat(times = 5){
        println(1)
    }
}*/

//triling function
/*fun main(){
    val milkShakeVariable=chooseItem{it;Int
        "i took $it scope of ice cream"
    }
    milkShakeVariable()
}


val milkShake:()-> Unit={
    println("i take milk shake")
}

fun chooseItem(scoops:(Int)-> String):()-> Unit{
    println(scoops(2))
    return milkShake
}*/

//normal code with function
/*fun main(){
    val a=5
    val b=10
    val sum = sum(a,b)
    println("sum:$sum")

}
fun  sum(a:Int,b:Int):Int{
    return a+b
}*/

//code with lambda Expression
fun main(){
    val a=5
    val b=10
    val sum = add(a,b)
    println("sum:$sum")

}
val add:(Int,Int)->Int={

    a,b->a+b
}
