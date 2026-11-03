#include<stdio.h>
int main(){
    int n,digitcount=0,m,sum=0,power = 1;
    printf("Enter number: ");
    scanf("%d",&n);
    int originalNum = n;
    while(n>0){
        n=n/10;
        digitcount++;
    } 
    n = originalNum;
    while(n>0){
        m=n%10;
        n=n/10;
        for (int i=0;i<digitcount;i++) {
            power =power * m;
        }
        sum = sum + power;
    } 
    if(originalNum == sum){
        printf("Armstrong Number");
    }else{
        printf("Not Armstrong Number");
    }
    return 0;
}