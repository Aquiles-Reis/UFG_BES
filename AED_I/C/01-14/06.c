#include <stdio.h>
#include <stdlib.h>

int main (){
    int N, K, i, nums, menor;
    int *array;
    scanf("%d %d", &N, &K);
    
    menor = N;
    array = (int *)calloc(K, sizeof(int));
    for (i = 0; i < N; i++){
        scanf("%d", &nums);
        array[nums - 1]++;
    }
     for (i = 0; i < K; i++) {
        if (array[i] < menor) {
            menor = array[i];
        }
    }
    printf("%d", menor);
}