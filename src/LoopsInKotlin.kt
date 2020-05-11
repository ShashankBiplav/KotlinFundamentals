fun main() {
    for (myNumber in 1..10){
        println("$myNumber- Welcome")
    }
    //nested for loop
    for (myNumber in 1..10){
        println("$myNumber- Celebrity")
        for (secondNumber in 1..2){
            println("$secondNumber- movie")
        }
    }
}