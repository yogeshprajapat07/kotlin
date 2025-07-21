/*class Student{
    var flavour:String=""
    var quantity:Int=0

    //using method in class
    fun packTheCake(){
        println("the $flavour cake is getting packed")

    }

}
fun main(){
    val obj=Student()
    val obj2=Student()

    //properties decleation
    obj.flavour="vanilla"
    obj.quantity=1

    obj2.flavour="chocolate"
    obj2.quantity=2
    println("Aryan order ${obj.flavour} kg of ${obj.quantity} ")
    obj.packTheCake()
}*/

// primary constructor
/*class Student (
    var flavour:String=" ",
    var quantity:Int=0
){
    init {
        println("I am eating")
    }
}
fun main(){
    val obj=Student()
   // val obj2=Student()
    obj.flavour="vanilla"
    println("Aryan order ${obj.flavour}  ")


}*/

//secondary constructor
class Student( var flavour:String="",qunatity:Int=0){
    init {
        println("primary constructor is called")

    }
    constructor(flavour: String):this(flavour, qunatity = 0){
        println("secondary constructor is called")
    }
}
fun main(){
    val obj=Student(flavour="vallila", qunatity = 0)

}