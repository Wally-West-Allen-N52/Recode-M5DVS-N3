import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

ReactDOM.hydrate( // substituição ReactDOM.render por ReactDOM.hydrante
    <App />,
  document.getElementById('root')
);