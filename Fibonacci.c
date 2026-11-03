#include<stdio.h>
int main(){
    int n,first=0,second=1,sum,i;
    printf("Enter number of series: ");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("%d ",first);
        sum=first+second;
        first=second;
        second=sum;
    }
    return 0;
}