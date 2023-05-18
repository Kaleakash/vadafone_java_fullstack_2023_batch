function addData() {
    //alert("Event fired...")
    // creating dynamic tag 
    var name = document.getElementById("uname").value;
    var age = document.getElementById("age").value;
    
    var pTag = document.createElement("p");
    // creating value for that tag 
    //var pTagValue = document.createTextNode("Welcome to JavaScript Training");

    var pTagValue = document.createTextNode("Name is "+name+" Age is "+age);
    // we add contents inside that tag 
    pTag.appendChild(pTagValue);   //<p>Welcome to JavaScript Training</p>
    if(age>30){
        pTag.setAttribute("class","myFirstClass");
    }else {
        pTag.setAttribute("class","mySecondClass");
    }


    // get reference of div tag using id attribute 
    document.getElementById("result").appendChild(pTag);
    document.getElementById("uname").value="";
    document.getElementById("age").value="";
}