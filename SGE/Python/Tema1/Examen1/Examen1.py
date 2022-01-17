# Inportamos el modulo random para poder hacer numeros aleatorios
import random

# variables que utilizaremos en el programa
numero_inicio = 0
numero1 = 0
numero2 = 0
resultado = 0
resultado_introducido = 0
numero_aciertos = 0

# Si el numero de la operacion es 1 sera suma y si es 2 sera resta
numero_operacion = 0

print("Comenzamos por ", numero_inicio)

# Mientras el resultado real  coincida con el que se ha introducido por pantalla se mostrara otra suma
while resultado_introducido == resultado:

    numero_operacion = random.randint(1, 2)

    # Si es la primera vez que se entra al bucle el primer numero es 0 y el segundo numero que sera aleatorio
    if numero_aciertos == 0:

        numero2 = random.randint(1, 100)

        # Si el numero de operacion es 1 se hara una suma y si es 2 se hara una resta
        if numero_operacion == 1:

            print(numero1, " + ", numero2)

            resultado = numero1 + numero2

        elif numero_operacion == 2:

            print(numero1, " - ", numero2)

            resultado = numero1 - numero2

        # Si el usuario se equivoca y no introduce un numero valido se imprimira por pantalla un aviso a el usuario
        try:

            resultado_introducido = int(input())

        except:

            print("No se ha introducido un numero valido (introduce solo numeros enteros)")

        # Si el resultado real coincide con el introducido se sumará 1 a los aciertos
        if resultado_introducido == resultado:

            numero_aciertos += 1

    else:

        # Con la funcion radint de random podemos hacer un numero aleatorio del 1 al 100
        numero1 = random.randint(1, 100)
        numero2 = random.randint(1, 100)

        # Imprimimos los numeros por pantalla para que el usuario sepa cuales son y que operacion debe realizar

        if numero_operacion == 1:

            print(numero1, " + ", numero2)

            resultado = numero1 + numero2

        elif numero_operacion == 2:
            print(numero1, " - ", numero2)

            resultado = numero1 - numero2

        try:

            resultado_introducido = int(input())

        except:

            print("No se ha introducido un numero valido (introduce solo numeros enteros)")

        if resultado_introducido == resultado:
            numero_aciertos += 1

# Una vez has cometido un fallo se sale del bucle y se indica cuantos aciertos seguidos has tenido
print("No es correcto. Has tenido ", numero_aciertos, " aciertos seguidos.")
