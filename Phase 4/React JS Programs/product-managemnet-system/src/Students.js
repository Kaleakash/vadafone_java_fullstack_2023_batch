import { useState } from "react";

function Students() {
    let [names,setName]=useState(["Jones","Rafeal","George","Lex"]);    //names is array type 
    
    
    let name = names.map(n=><p>Mr {n}</p>)
    return(
        <div>
            <h2>Students Names</h2>
            {name}
        </div>
    )
}

export default Students;