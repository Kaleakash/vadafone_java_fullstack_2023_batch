import axios from "axios";
import { useState } from "react";

function Product() {
let [products,setProduct]=useState([])
let loadFakeData = function() {
    axios.get("https://api.escuelajs.co/api/v1/products").then(result=> {
        console.log(result.data)
        setProduct(result.data);        // loaded data store in products
    }).catch(error=> {
        console.log(error)
    })
}
let product = products.map(p=><div>
    {p.images.map(img=>
        <img src={img} width="100px" height="100px"/>    
    )}
    {p.id}{p.title}{p.price}
    </div>)
    return(
        <div>
            <input type="button" value="Load Data" onClick={loadFakeData}/>
            <hr/>
            {product}
        </div>
    )
}

export default Product;