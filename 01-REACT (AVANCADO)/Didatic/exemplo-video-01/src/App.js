import logo from './logo.svg';
import './App.css';
import { lazy, Suspense } from 'react';

// import Testo from './Testo';
// import Link from './Link';

const Testo = lazy(() => import('./Testo'));
const Link = lazy(() => import('./Link'));

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />

        <Suspense fallback={ <p>Carregando</p> }>
          <Testo />
        </Suspense>

        <Suspense fallback={ <p>Carregando</p> }>
          <Link />
        </Suspense>

      </header>
    </div>
  );
}

export default App;

