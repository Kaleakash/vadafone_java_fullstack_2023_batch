import { useState } from "react";

function Students() {
    let [stdname,setStdName]=useState("");  // primitive
    let [names,setName]=useState(["Jones","Rafeal","George","Lex"]);    //names is array type 
    
    let addNames = function(event){
        //let names = stdname;
        setName((previousValue)=> {
               return [...previousValue,stdname]    // append the value for previous array 
        });
        setStdName("");
    }
    let name = names.map(n=><p>Mr {n}</p>)
    return(
        <div>
            <label>Student Name</label>
            <input type="text" name="stdname"
            onChange={(event)=>setStdName(event.target.value)} value={stdname}/>
            <input type="button" value="Add name"
            onClick={addNames}/>
            <h2>Students Names</h2>
            {name}
        </div>
    )
}
export default Students;