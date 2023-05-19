//object creation in literal style 
// let num1 = [10,20,30,40,50,60];
// let info1=[100,"Ravi",12000,true];

// // object creation using new keyword 
// let num2 = new Array(10,20,30,40,50,60);
// let info2 = new Array(100,"Ravi",14000,false);

// document.write("<br/> "+num1);  // display output in string format 
// document.write("<br/> "+info1);
// document.write("<br/> "+num2);
// document.write("<br/> "+info2);
// document.write("<br/>Element in 0 index position "+num1[1])

// let num1 = [10,20,30,40,50,60];
// document.write("<br/> "+num1);
// document.write("<br/> Size of an array "+num1.length);
// num1.push(100);     // it add at last 
// num1.push(200);
// num1.unshift(300);     // it add at begining 
// num1.unshift(400);
// document.write("<br/> Size of an array "+num1.length);
// document.write("<br/> "+num1);
// num1.pop();     // remove elements from last 
// num1.shift();   // remove elements from begining 
// document.write("<br/> Size of an array "+num1.length);
// document.write("<br/> "+num1);

// let num1 = [10,20,30,40,50,60];
// document.write("<br/> "+num1)
// //1st parameter index position, 2nd parameter number of element 
// // to delete 
// //num1.splice(1,1);
// //num1.splice(1,2);
// //num1.splice(1,4);
// //num1.splice(2,3);
// //1st parameter index position, 2nd parameter number of element 
// // to delete, 3rd parameter add the element 
// //num1.splice(1,1,100);   // 20 replace by 100 
// //num1.splice(1,0,100);
// num1.splice(1,0,100,200,300);   // from 1 index position add 
//                             // 100, 200, 300 etc elements 
// document.write("<br/> "+num1)


// let num1 = [10,20,30,40,50,60];
// document.write("<br/> "+num1);
// document.write("<br/> 0 Index position "+num1[0]);
// document.write("<br/> 1 Index position "+num1[1]);
// document.write(" retreive using for loop"); 
// for(let i=0;i<num1.length;i++){
//     document.write("<br/> Value of num1 is "+num1[i])
// }
// document.write("<br/> For in loop ")
// for(let i in num1){
//     document.write("<br/> Index position "+i+" Value is "+num1[i])
// }
// document.write("<br/> For in loop ")
// for(let n of num1){
//     document.write("<br/> Value is "+n);
// }


// let num1 = [10,20,30,40,50,60];
// document.write("<br> Retrieve elements using forEach with callback with arrow");
// document.write("<br/> display value using callback with normal function")
// document.write("<br/> 1st way ")

// num1.forEach(display);
// function display(n){
//     document.write("<br/> Value is "+n);
// }

// document.write("<br/> display value using callback with expression style")
// document.write("<br/> 2nd way ")

// num1.forEach(function(n){
//     document.write("<br/> Value is "+n);
// });
// document.write("<br/> display value using callback with arrow style")
// document.write("<br/> 3rd way ")

// num1.forEach(n=>document.write("<br/>Value is "+n));

let num1 = [10,11,15,20,30,35,40,50,55,60,62];
//num1.map(e=>e+5).forEach(v=>document.write(" "+v));
num1.filter(v=> v % 2 == 0 ).forEach(v=>document.write(" "+v));



