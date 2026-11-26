package seminar4


/**
 * 2. Разбери количество мест. Ввод может быть Int, строкой или чем-то ещё.
 * Прими только положительный Int или строку с таким числом. У строки убери пробелы по краям.
 * Если число получить нельзя, верни null. Попробуй when, is и toIntOrNull().
 * Примеры: 3 → 3, " 2 " → 2, 2L → null, "0" → null, "пять" → null.
 */
fun parseSeats(raw: Any?): Int? {
    val seats = when (raw) {
        is Int -> raw
        is String -> raw.trim().toIntOrNull() ?: return null
        else -> return null
    }
    return if (seats > 0) seats else null
}
fun main() {
    println(parseSeats(raw = " 2 "))
}