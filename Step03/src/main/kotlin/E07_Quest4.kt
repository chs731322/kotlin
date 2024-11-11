fun main() {
    // r * (최대값 - 최소값 + 1 ) + 최소값
    //  > 정수로 형변환
    // Math.random() > 0.0001 ~ 0.9999

    var mise = ( Math.random() * 301 ).toInt()

    println("미세먼지 농도 >> $mise")

    /*
    미세먼지 농도 상태에 따라 출력
    랜덤으로 0~300

     */

    if ( mise > 150 ) {
        println("매우 높음")
    } else if ( mise > 80 ) {
        println("높음")
    } else if ( mise > 30 ) {
        println("보통")
    } else if ( mise > 15 ) {
        println("낮음")
    } else {
        println("매우 낮음")
    }
}