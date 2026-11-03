let a = prompt("Enter number");
let b = prompt("Enter number");
let c = prompt("Enter number");
let largestNum =  ((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c));
console.log("largestNum : "+largestNum);