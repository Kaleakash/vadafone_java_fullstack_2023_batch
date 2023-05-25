import logo from './logo.svg';
import './App.css';
import ProductOperation from './ProductOperation';
import Students from './Students';

function App() {
  return (
    <div>
     <h2 style={{color:"red",backgroundColor:"yellow"}}>Product Management System</h2>
     {/* <Students></Students> */}
     <ProductOperation></ProductOperation>
    </div>
  );
}

export default App;
