fun main() {
    /*

    숫자 1~100 합 출력

     */

    //while문
    var i = 0
    var sum = 0

    while ( i < 100 ) {
        sum += ++i
    }
    println(sum)

    //for문
    sum = 0
    for (i in 1..100) {
        sum += i
    }
    println(sum)
}