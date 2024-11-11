fun main() {
    /*
    *   논리연산자
            &&  ||  !
            &&(AND) : 양쪽의 결과가 모두 true일 때만 true
            ||(OR) : 한쪽의 결과가 true이면 true
            !(NOT) : true > false, false > true


     */

    var a = true
    var b = false
    println(a && b)
    println(a || b)
    println(!a)
    println(!b)

    println("------------------------")

    var c = 10
    var d = 3

    println(c > 3 && d > 3)
    println(c > 3 || d > 3)
    println(!(c > 3))
    println(!(d > 3))

    println("------------------------")

    //단락회로 (Short Circuit)
    var e = 10
    var f = 3
    var result = e < 3 && ++f > 3   // 앞 연산에서 result 연산이 끝났기 때문에 f가 증가하지 않음  (뒤의 연산 생략)
    println(result)
    println(f)

    result = e > 3 || ++f > 3   // 앞 연산에서 result 연산이 끝났기 때문에 f가 증가하지 않음 (뒤의 연산 생략)
    println(result)
    println(f)

}