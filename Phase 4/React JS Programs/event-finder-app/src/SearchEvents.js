import { useState } from 'react';
import {useSelector} from 'react-redux';
function SearchEvents(){
let [eventname,setEventName]=useState();
let events   =  useSelector(gs=>gs.events) 

let searchEvent=function(event){
    let result = events.find(e=>e.name==eventname);
    console.log(result);
}
    return(
        <div>
            <h2>Search Event</h2>
            <input type="search" name="eventname" onChange={
                (event)=>setEventName(event.target.value)
            } />  
            <input type="button"
            value="search" onClick={searchEvent}/>         
        </div>
    )
}

export default SearchEvents;