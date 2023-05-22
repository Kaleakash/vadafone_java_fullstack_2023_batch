/*
ES5 style 
function Employee() {
        this.id =100;
        this.name = "Ajay"
        this.age  =21;
        thid.display=function() {
            document.write("<br> Employee object function")
            document.write("<br> Id is "+this.id);
            document.write("<br> Name is "+this.name);
            document.write("<br> Age is "+this.age);
        }
}
var emp1 = new Employee();
emp1.display();*/
//ES6 style 
// class Employee {
//     id=100;
//     name = "Ajay";
//     age = 21;
//     display() {
//         document.write("<br> Employee object function")
//         document.write("<br> Id is "+this.id);
//         document.write("<br> Name is "+this.name);
//         document.write("<br> Age is "+this.age);
//     }
// }
// let emp1 = new Employee();
// emp1.display();
// let emp2 = new Employee();
// emp2.display();

// ES6 employee object with constructor 
class Employee {
    constructor() {
        document.write("<br> Employee object created...")
    }
    display() {
        document.write("<br> Employee object function")
    }
}
let emp1 = new Employee();
//emp1.display();


