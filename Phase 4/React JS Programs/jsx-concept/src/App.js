import React, { useState } from "react";

function WithoutJSX() {
  // coding 
  //var pTag = document.createElement("p");
  //var pTagValue = document.createTextNode("Welcome");
  // pTag.appendChild(pTagValue);
 return React.createElement("div","","Welcome to React JS Training without JSX");
}

function WithJSX() {
  return<div>Welcome to React JS Training with JSX</div>
}
function Operation() {
  return(
    <div>
      <p>Add {10+20}</p>
      <p>Sub {10-20}</p>
      <p>Mul {10*20}</p>
      <p>Div {10/20}</p>
    </div>
  )
}
// StudentInfo variable hold jsx code 
let StudentInfo = (
  <ul>
    <li>Steven</li>
    <li>John</li>
    <li>Akash</li>
    <li>Lex</li>
    <li>Neena</li>
    <li>Luis</li>
  </ul>
);
function StudentDetails() { // this funtion return StudentInfo variable name which return jsx. 
  return StudentInfo;
}

function Hi() {
  return <h1>Hi</h1>
}
function Hello() {
  return <h1>Hello</h1>
}
function ConditionalJSX() {
  let result = useState(false);

  return(
  
    <div>
      {!result ? <Hi></Hi>  :<Hello></Hello>}
    </div>
  )
}
function App() {
  return (
  <div>
    <h2>React with JSX</h2>
    <ConditionalJSX></ConditionalJSX>
    <p>Welcome to P Tag</p>
       <WithoutJSX></WithoutJSX>
    <WithJSX></WithJSX>
    <Operation></Operation>
   <StudentDetails></StudentDetails>
  </div>
  );
}




export default App;
