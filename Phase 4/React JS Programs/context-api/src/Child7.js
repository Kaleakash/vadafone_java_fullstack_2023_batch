import { useContext } from "react";
import { MyContext } from "./Context";

function Child7() {
    let result = useContext(MyContext)
    return(
        <div>
            <h2>Child7 Component</h2>
            <p>Parent name in Child7 component is {result}</p>
        </div>
    )
}

export default Child7;