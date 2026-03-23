#include <stdio.h>
#include <stdlib.h>

int resI = 0, resII = 0;

int insertionSort(int *vet, int n) {
    for (int i = 1; i < n; i++) {
        int chave = vet[i];
        int j = i - 1;

        // Move os elementos maiores que a chave uma posição à frente
        while (j >= 0 && vet[j] > chave) {
            vet[j + 1] = vet[j];
            j--;
            resI++;
        }
        vet[j + 1] = chave;
        //if (j + 1 != i) resI++;
    }
    return resI;
}

int selectionSort(int *vet, int n) {
    for (int i = 0; i < n - 1; i++) {
        int min_idx = i;

        // Encontra o menor elemento na parte não ordenada
        for (int j = i + 1; j < n; j++)
            if (vet[j] < vet[min_idx])
                min_idx = j;

        // Troca o menor elemento com o primeiro da parte não ordenada
        if (min_idx != i) {
            int temp = vet[min_idx];
            vet[min_idx] = vet[i];
            vet[i] = temp;
            resII ++;
        }
    }
    return resII;
}

int main (){
    int n, i, res;

    scanf("%d", &n);
    int *vet = (int*)calloc(n, sizeof(int));
    int *vet2 = (int*)calloc(n, sizeof(int));
    for (i = 0; i < n; i++){
        scanf("%d", &vet[i]);
        vet2[i] = vet[i];
    }
    res = insertionSort(vet, n) - selectionSort(vet2, n);
    printf("%d", res);

}
