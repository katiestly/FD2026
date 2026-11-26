package seminar4

/**
 * 1. Подготовь имя для списка участников.
 * Убери пробелы по краям. Если имени нет или оно пустое, верни «Гость».
 * Примеры: "  Аня  " → "Аня", null → "Гость", "   " → "Гость".
 * Попробуй использовать безопасный вызов ?. и оператор Элвиса ?:, без !!.
 */

    fun displayName(name: String?): String {
        val trimmed = name?.trim() ?: return "Гость"
        return trimmed.ifEmpty {"Гость"}
}
fun main() {
    println(displayName(" Аня "))
}