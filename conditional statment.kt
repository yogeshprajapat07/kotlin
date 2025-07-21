/*fun main() {
    val number = 20
    if (number > 10) {
        println("Greater than 10")
    } else {
        println("Not greater than 10")
    }

}*/

enum class WeatherCondition{
    RAINY,
    SUNNY,
    CLOUDY
}
/*fun main(){
    val currentWeatherCondition:WeatherCondition=WeatherCondition.CLOUDY
    if (currentWeatherCondition==WeatherCondition.RAINY){
        println("it is raining. carry an umbrella")

    }else if (currentWeatherCondition==WeatherCondition.CLOUDY){
        println("it is cloudy. bring an umbrella just in case")
    }

    else{
        println("it is not raining. not carry umbrella")
    }
}*/

//When statement
/*fun main(){
    val currentWeatherCondition:WeatherCondition=WeatherCondition.CLOUDY
    when (currentWeatherCondition){
        WeatherCondition.CLOUDY -> println("it is cloudy. bring an umbrella just in case")
        WeatherCondition.SUNNY ->  println("it is not raining. not carry umbrella")
        WeatherCondition.RAINY -> println("it is raining. carry an umbrella")
    }

}*/

//(in) is range keyword...
/*fun main(){
    var numToCheck=21

    when(numToCheck){
        in 0..10->println("one digit number")
        in 11..20,in 21..30->println("two digit number")
    }

}*/

//if-else Expression
/*fun main(){
    val currentWeatherCondition:WeatherCondition=WeatherCondition.CLOUDY
   val message= if (currentWeatherCondition==WeatherCondition.RAINY)
        "it is raining. carry an umbrella"
    else if (currentWeatherCondition==WeatherCondition.CLOUDY)
        "it is cloudy. bring an umbrella just in case"
    else
        "it is not raining. not carry umbrella"
    println(message)

}*/


//when Expression
fun main(){
    val currentWeatherCondition:WeatherCondition=WeatherCondition.CLOUDY
   val message= when (currentWeatherCondition){
        WeatherCondition.CLOUDY -> ("it is cloudy. bring an umbrella just in case")
        WeatherCondition.SUNNY ->  ("it is not raining. not carry umbrella")
        WeatherCondition.RAINY -> ("it is raining. carry an umbrella")
    }
    println(message)

}