password = input("Introduce una contraseña : ")
intentos = 5

while intentos > 0:

    verificacion = input("Repita la contraseña : ")

    if password == verificacion:

        print("Cambio de contraseña exitosa")
        intentos = 0

    else:

        intentos = intentos - 1
        print("Contraseña incorrecta le quedan ", intentos, " intentos")

