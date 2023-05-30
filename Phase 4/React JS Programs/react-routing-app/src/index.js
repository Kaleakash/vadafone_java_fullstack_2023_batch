import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter} from 'react-router-dom';   // third party module 

const root = ReactDOM.createRoot(document.getElementById('root'));
// App component is child for BrowserRouter component to enable 
// Routing features. 
root.render(
            <BrowserRouter>
                    <App />
            </BrowserRouter>    
          
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
