import { useState } from "react";

function FunctionStyleEvent() {
let [name,setName]=useState("Lex");

let fun1=function() {
    alert("Expression style with react event");
}

let fun2 = ()=>alert("Arrow style with react event")
let fun3 = ()=>setName("Neena");
    return(
        <div>
            <p>Name is {name}</p>
            <h2>Function style event concept in React JS</h2>
<input type="button" value="Click Here" onClick={fun1}/><br/>
<input type="button" value="Click Here" onClick={fun2}/><br/>
<input type="button" value="Change Name" onClick={fun3}/><br/>
<input type="button" value="Change Name" onClick={function() {
    setName("Steven")
}}/><br/>
<input type="button" value="Change Name" onClick={()=> setName("Rafael")}/><br/>

        </div>
    )
}


export default FunctionStyleEvent;