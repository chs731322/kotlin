fun main() {
    /*

    숫자 하나를 입력 받은 후
    입력 받은 숫자만큼 HelloWorld 출력


     */
    print("숫자를 입력하세요 >> ")

    var n = readln().toInt()
    /*    var i = 0

        while ( i < n ) {
            println("Hello World!")
            a++
        }
        */

    /*
    while (true) {
        println("Hello World!")
        n--
        if (n == 0)
            break
    }
    */

    while (n > 0) {
        println("Hello World")
        n--
    }

}