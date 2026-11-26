package seminar4

/**
 * 3. Проверь обязательный email. Убери пробелы по краям.
 * Для семинара формат такой: ровно один @, с непустым текстом слева и справа,
 * без пробелов и других пробельных символов внутри. Регистр не меняй.
 * Если email не задан или не подходит, верни null.
 * Примеры: "  Anna@demo.test " → "Anna@demo.test", "anna" → null, null → null.
 * Подсказка: начать можно с `val email = raw?.trim() ?: return null`.
 */


fun normalizeEmail(raw: String?): String? {
    val email = raw?.trim()?: return null
    if (email.any {it.isWhitespace()}) return null
    val at = email.indexOf(char = '@')
    if (at <= 0 || at == email.lastIndex || at != email.lastIndexOf(char = '@')) return null
    return email
}
fun main() {
    println(normalizeEmail(raw = "anya@example.test "))
}