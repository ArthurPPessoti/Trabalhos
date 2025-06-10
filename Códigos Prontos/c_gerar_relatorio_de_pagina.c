#include <stdio.h>
#include <curl/curl.h>
#include <string.h>
#include <ctype.h>

// Estrutura para armazenar os dados da resposta
struct string {
  char *ptr;
  size_t len;
};

// Callback para receber os dados da resposta
size_t writefunc(void *ptr, size_t size, size_t nmemb, struct string *s) {
  size_t new_len = s->len + size * nmemb;
  s->ptr = realloc(s->ptr, new_len + 1);
  memcpy(s->ptr + s->len, ptr, size * nmemb);
  s->ptr[new_len] = '\0';
  s->len = new_len;
  return size * nmemb;
}

int main() {
  CURL *curl;
  CURLcode res;
  struct string s;
  s.len = 0;
  s.ptr = malloc(s.len + 1);
  s.ptr[0] = '\0';

  char url[256];
  printf("Digite a URL da página: ");
  scanf("%s", url);

  curl = curl_easy_init();
  if(curl) {
    curl_easy_setopt(curl, CURLOPT_URL, url);
    curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, writefunc);
    curl_easy_setopt(curl, CURLOPT_WRITEDATA, &s);
    res = curl_easy_perform(curl);

    if(res != CURLE_OK) {
      fprintf(stderr, "curl_easy_perform() failed: %s\n", curl_easy_strerror(res));
    } else {
      // Contadores
      int palavras = 0;
      int links = 0;
      int imagens = 0;
      int em_palavra = 0;

      // Analisa o HTML
      for(int i = 0; i < s.len; i++) {
        // Conta palavras
        if(isspace(s.ptr[i])) {
          em_palavra = 0;
        } else if(!em_palavra) {
          em_palavra = 1;
          palavras++;
        }

        // Conta links
        if(strncmp(&s.ptr[i], "href=", 5) == 0) {
          links++;
        }

        // Conta imagens
        if(strncmp(&s.ptr[i], "<img", 4) == 0) {
          imagens++;
        }
      }

      printf("\nRelatório da página:\n");
      printf("Número de palavras: %d\n", palavras);
      printf("Número de links: %d\n", links);
      printf("Número de imagens: %d\n", imagens);
    }

    curl_easy_cleanup(curl);
  }

  free(s.ptr);
  return 0;
}
