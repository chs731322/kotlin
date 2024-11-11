fun main() {

    print("점수를 입력하세요 >> ")
    var score = readln().toInt()


/*
    if (score >= 90 && score <= 100) {
        println("A")
    } else if(score >= 80 && score < 90) {
        println("B")
    } else if(score >= 70 && score < 80) {
        println("C")
    } else if(score >= 60 && score < 70) {
        println("D")
    } else {
        println("F")
    }
 */


    if(score >= 90) {
        println("A")
    } else if(score >= 80) {
        println("B")
    } else if(score >= 70) {
        println("C")
    } else if(score >= 60) {
        println("D")
    } else {
        println("F")
    }

}