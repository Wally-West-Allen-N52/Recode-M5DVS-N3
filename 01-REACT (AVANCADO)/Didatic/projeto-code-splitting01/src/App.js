import logo from './logo.svg';
import './App.css';

import Rodape from './Rodape';
import Slogan from './Slogan';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        
        <img src={logo} className="App-logo" alt="logo" />
        
        <Slogan /> {/* Componente */}
        <Rodape /> {/* Componente */}

      </header>
    </div>
  );
}

export default App;
