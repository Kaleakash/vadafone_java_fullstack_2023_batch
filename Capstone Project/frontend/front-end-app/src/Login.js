import { useState } from "react";
import axios from 'axios';
function Login() {
let [emailid,setEmailiId]=useState("");
let [password,setPassword]=useState("");
let [typeofuser,setTypeOfUser]=useState("");

let signIn=async (event)=> {
    event.preventDefault();
    let login = {"emailid":emailid,"password":password,"typeofuser":typeofuser};
    try{
    let result = await axios.post("http://localhost:8080/login/signIn",login);
    console.log(result.data);
    }catch(ex){
        console.log(ex);
    }
}
    return(
        <div>
        <div>Login Page</div>
        <form onSubmit={signIn}>
        <label>EmailId</label>
        <input type="email" name="emidlid" onChange={e=>setEmailiId(e.target.value)}/><br/>
        <label>Password</label>
        <input type="password" name="password" onChange={e=>setPassword(e.target.value)}/><br/>
        <label>TypeOfUser</label>
        <input type="radio" name="typeofuser" value="admin" onChange={e=>setTypeOfUser(e.target.value)}/>Admin
        <input type="radio" name="typeofuser" value="customer" onChange={e=>setTypeOfUser(e.target.value)}/>Customer<br/>
        <input type="submit" value="submit"/>
        <input type="reset" value="reset"/>
        </form>
        </div>
    )
}

export default Login;