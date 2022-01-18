// Differences between var and let keywords
// Problem with declaring variables with var = they have be overwritten with another declaration

// let solves this issue = introduced in ES6
/* Instead of...
var catName = "Oliver";
var catSound = "Meow!";

having...
let catName = "Luna";
let catName = "Jinx"; 
...this would throw an error because both use the variable catName

but...
var catName = "Luna";
var catName = "Jinx";
...this woudl not throw an error because var allows you to overwrite variable data
...this can be dangerous in bigger code
*/

let catName = "Oliver";
let catSound = "Meow!";