peso = input("Introduce tu peso (en kg): ")
altura = input("Introduce tu altura (en metros): ")

imc = float(peso) / (float(altura) * float(altura))

print("Tu indice de masa corporal es: ", imc)