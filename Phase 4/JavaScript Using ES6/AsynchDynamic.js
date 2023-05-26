function doTask() {
    let n=0;
    setInterval(()=> {
        var dd = new Date();
        if(n%2==0){                     // 1/2, 3/2, 5/2 
            document.getElementsByTagName("h2")[0].style.color="RED";
            document.getElementsByTagName("h2")[0].style.backgroundColor="YELLOW";
        }else {
            document.getElementsByTagName("h2")[0].style.color="GREEN";
            document.getElementsByTagName("h2")[0].style.backgroundColor="BLUE";
        }
        document.getElementById("root").innerHTML=n  
        document.getElementById("dateInfo").innerHTML=dd.getHours()+":"+dd.getMinutes()+":"+dd.getSeconds();
        n++;
    },1000)
}