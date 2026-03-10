fun main() {
    // val text: String = null // compiler error: Type mismatch: inferred type is String? but String was expected
    val text: String? = null
    println(text)
    // text.length // compiler error: only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

    println(text?.length) // use safe call operator
    // println(text!!.length) // use non-null asserted operator. Fail on run, because text is null

    // Use elvis operator on text to provide a default value for text2 variable
    val text2 = text ?: "default value"
    println(text2)

    // this is the Elvis operator equivalent using an if expression
    val text3 = if (text != null) text else "default value"
    println(text3)
}
