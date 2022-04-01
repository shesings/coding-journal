// Introducting Else Statement:
function testElse(val) {
    let result = "";
    if (val > 5) {
      result = "Bigger than 5";
    } else { // else statement
      result = "5 or Smaller";
    }
    return result;
  }
  
  testElse(4);

  // Introducting Else If Statement
  function testElseIf(val) {
    if (val > 10) {
      return "Greater than 10";
    } else if (val < 5) { // else if statement
      return "Smaller than 5";
    } else {
      return "Between 5 and 10";
    }
  }
 
  testElseIf(7);

// Logical Order in If Else Statements:
function orderMyLogic(val) {
    if (val < 5) {
      return "Less than 5";
    } else if (val < 10) {
      return "Less than 10";
    } else {
      return "Greater than or equal to 10";
    }
  }
  // ordering matters for if and else-if statements
  orderMyLogic(7);

// Chaining If Else Statements:
function testSize(num) {
  if (num < 5){
    return "Tiny";
  } else if (num < 10) {
    return "Small";
  } else if (num < 15) {
    return "Medium";
  } else if (num < 20) {
    return "Large";
  } else if (num >= 20) {
    return "Huge";
  } else {
    return "Change Me";
  }
  }
  testSize(7);

// Golf Code:
const names = ["Hole-in-one!", "Eagle", "Birdie", "Par", "Bogey", "Double Bogey", "Go Home!"];

function golfScore(par, strokes) {
if (strokes == 1) {
  //return "Hole-in-one!";
  return names[0];
} else if (strokes <= par-2) {
  return names[1];
} else if (strokes == par-1) { // don't forget the double equals!
  return names[2];
} else if (strokes == par) {
  return names[3];
} else if (strokes == (par+1)) { // parathesis don't matter in this case
  return names[4];
} else if (strokes == (par+2)) {
  return names[5];
} else {
  return names[6];
} 
}

golfScore(5, 4);