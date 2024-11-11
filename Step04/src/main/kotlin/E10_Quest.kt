fun main() {
    /*

    숫자 하나 입력 받아
    입력한 숫자가 완전수(숫자 약수들의 합이 자기 자신과 동일한 숫자(자기 자신 제외)인지 아닌지 출력

    Ex) 6 : 1 + 2 + 3

     */

    print("숫자를 입력하세요 >> ")

    var n = readln().toInt()
    var num = 0

    for(i in 1 until n) { // 자기 자신을 제외해야 하기 때문에 until로 사용
        if (n % i == 0) {
            num += i
        }
    }
    if(num == n)
        print("$n 은 완전수입니다.")
    else
        print("완전수가 아닙니다.")

}