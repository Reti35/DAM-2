añoActual = input("Introduce año actual: ")
año = input("Introduce otro año cualquiera: ")
print()

if añoActual > año:
    faltan = int(añoActual) - int(año)
    print("Faltan ", faltan, "año/s para llegar a ", añoActual)
if año > añoActual:
    faltan = int(año) - int(añoActual)
    print("Faltan ", faltan, "año(s) para llegar a ", año)