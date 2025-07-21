import kotlin.time.TimeMark

/*open class Vehicle(val name: String){
   open fun commonFeature(){
        println("I am travelling in a $name")
    }
}
class CarWithSunroof(name: String):Vehicle(name){
    fun specificFeature(){
        println("$name has 4 wheels")
    }
    override fun commonFeature(){
        super.commonFeature()
        println("I am operating the sunroof in a $name")
    }
}
class Car(name: String):Vehicle(name){
    fun specificFeature(){
        println("$name has 4 wheels")
    }
}
class Bike(name: String):Vehicle(name) {
    fun specificFeature() {
        println("$name has 2wheels")
    }
}
fun main (){
    val obj=CarWithSunroof ("wagon R")
    obj.specificFeature()
    obj .commonFeature()


    val pulsar=Bike("Bajas Pulsur 200NS")
    pulsar.specificFeature()
    pulsar.commonFeature()

}*/


//Data class
/*data class Book(val title: String, val author: String,val year: Int)
fun main(){
    val harryPotter=Book(
        title = "The harry potter",
        author = "J K Rowlling",
        1997


    )

    println("Title:${harryPotter.title}")
    println("Author:${harryPotter.author}")
    println("Year:${harryPotter.year}")

}*/


// Enum class
enum class Subject {
    MATH,
    ENGLISH,
    HISTORY,
    CHEMISTRY,
    BIOLOGY


}
fun main(){
    val mysub1=Subject.MATH
    val mysub2=Subject.BIOLOGY
    println("$mysub1")
    println("$mysub2")
}