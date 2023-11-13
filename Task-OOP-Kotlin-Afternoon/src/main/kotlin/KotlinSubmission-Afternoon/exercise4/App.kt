package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
     class ExampleTryCatch {

        fun convertStringToNumber(input: String): Int {
            return try {
                input.toInt()
            } catch (e: NumberFormatException) {
                println("Error: ${e.message}")
                -1
            }
        }
    }

fun main () {
    val exampleTryCatch = ExampleTryCatch()
    val userInput1 = "123"
    val userInput2 = "abc"

    val result1 = exampleTryCatch.convertStringToNumber(userInput1)
    println("Hasil konversi dari '$userInput1': $result1")

    val result2 = exampleTryCatch.convertStringToNumber(userInput2)
    println("Hasil konversi dari '$userInput2': $result2")
}
