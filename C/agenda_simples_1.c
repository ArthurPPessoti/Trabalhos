/*
Desafio: Agenda Simples
Descrição: Permita cadastrar e listar nomes e telefones (usar `ArrayList` ou estrutura parecida).
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Pessoa{
    char nome[100];
    char telefone[20];
    struct Pessoa* next;
} Pessoa;

void adicionar(Pessoa** lista, char nome[], char telefone[]){
    Pessoa* nova = malloc(sizeof(Pessoa));

    strcpy(nova->nome, nome);
    strcpy(nova->telefone, telefone);

    nova->next = *lista;
    *lista = nova;
}

void imprimir(Pessoa* lista){
    if (lista == NULL){
        printf("A lista está vazia.\n");
        return;
    }

    Pessoa* item = lista;

    while (item != NULL){
        printf("Nome: %s\n", item->nome);
        printf("Telefone: %s\n", item->telefone);
        item = item->next;
    }
}

int main(){
    Pessoa* lista = NULL;
    int opcao;
    char nome[100], telefone[20];

    do {
        printf("Agenda Telefonica!\n");
        printf("Escolha uma das opções abaixo\n");
        printf("[1] - adicionar contato\n");
        printf("[2] - imprimir lista\n");
        printf("[3] - sair\n");
        scanf("%d", &opcao);

        int c;
        while ((c = getchar()) != '\n' && c != EOF);

        switch(opcao){
            case 1:
                printf("Informe o nome do contato\n");
                fgets(nome, sizeof(nome), stdin);
                nome[strcspn(nome, "\n")] = '\0';

                printf("Informe o telefone do contato\n");
                fgets(telefone, sizeof(telefone), stdin);
                telefone[strcspn(telefone, "\n")] = '\0';

                adicionar(&lista, nome, telefone);
                break;

            case 2:
                printf("\n");
                imprimir(lista);
                printf("\n");
                break;

            case 3:
                printf("saindo...\n");
                break;

            default:
                printf("Opção inválida, tente novamente\n");
        }
    } while(opcao != 3);

    return 0;
}

/*
EXPLICAÇÕES DO CÓDIGO:

=====
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
=====
Essas foram as bibliotecas utilizadas
stdio.h é a biblioteca principal do C
Usei no código para:
printf() ; fgets()
stdlib.h é a biblioteca para alocação de memória dinâmica
Usei no código para:
malloc()
string.h é a biblioteca para manipulação de string
Usei no código para:
strcpy() [copiar os dados] ; strcspn() [Retorna o índice do primeiro caractere que não está na string fornecida]

=====
typedef struct Pessoa{
    [...]
} Pessoa;
=====
Isso é uma estrutura (classe?)
typedef é uma palavra-chave em C que cria um apelido para uma estrutura
Ficando mais fácil de usar a estrutura
< struct Pessoa* next >
O next foi usado para encadear a estrutura
Pessoa* é um ponteiro para outra Pessoa

=====
void adicionar(Pessoa** lista, char nome[], char telefone[]){
    [...]
}
=====
Isso é um metodo para adicionar novos itens a estrutura
< Pessoa* nova = malloc(sizeof(Pessoa)) >
Estou criando um ponteiro do tipo Pessoa e estou chamando de nova
O nome nova é porque é uma nova pessoa
A função malloc(sizeof(Pessoa)) adiciona dinamicamente memória suficiente para uma "nova" estrutura
Com base no sizeof(Pessoa)
A função strcpy(nova->nome, nome) copia a string para a estrutura
O motivo de usar -> é para direcionar, é a mesma ideia do "."
Mas como nova é um ponteiro, é usado -> (no lugar de nova.nome se usa nova->nome)
A mesma coisa é feita com o telefone
A linha nova->next = *lista conecta o novo nó ao ínicio da lista
Já *lista = nova atualiza o ponteiro para o ínicio da lista
Sempre que um novo contato for criado ele será adicionado no "ínicio" da lista

=====
void imprimir(Pessoa* lista){
    [...]
}
=====
Esse método serve para imprimir os dados da lista
O if é para verificar se a lista não está vazia
E se estiver vazia irá imprimir uma mensagem avisando
Em < Pessoa* item = lista > é criado um novo ponteiro chamado item
O loop while garante que o item passará por todos os objetos
A nossa estrutura funciona assim: Contato3 -> Contato2 -> Contato1 -> NULL
O poteiro inicial irá sempre apontar para o primiero contato, que nesse exemplo é o Contato3
Nisso será imprimido o nome e telefone daquele objeto
< item = item->next > o ponteiro item é transformado no ponteiro dentro da estrutura que se refere ao próximo objeto
Ou seja, o item(Contato3) se transforma em item(Contato2)
Esse ciclo se repete até que o item se transforma no referente de NULL, assim quebrando o loop

=====
int main(){
    [...]
}
=====
Essa é a main do código
Quando < Pessoa* lista = NULL > é acionada, se cria o primiro objeto da estrutura, objeto NULL
< int opcao > criada a variavel qeu será importante para os comandos
< char nome[100], telefone[20] > Isso foi feito para não causar problemas quando os dados forem direcionados a estrutura
Isso serve como um limitador aqui na main
O loop do é feito para que nunca acabe o programa, a não ser que o usuário queira
É imprimido um 'menu', que serve para capturar a opção que o usuário deseja
< int c
      while ((c = getchar()) != '\n' && c != EOF) > Isso foi feito para limpr o buffer do código
Isso é um código pré-programado que serve para a limpeza do buffer
O buffer tem que ser limpo, se não causaram problemas, no próximo fgets ou em qualquer outro tipo de função que pegue dados, o dado que será pego é "\n" causado pelo scanf
Utilização do switch para os possiveis casos em que o cliente escolha
O case 1 adiciona um nome e telefone na estrutura
Utilizando fgets para capturar a próxima linha de texto que for informada pelo usuário
Já o strcspn é utilizado para substituir '\n' por '\0' (que significa o final da string), para previnir bugs
O mesmo eh feito para o telefone
Depois é chamada a função adicionar com os dados de nome e telefone que foram adquiridas
O break é para parar o switch e continuar o código, que nesse caso reiniciará o "do"
O case 2 apenas chama o método imprimir
Os printf("\n") foram feitos apenas para deixar a impressão mais agradavél no prompt
O case 3 exibi uma mensagem de "saindo..." e por ter sido a opção 3 quando o brack for ativo o while também será, encerrando o loop
E existe o case default que é apenas um tratamento de erro
O return 0 é a forma do C em finalizar o código

*/
