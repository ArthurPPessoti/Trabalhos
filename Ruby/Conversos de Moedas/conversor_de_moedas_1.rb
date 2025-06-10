=begin
Desafio: Conversor de Moedas
Descrição: Permita converter valores entre reais, dólares e euros com base em taxas definidas no código.
=end

=begin
01/05/2025
[1.00] . REAL (R$)"
[0.18] . DOLAR AMERICANO (US$)"
[0.16] . EURO (€)"
[26] . IENE JAPONES (¥)"
[0.13] . LIBRA ESTERLINA (£)"
[1.28] . YUAN (¥)"
=end

def menu
    puts "Olá, bem-vindo ao convertor de moedas!"
    puts "O convertor funciona da seguinte maneira:"
    puts "--------------------------------------"
    puts "Você deve escolher uma moeda, por exemplo 'R$'!"
    puts "Depois escolhe para qual moeda quer converter!"
    puts "Por exemplo: 'R$' -> 'US$'"
    puts "Então escolha o valor que deseja que seja convertido!"
    puts
end

def moeda1
    puts "Escolha a moeda que será convertida!"
    puts "[1] . REAL (R$)"
    puts "[2] . DOLAR AMERICANO (US$)"
    puts "[3] . EURO (€)"
    puts "[4] . IENE JAPONES (¥)"
    puts "[5] . LIBRA ESTERLINA (£)"
    puts "[6] . YUAN (¥)"
    puts
end

inicio_moeda = gets.chomp

def moeda2
    puts "Escolha a moeda para qual será convertida!"
    puts "[1] . REAL (R$)"
    puts "[2] . DOLAR AMERICANO (US$)"
    puts "[3] . EURO (€)"
    puts "[4] . IENE JAPONES (¥)"
    puts "[5] . LIBRA ESTERLINA (£)"
    puts "[6] . YUAN (¥)"
    puts
end

final_moeda = gets.chomp

def valor
    puts "Qual o valor para ser convertido?"
    puts
end

def transformar_real
    


