#include <stdio.h>
#include <stdlib.h>
#include "min_heap.h"

void trocar(int *a, int *b){

    int temp = *a;
    *a = *b;
    *b = temp;
}

Heap* create(){

    Heap *h;

    h = malloc(sizeof(Heap));

    if(h != NULL){
        h->tamanho = 0;
    }

    return h;
}

void insert(Heap *h, int valor){

    if(h->tamanho >= MAX){

        printf("Heap cheio!\n");
        return;
    }

    int i = h->tamanho;

    h->dados[i] = valor;

    h->tamanho++;

    reHeapUp(h, i);
}

void reHeapUp(Heap *h, int i){

    while(i > 0){

        int pai = (i - 1) / 2;

        /* ALTERAÇÃO PARA HEAP MÍNIMO */
        if(h->dados[pai] > h->dados[i]){

            trocar(&h->dados[pai], &h->dados[i]);

            i = pai;
        }
        else{
            break;
        }
    }
}

int deleteMinVal(Heap *h){

    if(h->tamanho == 0){

        printf("Heap vazio!\n");
        return -1;
    }

    int removido = h->dados[0];

    h->dados[0] = h->dados[h->tamanho - 1];

    h->tamanho--;

    reHeapDown(h, 0);

    return removido;
}

void reHeapDown(Heap *h, int i){

    int menor;
    int esquerdo;
    int direito;

    while(1){

        esquerdo = 2 * i + 1;
        direito  = 2 * i + 2;

        menor = i;

        /* ALTERAÇÃO PARA HEAP MÍNIMO */
        if(esquerdo < h->tamanho &&
           h->dados[esquerdo] < h->dados[menor]){

            menor = esquerdo;
        }

        /* ALTERAÇÃO PARA HEAP MÍNIMO */
        if(direito < h->tamanho &&
           h->dados[direito] < h->dados[menor]){

            menor = direito;
        }

        if(menor != i){

            trocar(&h->dados[i], &h->dados[menor]);

            i = menor;
        }
        else{
            break;
        }
    }
}

void imprimir(Heap *h){

    int i;

    printf("Heap: ");

    for(i = 0; i < h->tamanho; i++){

        printf("%d ", h->dados[i]);
    }

    printf("\n");
}

int main(){

    Heap *h;

    h = create();

    if(h == NULL){

        printf("Erro de alocacao!\n");
        return 1;
    }

    printf("Heap minimo criado com sucesso!\n\n");

    /* Inserções */
    insert(h, 13);
    imprimir(h);

    insert(h, 67);
    imprimir(h);

    insert(h, -92);
    imprimir(h);

    insert(h, 1);
    imprimir(h);

    insert(h, 0);
    imprimir(h);

    insert(h, 150);
    imprimir(h);

    insert(h, 59);
    imprimir(h);

    printf("\n");

    /* Remoções */
    printf("Removido: %d\n", deleteMinVal(h));
    imprimir(h);

    printf("Removido: %d\n", deleteMinVal(h));
    imprimir(h);

    free(h);

    return 0;
}