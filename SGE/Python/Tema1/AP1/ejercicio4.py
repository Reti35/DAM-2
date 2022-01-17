num1 = input("Introduce un numero: ")
num2 = input("Introduce otro numero: ")
print()

if num1 > num2:

    resto = int(num1) % int(num2)

    if resto == 0:

        print(num2, " es multiplo de ", num1)

    else:

        print(num2, " no es multiplo de ", num1)

if num2 > num1:

    resto = int(num2) % int(num1)

    if resto == 0:

        print(num1, " es multiplo de ", num2)

    else:

        print("No es una division exacta")
