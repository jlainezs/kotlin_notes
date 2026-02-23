# Packages and imports

Packages are a way to organize a project code. A Kotlin project is structured into packages. Each package can contain several files, and each file belongs to one package.

The first line in the file declares the package where the file belongs to. If there's no package declaration, then the file is supposed to belong to the ``root`` package.

```
package mypackage

// here goes the code
```

Kotlin does not require files to be in a specific location. However, it is recommended to reflect the folder structure in the package hierarchy.

## Importing

Before using resources in other packages, they must be imported.

```
package whatever

import mypackage.member

// now we ca use member1 defined in mypackage
mypackage.member1()
```

An import contains a simple or a qaulified path, and the name of the imported entity is located at the end of the path.

Some entities could not be import because of their visibility modifiers.

Some packages have all their entities implicitly imported, so there's no need to specifically import them.

The following packages of the standard library are implicitly imported:

- kotlin
- kotlin.annotation
- kotlin.collections
- kotlin.comparisons
- kotlin.io
- kotlin.ranges
- kotlin.sequences
- kotlin.text
- kotlin.math

Depending of the platform implementation, some additional packages could be imported.

### Star imports

Imports all named entities from the specified package.

```
package whatever

import mypackage.*

// now we ca use members defined in mypackage
mypackage.member1()
mypackage.member2()
```

### Renaming imports

Renaming imports work just like regular imports, but introduce the entity into the current file with the specified name, such that an unqualified access to this entity is possible only using the newly specified name. This means that renaming imports of entities from the same package effectively change their unqualified name.

```
package whatever

import mypackage.member as mambo

// now we ca use member1 defined in mypackage but with name we set in the import

mambo()
```


## References

- [Packages and imports, Kotlin language guide](https://kotlinlang.org/docs/packages.html)
- [Packages and imports, Kotlin language specification](https://kotlinlang.org/spec/packages-and-imports.html)
