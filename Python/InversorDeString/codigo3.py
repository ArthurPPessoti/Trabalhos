"""
Desafio: Inversor de String
Descrição: Peça uma palavra e exiba ela invertida (ex: 'casa' -> 'asac').
"""

texto = input("Digite a String que você queria inverter: \n")
tamanho = len(texto)
divisao = tamanho // 2
textoinvertido = list(texto)

letra_a = ""

for i in range(divisao):
    letra_a = textoinvertido[i]
    tamanho -= 1
    textoinvertido[i] = textoinvertido[tamanho]
    textoinvertido[tamanho] = letra_a

textoinvertido = ''.join(textoinvertido)
print(textoinvertido)