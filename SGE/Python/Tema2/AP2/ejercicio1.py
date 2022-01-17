
palabra = ""
lista = list()

while palabra != "FIN":

    palabra = input("Introduce una palabra : ")

    if palabra != "FIN":
        lista.append(palabra)

lista.sort()
lista.reverse()
print(lista)
