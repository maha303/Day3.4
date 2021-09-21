import kotlin.random.Random
fun  main() {

    class Country(val Name: String, val Capital: String) {

        fun country() {

            println("The capital of $Name, is $Capital")
        }}

        val countries = listOf(
            Country("Usa", "Washington"),
            Country("UAE", "Abu Dhabi"),
            Country("ksa", "Riyadh"),
            Country("Japan", "Tokyo"),
            Country("Jordan", "Amman"),
            Country("France", "Paris")
            )

        var question = 0
        var score = 0

        while(true){
        val currentCountry = countries[Random.nextInt(countries.size)]
        println("What is the capital of ${currentCountry.Name}?")
        question ++

        val answer = readLine()
        if(answer!! == currentCountry.Capital){
            println("You got it!")
            score ++

        }else{
            println("Wrong guess.")
            currentCountry.country()
        }

        if(question >= 3){
            println("You have guessed $score out of 3 correctly.")
            question = 0
            score = 0
            print("Would you like to play again? (Y/N)")
            if(readLine()!!.uppercase() != "Y"){
                break
            }
        }
    }

    }

