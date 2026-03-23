#include <stdio.h>
#include <stdlib.h>

int main (){
    int t, n, k, i, j, x = 0, d, *arr;
    char *vet;

    scanf("%d", &t);
    arr = (int*)calloc(t, sizeof(int));
    for (i = 0; i < t; i++){
       
        scanf("%d %d", &n, &k);
        vet = (char*)calloc(n*n, sizeof(char));
        
        for (j = 0; j < n*n; j++){
            scanf(" %c", &vet[j]);
        }
        for (j = 0; j < n*n; j ++){
            d = k;
            if(vet[j] == 'P'){
                for (d = 1; d <= k; d++) {
                    if (j - d >= 0 && (j - d)/n == (j/n) && vet[j - d] == 'L') {
                        vet[j - d] = 'V';
                        x++;
                        break;
                    } else if (j + d < n*n && (j + d)/n == (j/n) && vet[j + d] == 'L') {
                        vet[j + d] = 'V';
                        x++;
                        break;
                    }
                } 
            }
        }
        arr[i] = x;
        x = 0;
    }
    for (i = 0; i < t; i++){
        printf("%d\n", arr[i]);
    }
}