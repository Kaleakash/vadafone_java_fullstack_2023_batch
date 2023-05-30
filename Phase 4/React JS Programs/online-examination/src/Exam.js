import axios from "axios";
import { useEffect, useState } from "react";
function Exam() {
let [questions,setQuestions]=useState([])
useEffect(()=> {
    //alert("Hello");  
    axios.get("http://localhost:3000/questions").
    then(result=> {
        //console.log(result.data)
        setQuestions(result.data);
    }).
    catch(error=> {
        console.log(error);
    }) 
},[])
let question = questions.map(q=> 
    <div>
        {q.qid} ) {q.question} ? <br/>
        <input type="radio" name={q.qid} value={q.ans1}/>{q.ans1}
        <input type="radio" name={q.qid} value={q.ans2}/>{q.ans2}
        <input type="radio" name={q.qid} value={q.ans3}/>{q.ans3}
        <input type="radio" name={q.qid} value={q.ans4}/>{q.ans4}
    </div>    
)
    return(
    <div>
        <h2>Online Examination</h2>
        {question}
    </div>
    )
}

export default Exam;