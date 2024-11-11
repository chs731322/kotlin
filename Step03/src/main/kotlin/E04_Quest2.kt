fun main() {
    /*
           숫자 두개를 입력 받아 입력 받은 두 숫자의 뻴셈 결과를 반드시 양수로 출력
     */

    print("숫자를 입력하세요 >> ")
    val num1 = readln().toInt()
    print("숫자를 입력하세요 >> ")
    val num2 = readln().toInt()

    var result = num1 - num2

    if(result < 0) {
        result = -result
    }

    println("두 수의 뺄셈 결과 >> " + result)
}