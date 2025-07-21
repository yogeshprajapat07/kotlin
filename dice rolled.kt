/*import kotlin.random.Random
import kotlin.concurrent.thread
import kotlin.system.exitProcess

fun main() {
    // (v) Prompt for the user's name
    print("Enter your name: ")
    val playerName = readLine() ?: "Player"

    // (ii) Welcome message
    println("Welcome to DiceRun, $playerName! 🎲")
    println("Get ready to roll the dice...")

    // (iv) Simulate a short delay (1 second)
    Thread.sleep(1000)

    // (iii & vii) Simulate a dice roll (random number from 1 to 6)
    val diceResult = Random.nextInt(1, 7)

    // (vi) Display the result with a personalized message
    println("$playerName, you rolled a $diceResult!")

    // (viii) Terminate program
    println("Thanks for playing DiceRun, $playerName! Goodbye.")
}*/
// solution by company
fun main() {
    val playerName = getPlayerName()
    val randomSide = (1..6).random()

    println("Hello, $playerName! Welcome to DiceRun!")
    println("Rolling the dice...")
    Thread.sleep(1000) // Simulating a short delay for suspense
    println("The dice shows: $randomSide")
}

fun getPlayerName(): String? {
    print("Enter your name: ")
    return readLine()
}
