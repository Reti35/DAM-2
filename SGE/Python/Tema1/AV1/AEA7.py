import random

numPreguntas = int(input("Introduce el numero de preguntas que quieres hacer : "))
print()
contPreguntas = numPreguntas
numAciertos = 0

while contPreguntas > 0:

    num1 = int(round(1 + (random.random() * 100) % (10 - 1 + 1), 0))
    num2 = int(round(1 + (random.random() * 100) % (10 - 1 + 1), 0))

    print("Cuanto es ", num1, " x ", num2, " = ")
    res = int(input())

    if res == num1 * num2:

        print("Acertaste")
        numAciertos = numAciertos + 1

    else:

        print("Fallaste")

    contPreguntas = contPreguntas - 1

print()
print("Aciertos : ", numAciertos, "/", numPreguntas)
nota = (numAciertos * 10) / numPreguntas
print("Nota : ", nota, "/10.0")
