#include <stdio.h>

int main (){
    int m, n, i, j, ordem = 6, v, ampulheta, temp = 0, z = 0;
    int matriz[36]; 

    for (i = 0; i < ordem; i++){
        for (j = 0; j < ordem; j++){
            scanf("%d", &matriz[(i * ordem) + j]);
        }
    }
    for (i = 0; i <= 3; i++) {
        for (j = z; j < z + 4; j++) {
            ampulheta = 0; 
            ampulheta = matriz[j] + matriz[j + 1] + matriz[j + 2] + matriz[j + 7] + matriz[j + 12] + matriz[j + 13] + matriz[j + 14];
            if (temp < ampulheta) {
                temp = ampulheta;
            }
        }
        z += 6;
    }
    printf("%d", temp);  
}