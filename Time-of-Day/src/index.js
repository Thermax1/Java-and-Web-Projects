import React from "react";
import ReactDOM from "react-dom";

const timeOfDay = new Date();
const time = timeOfDay.toLocaleTimeString("en-US", {
  hour: "numeric",
  minute: "numeric",
  hour12: false
});

const myTime = parseInt(time.split(":")[0], 10);

console.log(myTime);
let greeting;
let myColor;
if (myTime >= 0 && myTime <= 11) {
  greeting = "Good Morning";
  myColor = "red";
} else if (myTime >= 12 && myTime <= 17) {
  greeting = "Good Afternoon";
  myColor = "green";
} else {
  greeting = "Good Night";
  myColor = "blue";
}
 
//greeting = myTime >= 0 && myTime <= 11 ? "Good morning!" : 
//myTime >= 12 && myTime <= 17 ? "Good afternoon" : "Good night"; This is another way of writing it so it stays concise
const myStyle = {
  color: myColor
};
console.log(myColor);
ReactDOM.render(
  <div className="App">
    <h1 style={myStyle}>{greeting}</h1>
  </div>,
  document.getElementById("root")
);
