#include<stdio.h>
int main(){
    int n,rev=0,m;
    printf("Enter number : ");
    scanf("%d",&n);
    while(n>0){
        m=n%10;
        n=n/10;
        rev = (rev*10) + m;
    }
    printf("%d",rev);
    return 0;
}