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
// class Employee {
//     constructor() {
//         document.write("<br> Employee object created...")
//     }
//     display() {
//         document.write("<br> Employee object function")
//     }
// }
// let emp1 = new Employee();   // empty constructor 
//emp1.display();

// In ES6 creating more than one object using parameter constructor 
class Employee {
    constructor(id,name,age){
        this.id = id;
        this.name = name;
        this.age = age;        
    }
    display() {
        document.write("<br> Emloyee details");
        document.write("<br> id is "+this.id);
        document.write("<br> name is "+this.name);
        document.write("<br> age is "+this.age);
    }
}
let emp1 = new Employee(100,"Steven",21);   // parameter construtor 
let emp2 = new Employee(101,"Ajay",25);
emp1.display();
emp2.display();