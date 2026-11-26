package seminar4

fun displayName(name: String?): String {
    return name?.trim() ?. ifEmpty() { "Гость" } ?: "Гость"
}
