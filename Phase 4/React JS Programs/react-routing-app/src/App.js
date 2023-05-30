import {Link, Route, Routes} from 'react-router-dom'
import AboutUs from './AboutUs';
import ContactUs from './ContactUs';
import Feedback from './Feedback';
import Login from './Login';
import Home from './Home';
function App() {
  return (

    <div>
     <h2>React Routing App</h2>  
      <Link to="/aboutus">About Us</Link> |
      <Link to="/contactus">Contact Us</Link> |
      <Link to="/feedback">Feedback</Link> |
      <Link to="/login">Login</Link>
      <hr/>

      <Routes>
        <Route path='/aboutus' element={<AboutUs/>}></Route>
        <Route path='/contactus' element={<ContactUs/>}></Route>
        <Route path='/feedback' element={<Feedback/>}></Route>
        <Route path='/login' element={<Login/>}></Route>
        <Route path='/home' element={<Home/>}></Route>
      </Routes>
    </div>

  );
}

export default App;
