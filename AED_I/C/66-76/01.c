#include <stdio.h>
#include <stdlib.h>

int main (){
    int n, i, j, v, *arr, t, a;
    scanf("%d", &n);
    
    int *res = (int*)calloc(n, sizeof(int));

    for (i = 0; i < n; i++){
        scanf("%d", &v);
        arr = (int*)calloc(v, sizeof(int));
        
        for (j = 0; j < v; j++){
            scanf("%d", &arr[j]);
        }

        // bubble sorte
        for (a = 0; a < v - 1; a++) {
            for (j = 0; j < v - 1 - a; j++){
                if(arr[j] > arr[j + 1]){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    res[i]++;
                }
            }
        }

    }
    for (i = 0; i < n; i++){
        printf("%d\n", res[i]);
    }
}