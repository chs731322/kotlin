fun main() {
    /*
        증감 연산자
            ++ --
            전위형 >>  ++변수    > 변수가 속한 연산을 하기 전에 증감
            후위형 >>  변수++    > 변수가 속한 연산을 한 후에 증감
            1씩 증감을 하는 연산자
            유일하게 연산 후 결과가 바로 변수에 저장이 되는 연산자
     */


    var n1 = 10

    println(n1)
    println(n1++) // 후위형 연산자
    println(n1)

    var n2 = 10

    println(n2)
    println(++n2) // 전위형 연산자
    println(n2)

    println("-----------------------------")

    var n3 = 10
    var n4 = 3
    var result = n3++ * 3 + ++n4 * 2 + n3
                // 10*3 + 4*2 + 11 = 49
    println(result)

}