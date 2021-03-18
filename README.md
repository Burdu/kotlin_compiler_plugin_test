# Bazel parcelizable compiler error

This repo is to reproduce a compilation error encountered when trying to build with bazel using
bazelbuild/rules_kotlin build rules and parcelizable kotlin compiler plugin.

Command to invoke to reproduce the error.
```
bazel build library/src/main/java/com/example/parcelable:parcelable_kt
```


```
exception: java.lang.IllegalStateException: The provided plugin org.jetbrains.kotlin.parcelize.ParcelizeComponentRegistrar is not compatible with this version of compiler
```
