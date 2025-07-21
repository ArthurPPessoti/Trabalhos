"""
Desafio: Inversor de String
Descrição: Peça uma palavra e exiba ela invertida (ex: 'casa' -> 'asac').
"""

texto = input("Digite a String que você queria inverter: \n")
tamanho = len(texto)
invertido = ""

for i in range (tamanho):
    invertido += texto[tamanho - 1]
    tamanho -= 1

print(invertido)