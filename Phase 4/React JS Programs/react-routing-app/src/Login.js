import { useState } from "react";
import { useNavigate } from "react-router-dom";

function Login() {
let [emailid,setEmailId]=useState("");
let [password,setPassword]=useState("");
let navigate = useNavigate();       // this hook help to navigate from one component to another component with condition. 
let verifyUser = function(event){
    event.preventDefault();
    // we can pass username and password to backend technlogies using axios and 
    // base upon result we can navigate to another component 
    if(emailid=="akash@gmail.com" && password=="123"){
            alert("successfully login")
            navigate("/home");
    }else {
            alert("failure try once again")
    }
    setEmailId("");
    setPassword("");
}
    return(
        <div>
            <h2>Login Page</h2>
            <form onSubmit={verifyUser}>
                <label>EmailId</label>
                <input type="email" name="emailid" onChange={(event)=>setEmailId(event.target.value)}/><br/>
                <label>Password</label>
                <input type="password" name="password" onChange={(event)=>setPassword(event.target.value)}/><br/>
                <input type="submit" value="submit"/>
                <input type="reset" value="reset"/>
            </form>
        </div>
    )
}

export default Login;