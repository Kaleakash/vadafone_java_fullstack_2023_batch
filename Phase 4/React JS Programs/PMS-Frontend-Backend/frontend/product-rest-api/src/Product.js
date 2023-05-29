import axios from "axios";
import { useState } from "react";
function Product() {
let [products,setProducts]=useState([{}]);
let [product,setProduct]=useState({pid:0,pname:"",price:0.0,url:""});   //
let [b1,setButton]=useState("Add Product");     // to change button value;
let [msg,setMessage]=useState("");
let loadProducts= function() {
    axios.get("http://localhost:8080/findAllProduct").then(result=>{
        setProducts(result.data)
    }).catch(error=> {
        console.log(error);
    })
}
let addProduct = function(event){           // 
    event.preventDefault();
    console.log(product);       // product hold data in json format. 
    // axios.post(url,objectinjsonformat).then().catch()
    axios.post("http://localhost:8080/storeProduct",product).then(result=> {
       // console.log(result);
       setMessage(result.data);
       loadProducts();          // after store product we will call to load teh fresh product details. 
    }).catch(error=> {
        console.log(error);
    })
    setProduct({pid:0,pname:"",price:0.0,url:""});
}

let deleteProduct=function(event,pid){
    console.log(pid);
    axios.delete("http://localhost:8080/deleteProduct/"+pid).then(result=> {
        console.log(result.data)
        loadProducts();
    }).catch(error=> {
        console.log(error);
    })
}

let resetFun= (event)=> {
    setProduct({pid:0,pname:"",price:0.0,url:""});
    setButton("Add Product");
}

let productRecord = products.map(p=><tr>
    <td>{p.pid}</td>
    <td>{p.pname}</td>
    <td>{p.price}</td>
    <td>
        <img src={p.url} width="100px" height="100px"/>
    </td>
    <td>
    <input type="button" value="Delete Product" 
            onClick={(event)=> {
                deleteProduct(event,p.pid);}}
             className="btn btn-danger"/>
    </td>
</tr>)
    return(
        <div>
            <h2>Product CRUD Operation With REST API Using Spring boot</h2>
        <input type="button" value="Load Products" onClick={loadProducts}/>

        <h2>Add Product</h2>
        <span style={{color:"red"}}>{msg}</span>
        <form onSubmit={addProduct} className="form-group">
            <label>PId</label>
            <input type="number" className="form-control" name="product.pid" value={product.pid} 
            onChange={(event)=>
            setProduct((previousValue)=> {
                return {...previousValue,pid:event.target.value}
            })
            }/><br/>
            <label>PName</label>
            <input type="text" className="form-control" name="product.pname"  value={product.pname} onChange={(event)=>
            setProduct((previousValue)=> {
                return {...previousValue,pname:event.target.value}
            })
            }/><br/>
            <label>Price</label>
            <input type="decimal" className="form-control" name="product.price"  value={product.price} onChange={(event)=>
            setProduct((previousValue)=> {
                return {...previousValue,price:event.target.value}
            })
            }/><br/>
            <label>URL</label>
            <input type="url" className="form-control" name="product.url"  value={product.url} onChange={(event)=>
            setProduct((previousValue)=> {
                return {...previousValue,url:event.target.value}
            })
            }/><br/>
            <input type="submit" value={b1} className="btn btn-primary"/>
            <input type="reset" value="reset" onClick={resetFun} className="btn btn-secondary"/>
        </form>    

            <table>
                <thead>
                <tr>
                    <th>PId</th>
                    <th>PName</th>
                    <th>Price</th>
                    <th>URL</th>
                    <th>Delete Record</th>
                </tr>
                </thead>
                <tbody>
                    {productRecord}
                </tbody>
            </table>
        </div>
    )
}

export default Product;