import {Link, Route, Routes} from 'react-router-dom'
import AboutUs from './AboutUs';
import ContactUs from './ContactUs';
import Feedback from './Feedback';
function App() {
  return (

    <div>
     <h2>React Routing App</h2>  
      <Link to="/aboutus">About Us</Link> |
      <Link to="/contactus">Contact Us</Link> |
      <Link to="/feedback">Feedback</Link>

      <hr/>

      <Routes>
        <Route path='/aboutus' element={<AboutUs/>}></Route>
        <Route path='/contactus' element={<ContactUs/>}></Route>
        <Route path='/feedback' element={<Feedback/>}></Route>
      </Routes>
    </div>

  );
}

export default App;
