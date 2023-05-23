// import logo from './logo.svg';
// import './App.css';
// function Header() {
//   return <h2>This is a header component</h2>
// }
// function Footer() {
//   return <h2>This is footer component</h2>
// }
// function Employee() {
//   return(
//     <div>
//       <h2>Employee Details</h2>
//       <p>Id is 100, Name is Ajay Salary is 120000</p>
//     </div>
//   )
// }
// function Customer(){
//   let id=100;         // local variable consider 
//   let name="Ajay";
//   let age = 21;
//   return(
//     <div>
//       <h2>Customer Info</h2>
//       <p>Id is {id} Name is {name} Age is {age}</p>
//     </div>
//   )
// }
// function App() {

//   return(
//     <div>
//       <Header></Header>
//       <h2>Welcome to React JS</h2>
//       <Employee></Employee>
//       <Customer></Customer>
//       <Footer></Footer>
//     </div>
//   )
// }

import Header from './Header'
import Employee from './Employee';
import Customer from './Customer';
import FunctionStyleEvent from './FunctionStyleEvent';
function App() {
// This is normal javascript comments. 
  return(
    <div>
      {/* <Header></Header>
      <h2>Main or Parent Component</h2>
  <Employee designation="Developer"></Employee>
      <Customer designation="Tester"></Customer> */}
      <FunctionStyleEvent></FunctionStyleEvent>
    </div>
  )
}
export default App;














