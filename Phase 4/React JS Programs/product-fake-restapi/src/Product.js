import axios from "axios";

function Product() {
let loadFakeData = function() {
    axios.get("https://api.escuelajs.co/api/v1/products").then(result=> {
        console.log(result)
    }).catch(error=> {
        console.log(error)
    })
}
    return(
        <div>
            <input type="button" value="Load Data" onClick={loadFakeData}/>
        </div>
    )
}

export default Product;