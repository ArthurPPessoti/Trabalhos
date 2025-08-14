"""
Desafio: Validador de E-mail e Senha com Regex
Descrição: Valide e-mails e senhas com expressões regulares. A senha deve conter letras, números e símbolos.
"""
import re

def verificarEmail (email):
    print("Email válido" if re.fullmatch(r"^[^@]+@[^@\.]+\.[^@\.]+$", email) else "Email inválido")
##
##
def verificarSenha (senha):
    print("Senha válida" if re.fullmatch(r"^(?=.*[A-Za-z])(?=.*\d)(?=.*[^a-zA-Z0-9]).+$", senha) else "Senha inválida")
###
###
email = input("Email: ")
senha = input("Senha: ")
verificarEmail(email)
verificarSenha(senha)