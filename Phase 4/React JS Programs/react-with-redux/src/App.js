import logo from './logo.svg';
import './App.css';
import FirstComponent from './FirstComponent';
import SecondComponent from './SecondComponent';
import Increment from './Increment';
import Decrement from './Decrement';
import DynamicIncrement from './DynamicIncrement';
import DynamicDecrement from './DynamicDecrement';

function App() {
  return (
    <div>
     <h2>React with Redux Concept</h2>
     <FirstComponent></FirstComponent>
     <SecondComponent></SecondComponent>
     <Increment></Increment>
     <Decrement></Decrement>
     <DynamicIncrement></DynamicIncrement>
     <DynamicDecrement></DynamicDecrement>
    </div>
  );
}

export default App;
