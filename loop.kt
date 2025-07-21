//for loop...
/*fun main(){
    for (i in 1..30){
        println("checking book $i")
    }
}*/

//while loop...
/*fun main(){
    var book=1
    while (book<=30){
        println("checking book $book")
        book++
    }
}*/

//do-while loop...
/*fun main(){
    var book=1
    do {
        println("checking book $book")
        book++
    } while (book<=30)
}*/

/*fun main(){
    var array=arrayOf<Int>(1,2,3,4,5,6,7,8,9)
    for (i in array){
        println(i)
    }


}*/
data class GroceryItem(val itemName: String, val quantity: Int)

fun main() {
    val groceryList = listOf(
        GroceryItem("apples", 3),
        GroceryItem("bananas", 5),
        GroceryItem("carrots", 2),
        GroceryItem("milk", 1),
        GroceryItem("bread", 2)
    )

    for (item in groceryList) {
        val itemName = item.itemName
        val itemQuantity = item.quantity

        println("There are $itemQuantity numbers of $itemName in our grocery list")
    }
}
