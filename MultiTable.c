#include <stdio.h>
int main() {
    int n, mul , i;
    printf("Enter number: ");
    scanf("%d", &n);
    for (i = 1; i <= 10; i++) {
        mul = n * i;
        printf("%d\n",mul);
    }
    return 0;
}