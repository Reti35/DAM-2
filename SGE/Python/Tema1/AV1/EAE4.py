botes = int(input("Introduce el numero de botes : "))
contBotes = botes
cont = 0
while contBotes > 0:

    contBotes = contBotes - cont
    cont = cont + 1

if contBotes == 0:

    print(botes, " es una cantidad apilable")

else:

    print(botes, " no es una cantidad apilable")
