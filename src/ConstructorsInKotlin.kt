fun main() {
    var myBoxer:Boxer = Boxer("Mike Tyson",2000,3000 )
    var secondBoxer:Boxer = Boxer("Mike",200) //object using custom constructor
}
class Boxer(name:String, power:Int, speed:Int){
    private var name:String = ""
    private var power:Int? = null
    private var speed:Int = 0


    init { //it is executed the moment an object of the class is initialized
        this.name = name
        println("$name-$power-$speed")
    }

    fun getName():String{
        return name
    }
    constructor(name: String,power: Int){ //custom constructor
        this.name = name
        this.power= power
    }
}