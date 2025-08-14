"""
Desafio: Validador de E-mail e Senha
Descrição: Valide e-mails e senhas com expressões regulares. A senha deve conter letras, números e símbolos.
"""

def verificarEmail (email):
    if '@' not in email or email.count('@') != 1:
        print("Email inválido [@]")
    else:
        before, after = email.split('@')
        if not before:
            print("Email inválido [[xxx]@]")
        elif not after:
            print("Email inválido [@[xxx]]")
        else:
            if after.count('.') != 1:
                print("Email inválido [não possui um ponto depois do @]")
            else: 
                antes, depois = after.split('.')
                if not antes:
                    print("Email inválido [não existe dominio]")
                elif not depois:
                    print("Email inválido [Não existe súfixo]")
                else:
                    print("Email valido!")
##
##
def verificarSenha (senha):
    if (any(c.isalnum() for c in senha) and any(not v.isalnum() for v in senha)):
        print("Senha válida")
    else:
        print("Senha inválida")
###
###
email = input("Email: ")
senha = input("Senha: ")
verificarEmail(email)
verificarSenha(senha)