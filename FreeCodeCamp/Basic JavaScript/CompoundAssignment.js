// compound assignment with augemented addition

// note that...
myVar = myVar + 5;
// ... this can exist because everything to the right is evaluated first
// so operators and assignment can be in one step

let a = 3;
let b = 17;
let c = 12;

a = a + 12;
b = 9 + b;
c = c + 7;

// ...can be changed into this

a += 12;
b += 9;
c += 7;

// compound assignment with augemented subtraction
let a = 11;
let b = 9;
let c = 3;

// Before
a = a - 6;
b = b - 15;
c = c - 1;

// After
a -= 6;
b -= 15;
c -= 1;

// compound assignment with augemented multiplication
let a = 5;
let b = 12;
let c = 4.6;

// Before
a = a * 5;
b = 3 * b;
c = c * 10;

// After
a *= 5;
b *= 3;
c *= 10;

// compound assignment with augmented division
let a = 48;
let b = 108;
let c = 33;

// Before
a = a / 12;
b = b / 4;
c = c / 11;

// After
a /= 12;
b /= 4;
c /= 11;