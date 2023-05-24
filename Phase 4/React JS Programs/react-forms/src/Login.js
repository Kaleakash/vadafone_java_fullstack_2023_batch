import { useState } from "react";

function Login() {
let [emailid,setEmailId]=useState("");
let [password,setPassword]=useState("");

let changeValue= function(event){
    let name = event.target.name;       // text field name
    let value = event.target.value;     // text field value 
    console.log(name+" "+value);
    if(name=="emailid"){
        setEmailId(value);
    }else if(name=="password"){
        setPassword(value);
    }
}
let verifyUser= function(event){
    event.preventDefault();
    //console.log("event fired");
    if(emailid=="akash@gmail.com" && password=="123"){
        alert("successfully login")
    }else {
        alert("failure try once again")
    }
}
    return(
        <div>
            <h2>Login Page</h2>
            <form onSubmit={verifyUser}>
                <label>EmailId</label>
            <input type="text" name="emailid" onChange={changeValue}/><br/>
                <label>Password</label>
                <input type="password" name="password" onChange={changeValue}/><br/>
                <input type="submit" value="submit"/>
                <input type="reset" value="reset"/>
            </form>
            <hr/>
            <h2>Login Page</h2>
            <form onSubmit={verifyUser}>
                <label>EmailId</label>
                <input type="text" name="emailid" 
                onChange={(event)=>setEmailId(event.target.value)}/><br/>
                <label>Password</label>
                <input type="password" name="password" 
                onChange={(event)=>setPassword(event.target.value)}/><br/>
                <input type="submit" value="submit"/>
                <input type="reset" value="reset"/>
            </form>
        </div>
    )
}


export default Login;