fun main() {
    /*
        숫자 하나를 입력 받아서 해당 숫자가 홀수인지 짝수인지 판단하는 코드를 작성하시오.
        0은 짝수로 취급
     */

    print("숫자를 입력하세요 >> ")
    val num = readln().toInt()

    if(num % 2 == 0) {
        println("해당 숫자는 짝수입니다.")
    } else {
        println("해당 숫자는 홀수입니다.")
    }
    println("-----프로그램 종료-----")

}