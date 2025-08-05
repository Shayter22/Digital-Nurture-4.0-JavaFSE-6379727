import React from 'react';
import './App.css';
import Counter from './components/Counter';
import EventExamples from './components/EventExamples';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  return (
    <div className="App">
      <h1>React Event Handling Examples</h1>
      <Counter />
      <EventExamples />
      <CurrencyConvertor />
    </div>
  );
}

export default App;