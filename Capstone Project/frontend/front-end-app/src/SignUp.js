import { useState } from "react";
import {Link} from 'react-router-dom';
import axios from 'axios';
function SignUp() {
let [emailid,setEmailiId]=useState("");
let [password,setPassword]=useState("");
let [typeofuser,setTypeOfUser]=useState("");

let signIn=async (event)=> {
    event.preventDefault();
    let login = {"emailid":emailid,"password":password,"typeofuser":typeofuser};
    try{
    let result = await axios.post("http://localhost:8080/login/signUp",login);
    console.log(result.data);
    }catch(ex){
        console.log(ex);
    }
}
    return(
        <div>
        <div>Account Create</div>
        <form onSubmit={signIn}>
        <label>EmailId</label>
        <input type="email" name="emidlid" onChange={e=>setEmailiId(e.target.value)}/><br/>
        <label>Password</label>
        <input type="password" name="password" onChange={e=>setPassword(e.target.value)}/><br/>
        <label>TypeOfUser</label>
        <input type="radio" name="typeofuser" value="admin" onChange={e=>setTypeOfUser(e.target.value)}/>Admin
        <input type="radio" name="typeofuser" value="customer" onChange={e=>setTypeOfUser(e.target.value)}/>Customer<br/>
        <input type="submit" value="submit"/>
        <input type="reset" value="reset"/><br/>
        <Link to="/">Login</Link>
        </form>
        </div>
    )
}

export default SignUp;