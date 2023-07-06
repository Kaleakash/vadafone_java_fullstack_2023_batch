import Child from "./Child";

function Parent() {
let handleChildFun = (callback) => {

    callback();
}
let parentFun = ()=>{
    alert("This is parent function")
}
    return(
        <div>
            <h2>Parent Component</h2>  
            <Child passParentFun = {parentFun} handleChild = {handleChildFun}></Child>
        </div>
    )
}


export default Parent;