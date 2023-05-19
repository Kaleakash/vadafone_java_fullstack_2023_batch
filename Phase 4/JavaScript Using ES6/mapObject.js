let mm = new Map();
mm.set(1,"Ajay");
mm.set(2,"Vijay");
mm.set(3,"Lex");
mm.set(4,"Neeta");
document.write(mm);
console.log(mm)
mm.set(1,"Ravi");
mm.set(5,"Vijay");
console.log(mm)
document.write("<br> names is "+mm.get(1));
document.write("<br> names is "+mm.get(100));
document.write("<br> "+mm.has(1))
document.write("<br> "+mm.has(100))
//mm.forEach((v,k)=>document.write("<br> Key "+k+" Value "+v))
mm.forEach((v,k)=>document.write("<br> value "+v+" Key "+k));
