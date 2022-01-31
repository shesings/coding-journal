const myStr = "This is the start. " + "This is the end.";

let myStr = "This is the first sentence.";
myStr += " This is the second sentence.";

// Consturcting Strings with Variables
const myName = "Sheetal";
const myStr = "My name is " + myName + "and I am well!";

// Appending Variables to Strings
const someAdjective = "sad";
let myStr = "Learning to code is ";
myStr += someAdjective;

// Finding Length of a String
// Setup
let lastNameLength = 0;
const lastName = "Lovelace";

lastNameLength = lastName;
lastNameLength = lastName.length;

// Bracket Notation to Find First Character in a String
let firstLetterOfLastName = "";
const lastName = "Lovelace";
firstLetterOfLastName = lastName[0]; 

// Understand String Immutability
let myStr = "Jello World";
//myStr[0] = "H"; // this is not possible
myStr = "Hello World"

// Use Bracket Notation to Find the Nth Character in a String
const lastName = "Lovelace";
const thirdLetterOfLastName = lastName[2]; 

// Use Bracket Notation to Find the Last Character in a String
const lastName = "Lovelace";
const lastLetterOfLastName = lastName[lastName.length - 1]; 

// Word Blanks 
const myNoun = "dog";
const myAdjective = "big";
const myVerb = "ran";
const myAdverb = "quickly";

// Only change code below this line
const wordBlanks = myNoun + myAdjective + myVerb + myAdverb; // Change this line
// Only change code above this line

// TODO: fix above ^