import logo from './logo.svg';
import './App.css';
import Parent from './Parent';

function App() {
  return (
    <div style={{backgroundColor:"yellow"}}>
      <h2>Component Communication</h2>
      <Parent></Parent>
      <p>App Component Area</p>
    </div>
  );
}

export default App;
