diccionario = dict()
numero_palabras = 0
signos = [".", ";", ",", "?", "¿", "¡", "!", "(", ")"]

with open("el_quijote.txt", "r") as fichero:

    for linea in fichero:

        for signo in signos:

            linea = linea.replace(signo, " ")
            palabras = linea.split()

        for palabra in palabras:

            numero_palabras += 1
            diccionario[palabra] = diccionario.get(palabra, 0) + 1

    print("El quijote tiene las sigientes palabras repetidas:")

    for palabra in diccionario:
        print("La palabra ", palabra, " se repite: ", diccionario[palabra], " veces")
