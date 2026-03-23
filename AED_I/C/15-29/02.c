#include <stdio.h>

long long f(long long n) {
    if (n == 0) return 0;
    if (n == 1 || n == 2) return 1;
    return f(n - 1) + f(n - 2);
}

int main() {
    long long n, i;
    scanf("%lld", &n);
    for (i = 0; i < n; i++) {
        printf("%lld ", f(i));
    }
    return 0;
}