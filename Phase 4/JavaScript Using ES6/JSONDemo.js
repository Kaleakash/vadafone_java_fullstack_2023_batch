let emp1 = {id:100,name:"John",age:21};
document.write("<br> Object in literal style")
document.write("<br> Id is "+emp1.id);
document.write("<br> Id is "+emp1.name);
document.write("<br> Id is "+emp1.age);
// converting JS object into string format
    let empString = JSON.stringify(emp1); 
document.write("<br> Object in string format")
document.write("<br> Id is "+empString.id);
document.write("<br> Name is "+empString.name);
document.write("<br> Age is "+empString.age);
// converting string to json format 
    let empJSON = JSON.parse(empString);
document.write("<br> Object in json format")
document.write("<br> Id is "+empJSON.id);
document.write("<br> Name is "+empJSON.name);
document.write("<br> Age is "+empJSON.age);
// convert json or literal object to string 
    let empString1 = JSON.stringify(empJSON);
document.write("<br> Object in string format")
document.write("<br> Id is "+empString1.id);
document.write("<br> Name is "+empString1.name);
document.write("<br> Age is "+empString1.age);
