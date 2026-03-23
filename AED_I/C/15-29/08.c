#include <stdio.h>
#include <stdlib.h>

int n, m;

int f(int k, int *vet, int *dp){
    int j;

    dp[k - 1] = k;
    for (j = 0; j < m * 2; j += 2) {
        if(vet[j] == k && dp[vet[j+1] - 1] == 0) {
            f(vet[j+1], vet, dp);
        }
    }
    return *dp;
}

int c(int *vet, int *dp){
    int g, pos = 0;
    
    for (g = 0; g < n; g++){
        if(dp[g] == 0) {
            f(g + 1, vet, dp);
            pos++;
        }
    }
    return pos;
}


int main(){
    int x, *vet, *dp;
    scanf("%d %d", &n, &m);

    vet = (int *)calloc(m*2, sizeof(int));
    dp = (int *)calloc(n, sizeof(int));
    
    for (x = 0; x < n; x++) {
        dp[x] = 0;
    }

    for (x = 0; x < m*2; x++){
        scanf("%d", &vet[x]);
    }

    printf("%d", c(vet, dp));
}