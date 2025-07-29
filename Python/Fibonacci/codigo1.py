"""
Desafio: Fibonacci até N
Descrição: Peça um número N e exiba a sequência de Fibonacci até esse número.
"""

n = int(input("Escolha um valor para a sequencia de fibonacci\n"))

a, b = 0, 1
for i in range(n):
    print(a, end=' ')
    a, b = b, b + a
