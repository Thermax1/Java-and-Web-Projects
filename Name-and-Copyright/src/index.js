import React from "react";
import ReactDOM from "react-dom";

const myName = "Anthony Munoz";
const year = new Date().getFullYear();
ReactDOM.render(
  <div>
    <p>My name is {myName}</p>
    <p>Copyright {year}</p>
  </div>,
  document.getElementById("root")
);
