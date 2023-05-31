import { useState } from "react";
import { useDispatch } from "react-redux";

function DynamicDecrement() {
//useDispatch is pre defined hook 
// which help to pass action and payload (data)
// to reducer. 
let [n,setN]=useState(0);
let dispatch = useDispatch();
    return(
    <div>
       <h2>Dynamic Decrement Component</h2>
       <input type="text" name="n" onChange={(event)=>setN(event.target.value)}/>
       <input type="button" value="Decrement"
       onClick={()=>
        dispatch({type:"DYNAMIC_DECREMENT",payload:n})
       }/> 
    </div>
    )
}

export default DynamicDecrement;