# Object expressions

Declare an instantiate an object using aninymous classes.

```
interface OnClickListener{
    fun onClick
}

class Button(val text:String, onClickListener: OnClickListener)

val button1 = Button(
    "login",
    object: OnClickListener {
        override fun onClick(){

        }
    }
)
```
With an anonymous class it is not needed to declare a class that implements the OnClickListener interface.
