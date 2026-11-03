#include <stdio.h>
int main() {
    int n, fac = 1, i;
    printf("Enter number: ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++) {
        fac = fac * i;
    }
    printf("%d! = %d\n", n, fac);
    return 0;
}