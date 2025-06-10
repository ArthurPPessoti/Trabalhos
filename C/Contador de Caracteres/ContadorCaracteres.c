#include <stdio.h>
#include <string.h>

int main() {
    char texto[1000]; // Limite máximo de 999 caracteres + '\0'

    printf("Digite uma string: ");
    fgets(texto, sizeof(texto), stdin);

    // Remove o caractere de nova linha se estiver presente
    size_t len = strlen(texto);
    if (len > 0 && texto[len - 1] == '\n') {
        texto[len - 1] = '\0';
        len--;
    }

    printf("A string digitada tem %zu caracteres.\n", len);

    return 0;
}
