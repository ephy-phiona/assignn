fun main(){
    var name=helloname("hello Phiona")
    var hello=helloname("hello tamara")
println(name)
    println(hello)
    var modulus=remainder(70,4)
    var mode=remainder(30, 40)
     println(modulus)
    println(mode)
    var y=sum(10, 20, 30, 40)
    var x=sum(20, 40, 60, 80)
    println(y)
     println(x)
var g = fact( "party","hollic")
    println(g)
}fun helloname(name: String):String{
    var name=("hello $name")
    return name
}
fun remainder(a: Int,b: Int):Int{
    var remainder=a%b
    return remainder

}
fun sum(a: Int,b: Int,c: Int,d: Int):Int{
    var sum = a + b + c + d
    return sum
}
fun fact(name1: String,name2: String):String{
    var fact=("$name1, $name2")
    return fact
}