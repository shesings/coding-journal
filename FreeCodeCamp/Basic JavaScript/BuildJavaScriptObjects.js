// Build JavaScript Objects
const myDog = {
    "name": "Brooklyn",
    "legs": 4,
    "tails": 1,
    "friends": ["Adonis", "Sheetal"]
  };

// Accessing Object Properties with Dot Notation
const testObj = {
  "hat": "ballcap",
  "shirt": "jersey",
  "shoes": "cleats"
};
const hatValue = testObj.hat;      // using dot notation instead of array brackets
const shirtValue = testObj.shirt;    

// Accessing Object Properties with Bracket Notation
const testObj = {
  "an entree": "hamburger",
  "my side": "veggies",
  "the drink": "water"
};
const entreeValue = testObj['an entree'];    // note here we use the 
const drinkValue = testObj['the drink'];    

// Accessing Object Properties with Variables
const testObj = {
  12: "Namath",
  16: "Montana",
  19: "Unitas"
};

const playerNumber = 16;  
const player = testObj[playerNumber]; 

// Updating Object Properties

const myDog = {
  "name": "Coder",
  "legs": 4,
  "tails": 1,
  "friends": ["freeCodeCamp Campers"]
};

myDog.name = "Happy Coder"; // this is where we updated the code
// could have also done...
// myDog['name'] = "Happy Coder";

// Add New Properties to a JavaScript Object

const myDog = {
  "name": "Happy Coder",
  "legs": 4,
  "tails": 1,
  "friends": ["freeCodeCamp Campers"]
};

myDog.bark = "woof"; // this is clutch because we can add new properties 
// without having them in the initial const 

// Delete Properties from a JavaScript Object
const myDog = {
  "name": "Happy Coder",
  "legs": 4,
  "tails": 1,
  "friends": ["freeCodeCamp Campers"],
  "bark": "woof"
};

delete myDog.tails;

// Using Objects for Lookups

function phoneticLookup(val) {
  let result = "";
  const lookup = {
    "alpha":"Adams",
    "bravo":"Boston",
    "charlie":"Chicago",
    "delta":"Denver",
    "echo":"Easy",
    "foxtrot":"Frank"
  };
  result = lookup[val];
  return result;
}

phoneticLookup("charlie");

// Testing Objects for Properties
function checkObj(obj, checkProp) {

  var check = obj.hasOwnProperty(checkProp);
  if (check) {
    return obj[checkProp];
  } else {
    return "Not Found";
  }

}

// Manipulating Complex Objects
