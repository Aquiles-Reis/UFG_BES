#include <stdio.h>
#include <stdlib.h>

int main (){
    
    int a, t, n, i;
    int I = 0, P = 0, dI = 0, dP = 0;
    
    scanf("%d", &n);
    int *vetN = (int*)calloc(n, sizeof(int));

    for (i = 0; i < n; i++){
        scanf("%d", &vetN[i]);
    }
    for (i = 0; i < n; i++){
        if(vetN[i]%2 == 0) {
            P++;
        } else {
            I++;
        }
    }
    int *vetP = (int*)calloc(P, sizeof(int));
    int *vetI = (int*)calloc(I, sizeof(int));
    
    for (i = 0; i < n; i++){
        if(vetN[i]%2 == 0) {
        vetP[dP] = vetN[i];
        dP++;
        } else {
            vetI[dI] = vetN[i];
            dI++;
        }
    }
    for (a = 0; a < dP; a++) {
        for (i = 0; i < dP - a - 1; i++) {
            if (vetP[i] > vetP[i+1]) {
                t = vetP[i];
                vetP[i] = vetP[i+1];
                vetP[i+1] = t;
            }
        }
    }
    for (a = 0; a < dI; a++) {
        for (i = 0; i < dI - a - 1; i++) {
            if (vetI[i] < vetI[i+1]) {
                t = vetI[i];
                vetI[i] = vetI[i+1];
                vetI[i+1] = t;
            }
        }
    }
    for (i = 0; i < dP; i++) {
        printf("%d ", vetP[i]);
    }
    printf("\n");
    for (i = 0; i < dI; i++) {
        printf("%d ", vetI[i]);
    }
}