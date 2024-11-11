fun main() {
    // 사칙연산자
    //  +    -   *   /   %

    var a = 10
    var b = 3

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

    println("---------------------------------")

    var c = 10.0
    var d = 3.0

    println(c + d)
    println(c - d)
    println(c * d)
    println(c / d)
    println(c % d)
    println()

    println("---------------------------------")
    //형변환
    //  toByte(), toShort(), toInt(), toDouble()....

    var e = 10
    var f = 3

    var result = e / f
    println(result)

    var result2 = e.toDouble() / f  //   e는 일반 형변환, f는 자동 형변환 (auto casting)
    println(result2)
    println(e / f) // 형변환을 해도 해당 연산에서만 임시로 바뀐다.

    var result3 = e / f.toDouble()  //   f는 일반 형변환, e는 자동 형변환
    println(result3)

    println("---------------------------------")
    // 데이터 입력
    var n1 = readln().toInt()
    var n2 = readln()

    var r = n1 + n2.toInt()
    println(r)

}