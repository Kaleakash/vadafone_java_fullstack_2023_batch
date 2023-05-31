import { useDispatch } from "react-redux";

function Increment() {
//useDispatch is pre defined hook 
// which help to pass action and payload (data)
// to reducer. 
let dispatch = useDispatch();
    return(
    <div>
       <h2>Increment Component</h2>
       <input type="button" value="Increment"
       onClick={()=>
        dispatch({type:"INCREMENT"})
       }/> 
    </div>
    )
}

export default Increment;