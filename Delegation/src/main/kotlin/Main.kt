import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

interface A {
    fun print()
}

interface B {
    fun print2()
}

open class FirstDelegate: A {
    override fun print() {
        println("FirstDelegate")
    }
}

open class SecondDelegate: B {
    override fun print2() {
        println("SecondDelegate")
    }
}

class PropDelegate: ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): String {
        return formattedString
    }
    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String
    ) {
        formattedString = value.lowercase()
    }
}

//
class App(): A by FirstDelegate(), B by SecondDelegate(){
    var name by PropDelegate()
    var lastName by PropDelegate()
}

fun main() {
    val app = App()
    app.print()
    app.print2()

    app.name = "Vladislav"
    app.lastName = "Kurman"

    with(app) {
        println("Name: $name")
        println("Last Name: $lastName")
    }
}
