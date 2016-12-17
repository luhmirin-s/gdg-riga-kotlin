package lv.gdg.kotlin.kata

fun fizzBuzz(num: Int) =
    "".appendFizz(num).appendBuzz(num).orElse(num)


fun isFizz(i: Int) = i % 3 == 0 || "$i".contains('3')

fun isBuzz(i: Int) = i % 5 == 0 || "$i".contains('5')

private fun String.appendFizz(num: Int): String{
    return this + if (isFizz(num)) "Fizz" else ""
}
private fun String.appendBuzz(num: Int): String{
    return this + if (isBuzz(num)) "Buzz" else ""
}
private fun String.orElse(num: Int): String {
    return if(this.isEmpty()) "$num" else this
}