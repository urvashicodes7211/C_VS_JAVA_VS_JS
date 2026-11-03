let  n = prompt ("Enter number");
n = parseInt(n);
let rev = 0,m;
while(n>0){
    m=n%10;
    n = Math.floor(n / 10);
    rev = (rev*10) + m;
}
console.log(rev);