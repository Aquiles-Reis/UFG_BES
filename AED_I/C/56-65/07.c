#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main (){

    int i;
    double y = 0, pm, n, E, a, b, v;
    
    scanf("%lf %lf %lf %lf", &n, &E, &a, &b);
    
    pm = (a + b)/2;

    for (i = 0; i < n; i++){
    scanf("%lf", &v);
    y += v * pow(pm, i);
    printf("%d", y);  
    }
}