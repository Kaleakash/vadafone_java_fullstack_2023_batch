import { useState } from "react";
import Child1 from "./Child1";
import Child2 from "./Child2";
import { MyContext } from "./Context";

function Parent() {
    let [pname,setPName]=useState("Akash")
    return(
        <MyContext.Provider value={pname}>
        <div>
            <h2>Parent Component</h2>
            <p>Parent Name in parent component is {pname}</p>
            <Child1></Child1>
            <Child2></Child2>
        </div>
        </MyContext.Provider>
    )
}

export default Parent;