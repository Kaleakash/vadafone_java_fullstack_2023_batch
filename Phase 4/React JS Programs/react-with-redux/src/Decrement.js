import { useDispatch } from "react-redux";

function Decrement() {
//useDispatch is pre defined hook 
// which help to pass action and payload (data)
// to reducer. 
let dispatch = useDispatch();
    return(
    <div>
       <h2>Decrement Component</h2>
       <input type="button" value="Decrement"
       onClick={()=>
        dispatch({type:"DECREMENT"})
       }/> 
    </div>
    )
}

export default Decrement;