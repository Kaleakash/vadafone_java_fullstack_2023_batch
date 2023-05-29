import { useContext } from "react";
import Child4 from "./Child4";
import { MyContext } from "./Context";

function Child3() {
    // useContext use to access value from context referene. 
let result = useContext(MyContext)
    return(
        <div>
            <h2>Child3 Component</h2>
            <p>Parent name is Child3 component is {result}</p>
            <Child4></Child4>
        </div>
    )
}

export default Child3;