import { useState } from "react";
import Child1 from "./Child1";
import Child2 from "./Child2";

function Parent() {
let [parentName,setParentName]=useState("Parent Name is Ajay Kumar");
let [child1ReceivedName,setChild1Name]=useState("");
let [child2ReceivedName,setChild2Name]=useState("");
let child1Data=function(data){
       setChild1Name(data);  // to display child1 value in parent component 
       console.log(data);   // 
}
let child2Data=function(data){
    setChild2Name(data);  // to display child1 value in parent component 
    console.log(data);   // 
}
    return(
        <div  style={{backgroundColor:"orange"}}>
            <h2>Parent Component</h2>
            <p>Parent name in parent component is {parentName}</p>
            <p>Child1 Name in Parent Component is {child1ReceivedName}</p>
            <p>Child2 Name in Parent Component is {child2ReceivedName}</p>
             <Child1 pname={parentName} handleCallback={child1Data} child2name={child2ReceivedName}></Child1>
            <Child2 pname={parentName} handleCallback={child2Data} child1name={child1ReceivedName}></Child2>
            <p>Parent Component Area</p>
        </div>
    )
}

export default Parent;