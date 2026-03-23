#include <stdio.h>

int f (int m, int n) {
    int res;
    if (n > 0 && m == 0) return n + 1;
    if (n == 0 && m > 0) return f(m - 1, 1);
    if (n > 0 && m > 0) return f(m - 1, f(m, n-1));
    if (n == 0 && m == 0) return 0; 
}
int main (){
    
    int m, n, res;
    scanf("%d %d", &m, &n);
    res = f(m, n);
    printf("%d", res);
}