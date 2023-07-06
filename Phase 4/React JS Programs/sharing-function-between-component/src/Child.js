function Child(props) {
    
let childFun = ()=> {
    alert("Child function called..")
}

    return(
        <div>
            <h2>Child Component</h2>
            <input type="button" value="Call parent Function" onClick={props.passParentFun}/>
            <input type="button" value="Call child function" onClick={()=>props.handleChild(childFun)}/>
        </div>
    )
}


export default Child;