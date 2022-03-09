import React from 'react';
import ReactDOM from 'react-dom';

class Componente extends React.Component {
  render(){
    return <h1> Welcome Wallace </h1>}
}
ReactDOM.render(<Componente nome="Wallace" />,
document.getElementById('root'));