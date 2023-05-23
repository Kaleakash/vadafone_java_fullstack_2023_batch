import { useState } from "react";


function Customer(props) {
let id = useState(100);
let name = useState("Leena");
let age = useState(21); 
//let marks = useState([])


    return(
    <div>
    <h2>Customer Component in function style</h2>
     <p>CId is {id} Name is {name}, Age is {age}</p>
    <p>Designation is {props.designation}</p>
    </div>
    )
}

export default Customer;