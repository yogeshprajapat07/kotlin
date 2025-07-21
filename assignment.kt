import kotlin.random.Random

fun main() {
    val options = listOf("ROCK", "PAPER", "SCISSORS")
    var userScore = 0
    var computerScore = 0
    var roundsPlayed = 0
    val totalRounds = 3

    println("Welcome to Rock-Paper-Scissors! Let's start the game.")

    while (roundsPlayed < totalRounds) {
        println("\nRound ${roundsPlayed + 1}: Enter your choice (Rock, Paper, or Scissors):")
        val userInput = readLine()?.trim()?.uppercase()

        if (userInput !in options) {
            println("Invalid input! Please enter Rock, Paper, or Scissors.")
            continue
        }

        val computerChoice = options[Random.nextInt(options.size)]
        println("You chose: $userInput")
        println("Computer chose: $computerChoice")

        val result = determineWinner(userInput!!, computerChoice)

        when (result) {
            "DRAW" -> println("It's a draw!")
            "USER" -> {
                println("You win this round!")
                userScore++
            }
            "COMPUTER" -> {
                println("Computer wins this round!")
                computerScore++
            }
        }

        roundsPlayed++
    }

    // Game over and final results
    println("\nGame Over!")
    println("Final Score -> You: $userScore | Computer: $computerScore")

    when {
        userScore > computerScore -> println("Congratulations! You are the overall winner!")
        userScore < computerScore -> println("Computer wins the game! Better luck next time.")
        else -> println("It's a tie overall!")
    }
}

fun determineWinner(user: String, computer: String): String {
    return if (user == computer) {
        "DRAW"
    } else if (
        (user == "ROCK" && computer == "SCISSORS") ||
        (user == "PAPER" && computer == "ROCK") ||
        (user == "SCISSORS" && computer == "PAPER")
    ) {
        "USER"
    } else {
        "COMPUTER"
    }
}
