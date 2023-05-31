import axios from 'axios';
import { useEffect } from 'react';
import {useDispatch} from 'react-redux';

function EventFinder() {

     // to access global state 
let dispatch = useDispatch();                   // to send action to reducer 

let loadAllEvents = function(event){
    return dispatch=>{
    axios.get("http://localhost:3000/events").then(result=> {
            dispatch({type:"LOAD_EVENTS",payload:result.data})
    }).catch(error=> {
        console.log(error);
    })
}
}
// it call automatically 
useEffect(()=> {
    //console.log("Hello")
    dispatch(loadAllEvents());
},[])
    return(
        <div>
            <h2>Event Finder</h2>
        </div>
    )
}

export default EventFinder;