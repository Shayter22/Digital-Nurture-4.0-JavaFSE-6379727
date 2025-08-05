import React from 'react';
import './App.css';
import Home from './components/home';
import About from './components/about';
import Contact from './components/contact';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Student Management Portal</h1>
        <Home />
        <About />
        <Contact />
      </header>
    </div>
  );
}

export default App;