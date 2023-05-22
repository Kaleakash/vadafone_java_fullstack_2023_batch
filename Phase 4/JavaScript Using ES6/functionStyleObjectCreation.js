// funtion style object creation 
function Employee() {
    this.id = 100;      // instance variable consider 
    //var id = 100; // local variable consider 
    this.name = "Ajay";
    this.age = 21;

    this.display=function() {
        document.write("<br> Employee object function")
        document.write("<br> Id is "+this.id);
        document.write("<br> Name is "+this.name);
        document.write("<br> Age is "+this.age);
    }
}
//Employee();
var emp1 = new Employee();
document.write("<br> Id is "+emp1.id);
document.write("<br> Name is "+emp1.name);
document.write("<br> Age is "+emp1.age);
emp1.display();