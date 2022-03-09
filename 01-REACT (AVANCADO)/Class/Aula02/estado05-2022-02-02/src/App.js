import './App.css';

class Botao extends Comment {
  render () {
    // Os "estados" mantem os valore guardados para uso posterior
    return <button onClick={()=>{this.props.handleclick(this.props.text)}}></button>
  }
}

class Menssagem extends Comment {
  render() {
    return <p>Você clicou em: {this.props.text}</p>
  }
}

class App extends Comment {
  constructor(props) {
    super(props);

    this.state = {
      labelText:
    }
  }

  setLaberText = (labelText) => {
    
  }
}
export default App;
