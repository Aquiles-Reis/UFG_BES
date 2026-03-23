#include <stdio.h>

#define MAX 1000
long long memo[MAX];

long long f(long long n) {
    if (memo[n] != -1) return memo[n];
    if (n == 0) return memo[n] = 0;
    if (n == 1 || n == 2) return memo[n] = 1;
    return memo[n] = f(n - 1) + f(n - 2);
}

int main() {
    long long n, i;
    scanf("%lld", &n);

    // Inicializa o vetor com -1
    for (i = 0; i < MAX; i++) memo[i] = -1;

    for (i = 0; i < n; i++) {
        printf("%lld ", f(i));
    }
    return 0;
}