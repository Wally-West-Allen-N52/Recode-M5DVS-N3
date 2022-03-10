import logo from './logo.svg';
import './App.css';
import { lazy, Suspense } from 'react'; // decide o que e quando renderizar um componente

// import Rodape from './Rodape';
// import Slogan from './Slogan';

const Slogan = lazy(() => import('./Slogan')); // Renderização controlada por "Lazy"
const Rodape = lazy(() => import('.Rodape')); // Renderização controlada por "Lazy"


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />

        <Suspense fallback={ <p>Carregando...</p> }> {/* Uso do componente reserve "fallback" por encapsulamento */}
          <Slogan /> {/* Componente */}
        </Suspense>

        <Suspense fallback={ <p> Carregando... </p> }> {/* Uso do componente reserve "fallback" por encapsulamento  */}
          <Rodape /> {/* Componente */}
        </Suspense>

      </header>
    </div>
  );
}

export default App;
