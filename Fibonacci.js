let n = prompt("Enter number of series: ");
let first=0,second=1,sum;
for(i=0;i<n;i++){
    console.log(`${first} `)
    sum=first+second;
    first=second;
    second=sum;
}