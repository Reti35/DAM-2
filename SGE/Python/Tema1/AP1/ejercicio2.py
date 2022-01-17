num1 = input("Introduce un numero: ")
num2 = input("Introduce otro numero: ")
print()

division = int(num1) / int(num2)
resto = int(num1) % int(num2)

print("El resultado es: ", division)
print()

if resto == 0:
    print("Es una division exacta")
else:
    print("No es una division exacta")