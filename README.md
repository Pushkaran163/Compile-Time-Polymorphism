# Compile-Time-Polymorphism

## Polymorphism
Polymorphism is a fundamental concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. It enables methods to behave differently based on the object’s actual class type. Polymorphism enhances flexibility and maintainability in code by allowing one interface to be used for a general class of actions. This can be achieved through method overriding or method overloading in many programming languages.

## Compile time polymorphism in Java
- Method Overloading: Compile-time polymorphism in Java is achieved primarily through method overloading, where multiple methods in the same class have the same name but different parameters (number, type, or order).

- Static Binding: In compile-time polymorphism, method calls are resolved during the compilation process, also known as static binding. The method to be invoked is determined based on the method signature at compile time.

- Early Binding: The binding of method calls to method definitions happens before the program is run, making the process faster and more efficient compared to runtime polymorphism (dynamic binding).

- Performance: Compile-time polymorphism is generally faster than runtime polymorphism because method resolution occurs at compile time, reducing the overhead associated with method lookup during execution.

## Compile time polymorphism in Python
- Dynamic Typing: Python is dynamically typed, so it doesn't have traditional compile-time polymorphism like statically typed languages. However, Python can mimic compile-time polymorphism through method overloading using default arguments or variable-length argument lists.

- Method Overloading: In Python, method overloading is not directly supported, but you can achieve similar functionality by defining methods with default parameters or using *args and **kwargs to handle different argument types and counts.

- Static Binding (Emulation): Since Python resolves method calls at runtime, it doesn't have strict static binding. However, you can manually choose different behaviors in methods based on input types or other factors.

- Duck Typing: Python uses a form of polymorphism called duck typing, where the type or class of an object is less important than whether it behaves as expected. This allows for flexibility, where method calls are resolved dynamically based on object behavior rather than type.

In Python, true compile-time polymorphism, as seen in statically typed languages, is not a feature due to its dynamic nature.



