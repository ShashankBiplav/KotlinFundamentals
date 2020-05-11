fun main() {
    var myCar:Car = Car()
    println("Speed of myCar object = "+myCar.speed)
    var yourCar:Car = Car()
    yourCar.speed = 200
    println("Speed of yourCar object = "+yourCar.speed)
}
class Car{
    //these variables are properties of class Car
    var speed:Int = 0
    var power:Int = 0
    var name:String =""
    var numberOfWheels:Int = 0
}