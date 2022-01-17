manejador = open("mbox.txt")


def empiezan_por_x(manej):

    linea2 = ""
    line = ""

    for linea in manej:
        if linea.startswith("X-"):

            line = linea[:linea.find(":")]
            linea2 = linea[linea.find(":") + 2:]
            linea2 = linea2.strip()

        try:

            linea2 = float(linea2)
            print(line, ": ", round(linea2, 2))

        except:
            continue


empiezan_por_x(manejador)
