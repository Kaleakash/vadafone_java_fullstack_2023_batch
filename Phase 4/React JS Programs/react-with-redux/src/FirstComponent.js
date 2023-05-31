import { useState } from "react";
import { useSelector } from "react-redux";

function FirstComponent() {
let [n,setN]=useState(200);     // local variable we can access only in first component 
    let value  = useSelector(gs=>gs.counter);
    let fname = useSelector(gs=>gs.name);
    return(
        <div>
            <h2>First Component {value}</h2>
            <p>N is local variable of first component {n}</p>
            <p>Trainer name is {fname}</p>
        </div>
    )
}

export default FirstComponent;