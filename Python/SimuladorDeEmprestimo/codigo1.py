# Simulador de Empréstimo
# Descrição: Peça valor, juros e número de parcelas. Mostre o valor total e o valor de cada parcela.

#############################

print("Selecione o seu tipo de juros:\n" \
"[1] = simples\n" \
"[2] = composto\n")
tipodejuros = int(input())

if tipodejuros == 1:
    emprestimo = float(input("\nQual foi o valor emprestado? "))
    juros = float(input("\nQual a taxa de juros mensal cobrada? [em %"))/100
    tempo = int(input("\nPor quantos meses ocorrerá o pagamento? "))
    
    totaljuros = emprestimo * (juros) * tempo
    total = emprestimo + totaljuros
    parcelas = total / tempo

    print("Com o valor inicial de R${:.2f}, a uma taxa de {}% ao mês por {} meses\n" \
    "O valor final será de R${:.2f}, com parcelas de R${:.2f} ao mês, por {} meses".format(emprestimo, juros*100, tempo, total, parcelas, tempo))

elif tipodejuros == 2:
    emprestimo = float(input("\nQual foi o valor emprestado? "))
    juros = float(input("\nQual a taxa de juros mensal cobrada? [em %] "))/100
    tempo = int(input("\nPor quantos meses ocorrerá o pagamento? "))

    mensal = emprestimo

    valorparcela = emprestimo * ((juros*((1+juros)**tempo)) / (((1+juros)**tempo)-1))
    print("Para o pagamaneto do emprestimo em {} meses, com uma taxa de {}% ao mês, o valor das parcelas serão de R${:.2f}\n".format(tempo, juros*100, valorparcela))

    print("Mostrando o crescimento dos juros!")
    for i in range(tempo):
        parcelas = mensal * (1 + (juros))
        print("O Valor total com os juros no mês {} será de R${:.2f}!".format(i+1, parcelas))
        mensal = parcelas

    print("\nNo final o valor a ser pago será de R${:.2f}\nO valor de juros que serão pagos é de R${:.2f}".format(mensal, mensal-emprestimo))

else:
    print("Opção inválida. Por favor, selecione 1 para juros simples ou 2 para compostos.")