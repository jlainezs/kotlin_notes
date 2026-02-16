# Delegation

Delegation is used to "pass" responsability from one class to another one. That's usually used in scenarios where multiple inheritance is needed.

```
interface A{ fun print()}
interface B{ fun print2()}

open class FirstDelegate:A(){}
open class SecondDelegate:B(){}

class App: A by FirstDelegate(), B by SecondDelegate(){

}
```
With that declaration App can use functions from interface A and B by using FirstDelegate and SecondDelegate classes.

## Delegation in properties

It is possible to apply delegation in propertie. We need declare a class that implements the ReadWriteProperty interface

```
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

class MyClass {
    val FirstProperty by PropDelegate()
    val SecondProperty by PropDelegate()
}
```
Then properties can use that class to change its behaviour.