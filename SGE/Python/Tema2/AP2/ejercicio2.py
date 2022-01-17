numeros_loteria = 0
loteria = []

while numeros_loteria != -1:

    try:
        numeros_loteria = int(input("Introduce un numero de loteria : "))
    except:
        continue

    if numeros_loteria == -1:
        continue

    loteria.append(numeros_loteria)
    print(loteria)

loteria.sort()

print(loteria)
