import { useState } from "react";

function Child1(props) {
let [child1Name,setChild1Name]=useState("Child1 name is John");
    return(
        <div  style={{backgroundColor:"pink"}}>
            <h2>Child1 Component</h2>
        <p>Child1 Name is Child1 Component is {child1Name}</p>
            <p>Parent name in child1 component is {props.pname}</p>
        <p>{props.handleCallback(child1Name)}</p>
        <p>Child2 componnet state variable in child1 component is {props.child2name}</p>
        </div>
    )
}

export default Child1;