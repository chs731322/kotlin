fun main() {
    /*

    숫자 하나를 입력 받은 후
    입력 받은 숫자만큼 HelloWorld 출력


     */

    print("숫자를 입력하세요 >> ")

    var n = readln().toInt()

/*
    for(i in 1..n) {
        println("Hello World")
    }
    */

    /*
    for(i in 0 until n)
        println("Hello World")
    */

    for(i in n downTo 1)
        println("Hello World")
    
}