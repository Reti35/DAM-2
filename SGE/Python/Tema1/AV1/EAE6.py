import random

num1 = int(input("Introduce el numero minimo : "))
num2 = int(input("Introduce el numero maximo : "))

numRandom = num1 + (random.random() * 100) % (num2 - num1 + 1)
numRandom = round(numRandom, 0)
numAdivinar = int(input("Numero aleatorio generado adivina el numero : "))

while numRandom != numAdivinar:

    if numRandom > numAdivinar:

        print("Numero incorrecto, el numero aleatorio es mayor")

    if numRandom < numAdivinar:

        print("Numero incorrecto, el numero aleatorio es menor")

    numAdivinar = int(input("Introduce otro numero : "))

print("Acertaste, el numero aleatorio era : ", numRandom)
