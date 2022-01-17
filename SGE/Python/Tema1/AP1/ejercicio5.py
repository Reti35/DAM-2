opcion = int(input("Introduce 1 para calcular el area de un triangulo o 2 para calcular el area de un circulo: "))
print()

if opcion == 1:

    base = int(input("Introduce la base: "))
    altura = int(input("Introduce la altura: "))
    print()

    areaTriangulo = (base * altura) / 2
    print("El area del triangulo es: ", areaTriangulo)

elif opcion == 2:

    radio = int(input("Introduce el radio: "))
    pi = 3.141592
    print()

    areaCirculo = pi * (radio * radio)
    print("El area del circulo es: ", areaCirculo)

else:

    print("Opcion incorrecta")
