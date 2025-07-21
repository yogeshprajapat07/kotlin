/*fun main() {
    val personNames = arrayOf<String>("Alice", "Bob", "Charlie", "David", "Eva")
    val arraySize = personNames.size
    println("Size of the array: $arraySize")
    personNames[3]="Rohit"
    println(personNames[3])

}*/


//list
/*fun main() {
    val emailIdBook = mutableListOf<String>(
        "email1@gmail.com" ,
        "email2@gmail.com"
    )


    emailIdBook.add("email3@gmail.com")


    println(emailIdBook.size)


}*/

//map
// map is contain (key and value)
fun main() {
    val emailIdBook = mutableMapOf(
        "email1@gmail.com" to "Name 1",
        "email2@gmail.com" to "Name 2"
    )


    emailIdBook.remove("email1@gmail.com")


    println(emailIdBook)


}