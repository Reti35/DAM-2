numero1 = int(input("Introduce un numero : "))
numero2 = int(input("Introduce otro numero : "))

if numero1 > numero2:

    cont = numero2

    while numero1 >= cont:

        if cont % 2 == 0:
            print(cont)

        cont = cont + 1

if numero1 < numero2:

    cont = numero1

    while numero2 >= cont:

        if cont % 2 == 0:
            print(cont)

        cont = cont + 1
