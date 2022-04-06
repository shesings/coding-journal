// Selecting from Many Options with Switch Statements
// Note strict equality is ===
function caseInSwitch(val) {
    let answer = "";
  switch(val) {
    case 1:
      answer = "alpha";
      break; // don't forget the break statements!
    case 2:
      answer = "beta";
      break;
    case 3:
      answer = "gamma";
      break;
    case 4:
      answer = "delta";
      break;
  }
    return answer;
  }
  caseInSwitch(1);

// Adding a Default Option in Switch Statements
function switchOfStuff(val) {
    let answer = "";
    switch(val) {
      case "a":
        answer = "apple";
        break;
      case "b":
        answer = "bird";
        break;
      case "c":
        answer = "cat";
        break;
      default: // this is the default option!
        answer = "stuff";
        break;
    }
    return answer;
  }
  switchOfStuff(1);

// Multiple Indentical Option in Switch Statements:
function sequentialSizes(val) {
    let answer = "";
    // 1-3 = Low, 4-6 = Mid, 7-9 = High
    switch(val) {
      case 1:
      case 2:
      case 3:
        answer = "Low"; // goes in a checks each case until it hits the break statement
        break;
      case 4:
      case 5:
      case 6:
        answer = "Mid";
        break;
      case 7:
      case 8:
      case 9:
        answer = "High";
        break;
    }
    return answer;
  }
  sequentialSizes(1);

  // Replacing If Else Chains with Switch
  function chainToSwitch(val) {
    let answer = "";
  /*
    if (val === "bob") {
      answer = "Marley";
    } else if (val === 42) {
      answer = "The Answer";
    } else if (val === 1) {
      answer = "There is no #1";
    } else if (val === 99) {
      answer = "Missed me by this much!";
    } else if (val === 7) {
      answer = "Ate Nine";
    }
  */
    switch(val) {
      case "bob":
        answer = "Marley";
        break;
      case 42:
        answer = "The Answer";
        break;
      case 1:
        answer = "There is no #1";
        break;
      case 99:
        answer = "Missed me by this much!";
        break;
      case 7:
        answer = "Ate Nine";
        break;
    }
    return answer;
  }
  
  chainToSwitch(7);

  // Returning Boolean Values from Functions
  function isLess(a, b) {
    // Only change code below this line
    /*if (a < b) {
      return true;
    } else {
      return false;
    }*/
    return a <= b;
    // Only change code above this line
  }
  
  isLess(10, 15);

  // Return Early Pattern for Functions

function abTest(a, b) {

  if (a < 0 || b < 0) {
    return undefined;
  } 

  return Math.round(Math.pow(Math.sqrt(a) + Math.sqrt(b), 2));
}

abTest(2,2);

// Counting Cards
let count = 0;
function cc(card) {
  switch (card) {
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
      count++;
      break;
    case 10:
    case "J":
    case "Q":
    case "K":
    case "A":
      count--;
      break;
  }
  if (count > 0) {
    return count + " Bet";
  } else {
    return count + " Hold";
  }
}
cc(2); cc(3); cc(7); cc('K'); cc('A');

