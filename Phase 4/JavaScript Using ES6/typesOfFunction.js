// normal function syntax 
info();
function info() {
    document.write("<br/> This is normal function syntax");
}
info();
// expression style function with function name 
let display1 = function display(){
        document.write("<br/> this is expression style function")
        }
display1();
// expression style funtion without name 
//display2();
let display2 = function() {
        document.write("<br/>this is expression style function ")
}
display2();
// arrow style function 
let display3 = ()=>document.write("<br> Simple arrow function ");
display3();


function greeting(fname,callback) {
    return "Welcome "+callback(fname);
}

let maleInfo = function(fname){
    return "Mr "+fname;
}
let femaleInfo = (fname)=>"Miss "+fname;


document.write("<br/> "+greeting("Steven",maleInfo));
document.write("<br/>"+greeting("Neena",femaleInfo));
document.write("<br/>",greeting("John",function(fname){
    return "Mr "+fname;
}))
document.write("<br/>"+greeting("Reeta",(fname)=>"Miss "+fname));

document.write("<br/> "+maleInfo("Ravi"));
document.write("<br/> "+femaleInfo("Leena"))

let addNumber1 = function(a,b){
    let sum = a+b;
    return sum;
}
document.write("<br/> sum of two number using experssion style "+addNumber1(1,2));
let addNumber2 = (a,b)=>a+b;
document.write("<br/> Sum of two number is using arrow style "+addNumber2(1,2));
let findLargest1 = function(a,b){
    if(a>b){
        return " a is largest "
    }else {
        return "b is largest"
    }
}
document.write("<br/> Find the largest of two number is "+findLargest1(10,5));

let findLargest2 = (a,b)=>{
    if(a>b){
        return " a is largest "
    }else {
        return "b is largest"
    }
}
document.write("<br/> Find the largest of two number is "+findLargest2(10,5));
