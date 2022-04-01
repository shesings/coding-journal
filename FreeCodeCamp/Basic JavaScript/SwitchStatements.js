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
  