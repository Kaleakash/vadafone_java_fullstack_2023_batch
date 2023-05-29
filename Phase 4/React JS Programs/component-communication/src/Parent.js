import { useState } from "react";
import Child1 from "./Child1";
import Child2 from "./Child2";

function Parent() {
let [parentName,setParentName]=useState("Parent Name is Ajay Kumar");
let [child1ReceivedName,setChild1Name]=useState("");

let child1Data=function(data){
       setChild1Name(data);  // to display child1 value in parent component 
       console.log(data);   // 
}
    return(
        <div  style={{backgroundColor:"orange"}}>
            <h2>Parent Component</h2>
            <p>Parent name in parent component is {parentName}</p>
            <p>Child1 Name is Parent Component is {child1ReceivedName}</p>
             <Child1 pname={parentName} handleCallback={child1Data}></Child1>
            <Child2></Child2>
            <p>Parent Component Area</p>
        </div>
    )
}

export default Parent;