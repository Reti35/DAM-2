import sys

listaNumeros = ["cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"]
lista = list()
i = 0

try:

    numero = int(input("Introduce un numero : "))

except:

    print("valor incorrecto")
    sys.exit()

numero = list(str(numero))

while len(numero) > i:

    if numero[i] == "0":
        lista.append(listaNumeros[0])
    if numero[i] == "1":
        lista.append(listaNumeros[1])
    if numero[i] == "2":
        lista.append(listaNumeros[2])
    if numero[i] == "3":
        lista.append(listaNumeros[3])
    if numero[i] == "4":
        lista.append(listaNumeros[4])
    if numero[i] == "5":
        lista.append(listaNumeros[5])
    if numero[i] == "6":
        lista.append(listaNumeros[6])
    if numero[i] == "7":
        lista.append(listaNumeros[7])
    if numero[i] == "8":
        lista.append(listaNumeros[8])
    if numero[i] == "9":
        lista.append(listaNumeros[9])
    i = i + 1

print(lista)
