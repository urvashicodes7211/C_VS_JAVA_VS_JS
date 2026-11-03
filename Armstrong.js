function countDigits(num) {
    let count = 0;
    while (num > 0) {
        count++;
        num = Math.floor(num / 10);
    }
    return count;
}

function isArmstrong(num) {
    let originalNum = num;
    let sum = 0;
    let digits = countDigits(num);
    
    while (num > 0) {
        let digit = num % 10;
        sum += Math.pow(digit, digits);
        num = Math.floor(num / 10);
    }
    
    return sum === originalNum;
}

let number = 153; 
console.log(number + " is Armstrong: " + isArmstrong(number));
