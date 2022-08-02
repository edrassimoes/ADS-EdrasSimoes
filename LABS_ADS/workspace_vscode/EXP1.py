import math

val = int(input("Entre com um número: "))
el = pow(val, 3)

if el < 100:
    print(f"{val}³ é menor que 100")
else: 
    print(f"{val}³ é maior que 100")