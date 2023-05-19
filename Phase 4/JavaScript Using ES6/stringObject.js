// literal style string object creation 
let info1 = "Welcome to JavaScript training";
// object creation using new keyword 
let info2 = new String("Welcome to JavaScript training");
document.write("<br/> "+info1);
document.write("<br/> "+info2);
document.write("<br/> "+info1.length);
document.write("<br/> "+info1.toUpperCase());
document.write("<br/> "+info1.toLowerCase());
document.write("<br/> "+info1.substring(4));
document.write("<br/> "+info1.substring(4,10));
document.write("<br/> "+info1.indexOf('e'));
document.write("<br/> "+info1.lastIndexOf('e'));
document.write("<br/> "+info1.replace("JavaScript","TypeScript"));