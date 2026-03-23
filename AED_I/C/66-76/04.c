#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 100

typedef struct {
    char nome[51];
    int resolvidos;
} Aluno;

int compara(const void *a, const void *b) {
    Aluno *alunoA = (Aluno *)a;
    Aluno *alunoB = (Aluno *)b;
  
    
    if (alunoA->resolvidos != alunoB->resolvidos)
        return alunoB->resolvidos - alunoA->resolvidos; // decrescente por número de problemas
    return strcmp(alunoA->nome, alunoB->nome); // crescente por nome
}

int main() {
    int n;
    scanf("%d", &n);

    Aluno alunos[MAX];

    for (int i = 0; i < n; i++) {
        scanf("%s %d", alunos[i].nome, &alunos[i].resolvidos);
    }

    qsort(alunos, n, sizeof(Aluno), compara);

    for (int i = 0; i < n; i++) {
        printf("%s %d", alunos[i].nome, alunos[i].resolvidos);
        if (i == n - 1) {
            printf(" #reprovado(a)");
        }
        printf("\n");
    }

    return 0;
}