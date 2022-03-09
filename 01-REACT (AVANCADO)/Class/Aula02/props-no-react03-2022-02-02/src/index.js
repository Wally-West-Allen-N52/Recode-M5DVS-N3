import React from 'react';
import ReactDOM from 'react-dom';

class Componente extends React.Component {
  render() {
    return (
      <div>
        <h1> Bem vindo <br></br>
          {this.props.funcionario.funcao}<br></br>
          {this.props.funcionario.nome}</h1>
      </div>
    )
  }
}
var dadosFuncionario = {
  funcao: "Programador chefe",
  nome: "Wallace lindão"
};
ReactDOM.render(<Componente funcionario={dadosFuncionario} />, document.getElementById('root'));