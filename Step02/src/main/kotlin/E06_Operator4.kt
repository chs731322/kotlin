fun main() {
    //관계(비교) 연산자
    // >    <   >=  <=  ==  !=


    var a = 10
    var b = 3

    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)

    println("------------------------")

    var c = 1.2
    var d = 1.1 + 0.1
    println(c == d) // 조건식

    println("------------------------")

    var result = a + 5 < 20 // 사칙연산 먼저, 비교 연산자가 그 뒤에 연산
    println(result)



}