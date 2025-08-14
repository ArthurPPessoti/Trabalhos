"""
Desafio: Validador de E-mail e Senha com Regex
Descrição: Valide e-mails e senhas com expressões regulares. A senha deve conter letras, números e símbolos.
"""
import re

def verificarEmail (email):
    if re.fullmatch(r"^[^@]+@[^@\.]+\.[^@\.]+$", email):
        print("Email válido")
    else:
        print("Email inválido")
##
##
def verificarSenha (senha):
    if re.fullmatch(r"^(?=.*[A-Za-z])(?=.*\d)(?=.*[^a-zA-Z0-9]).+$", senha):
        print("Senha válida")
    else:
        print("Senha inválida")
###
###
email = input("Email: ")
senha = input("Senha: ")
verificarEmail(email)
verificarSenha(senha)