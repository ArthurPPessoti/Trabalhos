"""
Desafio: Número Primo
Descrição: Peça um número e diga se ele é primo.
"""

numero = int(input("digite um número inteiro para eu falar se é primo ou não: "))

if numero <= 1:
    print("O número {} não é primo, pois é menor ou igual à 1".format(numero))
    exit()

primo = "é primo"

for i in range(2, numero):
    if numero % i == 0:
        primo = "não é primo"
        break

print("O número {} {}".format(numero, primo))