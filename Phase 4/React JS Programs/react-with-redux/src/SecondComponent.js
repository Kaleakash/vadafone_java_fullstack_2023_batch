import { useSelector } from "react-redux";

function SecondComponent() {
    //useSelector is a type of hook which help to access global state 
    // variable in any component doesn't matter what type of relationship they have.
let value  = useSelector(gs=>gs.counter);
let fname = useSelector(gs=>gs.name);
    return(
        <div>
            <h2>Second Component {value}</h2>
            <p>Traier name is {fname}</p>
        </div>
    )
}

export default SecondComponent;