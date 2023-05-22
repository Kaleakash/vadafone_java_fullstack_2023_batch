// // funtion style object creation 
// function Employee() {
//     this.id = 100;      // instance variable consider 
//     //var id = 100; // local variable consider 
//     this.name = "Ajay";
//     this.age = 21;

//     this.display=function() {
//         document.write("<br> Employee object function")
//         document.write("<br> Id is "+this.id);
//         document.write("<br> Name is "+this.name);
//         document.write("<br> Age is "+this.age);
//     }
// }
// //Employee();
// var emp1 = new Employee();
// var emp2 = new Employee();
// document.write("<br> Id is "+emp1.id);
// document.write("<br> Name is "+emp1.name);
// document.write("<br> Age is "+emp1.age);
// document.write("<br> Id is "+emp2.id);
// document.write("<br> Name is "+emp2.name);
// document.write("<br> Age is "+emp2.age);

// emp1.display();
// emp2.display();

// Employee object with parameter 
function Employee(id,name,age) {
    this.id = id
    this.name = name;
    this.age = age;
    this.display=function() {
        document.write("<br> Employee object function")
        document.write("<br> Id is "+this.id);
        document.write("<br> Name is "+this.name);
        document.write("<br> Age is "+this.age);
    }
}
//Employee();
    var emp1 = new Employee(101,"Steven",24);
    var emp2 = new Employee(102,"Lex",28);
// document.write("<br> Id is "+emp1.id);
// document.write("<br> Name is "+emp1.name);
// document.write("<br> Age is "+emp1.age);
// document.write("<br> Id is "+emp2.id);
// document.write("<br> Name is "+emp2.name);
// document.write("<br> Age is "+emp2.age);
emp1.display();
emp2.display();

