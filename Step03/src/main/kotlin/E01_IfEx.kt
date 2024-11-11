fun main() {
    /* if문

        if(조건식) {
            실행할 코드
        }

     //조건식이 true 일때만 해당 {} 영역에 있는 코드를 순서대로 실행
    */

    var a = 10

    if(++a > 5) {
        println("> a는 5보다 큽니다.")
    }

    if (++a <= 5) {
        println("> a는 5보다 작거나 같습니다.")
    }
    println(a)

    println("-----프로그램 종료-----")

}