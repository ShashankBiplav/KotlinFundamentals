fun main() {
    var myPerson = Person()
    myPerson.name="Shashank"
    println(myPerson.name)

    var myStudent =Student()
    myStudent.studentId=41510
    myStudent.height=6
}
open class Person(){
    var name:String?= null
    var age:Int?= null
    var height:Int?= null
}
class Student():Person(){
    var studentId:Int?=null
}
class Employee():Person(){
    var employeeId:Int?=null
}