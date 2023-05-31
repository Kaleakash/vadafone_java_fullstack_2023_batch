import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { legacy_createStore as createStore,applyMiddleware} from 'redux'
import reducer from './reducer';
import { Provider } from 'react-redux';
import thunk from 'redux-thunk'     // thunk is a middleware module which help to call rest api with redux 

// added middleware as thunk into store 
const store = createStore(reducer,applyMiddleware(thunk));

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Provider store={store}>
    <App />
    </Provider>
  </React.StrictMode>
);

reportWebVitals();
