import random

num1 = int(input("Introduce el numero minimo : "))
num2 = int(input("Introduce el numero maximo : "))

numRandom = random.randint(num1, num2)
numAdivinar = int(input("Numero aleatorio generado adivina el numero : "))

while numRandom != numAdivinar:

    if numRandom > numAdivinar:

        print("Numero incorrecto, el numero aleatorio es mayor")

    if numRandom < numAdivinar:

        print("Numero incorrecto, el numero aleatorio es menor")

    numAdivinar = int(input("Introduce otro numero : "))

print("Acertaste, el numero aleatorio era : ", numRandom)
