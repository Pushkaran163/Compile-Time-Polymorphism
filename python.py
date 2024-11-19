# Python does not directly support method overloading.
# Instead, default arguments or variable-length arguments are used to mimic it.

class Calculator:
    def add(self, a, b, c=0):
        return a+b+c
    
calc = Calculator()

print(calc.add(10, 20))
print(calc.add(4.5, 6.7))
print(calc.add(2, 3, 4))