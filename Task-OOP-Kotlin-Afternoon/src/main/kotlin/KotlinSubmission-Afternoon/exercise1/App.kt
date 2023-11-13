package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    class MyProfile {
        var firstName: String = "Theodorus"
        var lastName: String = "Keraf"
        var age: Int = 22
        var isSingle: Boolean = true

        fun setProfile(firstName: String, lastName: String, age: Int, isSingle: Boolean) {
            this.firstName = firstName
            this.lastName = lastName
            this.age = age
            this.isSingle = isSingle
        }

        fun printProfile() {
            println("Nama: $firstName $lastName")
            println("Umur: $age tahun")
            println("Status: ${if (isSingle) "Single" else "Tidak Single"}")
        }
    }

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    return ""
    fun main() {
        val groupId = "FWW"
        val members = listOf("Member1", "Member2", "Member3", "Mamber4", "Mamber5")
        val version = "Afternoon"
    }
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    return listOf("Member1", "Member2", "Member3", "Member4","Member5")
    fun myTeam(): String {
        val groupMembers = listOf("Aullia", "Messi", "Teguh", "Theo", "Indah")

        // Akses item yang berisi nama Anda
        val myName = groupMembers[3]

        // Cetak daftar anggota grup
        println("Group Members:")
        for (member in groupMembers) {
            println("- $member")
        }

        return myName
    }

    fun main() {
        val myName = myTeam()
        println("My name is: $myName")
    }

    println("")
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentors = arrayOf("Mentor1", "Mentor2", "Mentor3")
    val groupMembers = arrayOf("Member1", "Member2", "Member3", "YourName", "Member5")

    val total = mentors.size + groupMembers.size

    return total
}

fun main() {
    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group: $totalMember")
}


    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("", listOf(), "")
fun main() {
    val groupId = "G123"
    val groupMembers = listOf("Member1", "Member2", "Member3", "theo", "Member5")
    val session = "Evening"

    groupDetail(groupId, groupMembers, session)
}


}