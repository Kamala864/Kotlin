/*1. Write a program that prompts the user to input a positive integer. It should then print the
multiplication table of that number.*/
fun main() {
    print("Write any number: ")

    val number = Integer.valueOf(readLine())
    for (i in 1..10) {
        val product = number * i
        println("$number * $i = $product")
    }
}