import { useState } from "react";

function Child2(props) {
let [child2Name,setChild1Name]=useState("Child2 name is Steven");
    return(
        <div  style={{backgroundColor:"gray"}}>
            <h2>Child2 Component</h2>
            <p>Child2 Name is Child2 Component is {child2Name}</p>
            <p>Parent name in child2 component is {props.pname}</p>
            <p>{props.handleCallback(child2Name)}</p>
            <p>Child1 componnet state variable in child2 component is {props.child1name}</p>
        </div>
    )
}

export default Child2;