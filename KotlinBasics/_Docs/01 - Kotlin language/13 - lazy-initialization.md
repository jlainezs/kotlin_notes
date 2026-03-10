# Lazy initialization

Lazy initialization is used when creating an instance is resource expensive.

The instance is initialized when it is going to used.

```
val instance by lazy {
    ...
}
```

