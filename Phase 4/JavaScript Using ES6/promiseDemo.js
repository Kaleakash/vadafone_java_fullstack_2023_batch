var obj = new Promise((resolved,rejected)=>{
    resolved("promise resolved")
    //rejected("promise rejected")
})

obj.then((data)=>document.write("<br/>Then "+data)).catch(error=>document.write("<br/>Error"+error))
document.write("<br/>Hello")
document.write("<br/>Hi")
document.write("<br> How r you");