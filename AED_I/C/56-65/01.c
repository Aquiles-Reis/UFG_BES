#include <stdio.h>

int gcd(int a, int b) {
    while (b != 0) {
        int t = b;
        b = a % b;
        a = t;
    }
    return a;
}

int main() {
    int x;
    while (1) {
        scanf("%d", &x);
        if (x == 0) break;
        for (int d = 1; d <= x; d++) {
            for (int n = 1; n < d; n++) {
                if (gcd(n, d) == 1) {
                    printf("%d/%d\n", n, d);
                }
            }
        }
    }
    return 0;
}