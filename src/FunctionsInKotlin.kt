fun main() {
    functionOne()
    functionTwo()
    var result =multiply(3,4)
    println(result)
    subtract(999,222)
}
fun functionOne(){//useCamelCase
    println("functionOne() is executed")
}
fun functionTwo(){//useCamelCase
    println("functionTwo() is executed")
}
fun multiply(firstNumber:Int, secondNumber:Int):Int{
    var result = firstNumber * secondNumber
    return result
}
fun subtract(firstNumber:Int, secondNumber:Int):Unit {//Unit means that we don't expect the function to return a value
    println(firstNumber-secondNumber)
}