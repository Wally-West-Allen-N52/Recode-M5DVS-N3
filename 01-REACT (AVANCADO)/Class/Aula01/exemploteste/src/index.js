import React from 'react';
import ReactDOM from 'react-dom'; // Manipulação do DOM
import App from './App'; // Pede para importar a função "App" que está no "App.js" 

ReactDOM.render(
    <App />,
  document.getElementById('root') // Renderiza "App.js" no root do "index.html"
);
