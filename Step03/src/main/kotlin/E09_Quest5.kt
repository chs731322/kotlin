fun main() {

    var score = (Math.random() * 101).toInt()
    println("점수 >> $score")


/*
    when(score) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }
*/

    when (score/10) {
        10, 9 -> println("A")
        8 -> println("B")
        7 -> println("C")
        6 -> println("D")
        else -> println("F")
    }





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
/*

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
*/
}