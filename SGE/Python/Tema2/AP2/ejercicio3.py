import sys

try:
    psp = int(input("Introduce la nota de psp : "))
    aad = int(input("Introduce la nota de aad : "))
    pmm = int(input("Introduce la nota de pmm : "))
    din = int(input("Introduce la nota de din : "))
    sge = int(input("Introduce la nota de sge : "))
    ing = int(input("Introduce la nota de ing : "))
    eie = int(input("Introduce la nota de eie : "))
except:
    print("error")
    sys.exit()
pspn = "psp : ", psp
aadn = "add : ", aad
pmmn = "pmm : ", pmm
dinn = "din : ", din
sgen = "sge : ", sge
ingn = "ing : ", ing
eien = "eie : ", eie

lista = [psp, aad, pmm, din, sge, ing, eie]
lista2 = [pspn, aadn, pmmn, sgen, ingn, eien]
for i in lista:

    if i > 4:
        lista2

print(lista2)
