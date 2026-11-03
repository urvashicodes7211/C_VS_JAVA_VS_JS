let n = prompt ("Enter number ");
let sum=0;
let digit;
while(n>0){
    digit = n%10;
    sum = sum + digit;
    n= n/10;
}
console.log(`sum of digit : ${sum}`);