import React from 'react';
import ReactDOM from 'react-dom';

class Componente extends React.Component {
  render(){
    return <h1> Welcome {this.props.nome}</h1>} // Uso do props
}
ReactDOM.render(<Componente nome="Wallace" />,
document.getElementById('root'));