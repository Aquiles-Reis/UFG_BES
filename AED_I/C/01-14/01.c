#include <stdio.h>

int main (){
    int ano, base = 1986;
    scanf("%d", &ano);
    if (ano < 0 || ano > 10000) {
        return 1;
    }
    if (ano < base) {
        while (ano < base) {
            base -= 76;
            if (base == ano || base < ano) {
                printf("%d", base + 76);
                return 0;
            } 
        }
        printf("%d", base);
        return 0;
    } else if (ano > base) {
        while (ano > base) {
            base += 76;
            if (base == ano) {
            printf("%d", base + 76);
            return 0;
            }
        }
        printf("%d", base);
        return 0;
    }
    if (ano == 1986) {
            printf("%d", ano + 76);
            return 0;
            }
}