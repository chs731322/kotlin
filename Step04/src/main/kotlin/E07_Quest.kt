fun main() {
    /*

    숫자를 입력받아 해당 숫자의 팩토리얼을 구하는 프로그램을 작성하시오.

     */

    print("숫자를 입력하세요 >> ")
    var n = readln().toInt()
    var sum = 1

/*
    //for
    for(i in 1..n)
        sum *= i
    print("해당 숫자의 팩토리얼 >> " + sum)
*/

    //while
    while(n > 0) {
        sum *= n--
    }
    print("해당 숫자의 팩토리얼 >> " + sum)
}