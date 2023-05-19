let ss = new Set();
ss.add(10);
ss.add(20);
ss.add(30);
ss.add(40);
ss.add(50);
ss.add(10);
document.write(ss);
console.log(ss);
document.write("<br/>")
ss.forEach(v=>document.write(" "+v));
document.write("<br/> "+ss.has(20))
document.write("<br/> "+ss.has(200))
document.write("<br/> "+ss.size)
document.write("<br/> "+ss.delete(20))
document.write("<br/> "+ss.delete(200))
document.write("<br/> "+ss.has(20))
