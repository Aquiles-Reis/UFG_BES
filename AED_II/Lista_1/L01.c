#include <stdio.h>
#include <stdlib.h>
#include "L01.h"

struct NO
{
    int info;
    struct NO* esq;
    struct NO* dir;
};

ArvBin* cria_ArvBin(void)
{
    ArvBin* raiz = (ArvBin*) malloc(sizeof(ArvBin));

    if (raiz != NULL) {
        *raiz = NULL;
    }

    return raiz;
}

void imprimeArvore(struct NO* raiz, int nivel)
{
    int i;

    if (raiz == NULL) {
        return;
    }

    imprimeArvore(raiz->dir, nivel + 1);

    for (i = 0; i < nivel; i++) {
        printf("    ");
    }

    printf("%d\n", raiz->info);

    imprimeArvore(raiz->esq, nivel + 1);
}

ArvBin* inserirNO_iterativo(ArvBin* raiz, int valor) {
    struct NO* novo;
    struct NO* atual;
    struct NO* pai;

    if (raiz == NULL) {
        return NULL;
    }
    novo = (struct NO*) malloc(sizeof(struct NO));
    if (novo == NULL) return NULL;
    novo->info = valor;
    novo->esq = NULL;
    novo->dir = NULL;
    if (*raiz == NULL) {
        *raiz = novo; return raiz;
    }
    atual = *raiz;
    pai = NULL;
    while (atual != NULL) {
        pai = atual;
        if (valor < atual->info) {
            atual = atual->esq;
        } else {
            atual = atual->dir;
        }
    }
    if (valor < pai->info) {
        pai->esq = novo;
    } else {
        pai->dir = novo;
    } return raiz;
}

void pre_Ordem(struct NO* raiz)
{
    if (raiz == NULL) return;
    printf("%d ", raiz->info);
    pre_Ordem(raiz->esq);
    pre_Ordem(raiz->dir);
}

void em_Ordem(struct NO* raiz)
{
    if (raiz == NULL) return;
    em_Ordem(raiz->esq);
    printf("%d ", raiz->info);
    em_Ordem(raiz->dir);
}

void pos_Ordem(struct NO* raiz)
{
    if (raiz == NULL) return;
    pos_Ordem(raiz->esq);
    pos_Ordem(raiz->dir);
    printf("%d ", raiz->info);
}

int contarFolhas(struct NO* raiz) {
    if (raiz == NULL) return 0;
    if (raiz->esq == NULL && raiz->dir == NULL) return 1;
    return contarFolhas(raiz->esq) + contarFolhas(raiz->dir);
}

int main(void) {
    ArvBin* raiz = cria_ArvBin();

    inserirNO_iterativo(raiz, 40);
    inserirNO_iterativo(raiz, 20);
    inserirNO_iterativo(raiz, 60);
    inserirNO_iterativo(raiz, 10);
    inserirNO_iterativo(raiz, 30);
    inserirNO_iterativo(raiz, 50);
    inserirNO_iterativo(raiz, 70);

    printf("Arvore binaria de busca:\n");
    imprimeArvore(*raiz, 0);
    printf("\nPre-ordem: ");
    pre_Ordem(*raiz);
    printf("\nEm-ordem: ");
    em_Ordem(*raiz);
    printf("\nPos-ordem: ");
    pos_Ordem(*raiz);
    printf("\n\nQuantidade de nos folhas: %d\n", contarFolhas(*raiz));

    return 0;
}
