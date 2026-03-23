#include <stdio.h>

int f (int n){
    int p;
    if (n <= 0) return 1;
    p = n * f(n - 2);
    return p;
}
int main (){
    int n;
    scanf("%d", &n);
    if (n%2 != 0) {
        printf("%d ", f(n));
    } else {
        printf("%d ", f(n - 1));
    }
}