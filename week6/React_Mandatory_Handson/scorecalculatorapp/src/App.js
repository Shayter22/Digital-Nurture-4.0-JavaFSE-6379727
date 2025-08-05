import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Student Score Dashboard</h1>
        <CalculateScore
          name="Anjali Sharma"
          school="Delhi Public School"
          total={480}
          goal={500}
        />
        <CalculateScore
          name="Vikram Singh"
          school="Kendriya Vidyalaya"
          total={425}
          goal={500}
        />
      </header>
    </div>
  );
}

export default App;