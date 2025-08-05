// src/App.js
import React from 'react';
import CohortDetails from './components/CohortDetails';
import './App.css';

function App() {
  // Sample data for the cohorts
  const cohorts = [
    { id: 'INTADMDF10', fsd: '.NET FSD', started: '22-Feb-2022', status: 'Scheduled', coach: 'Aathma', trainer: 'Jojo Jose' },
    { id: 'ADM21JF014', fsd: 'Java FSD', started: '10-Sep-2021', status: 'Ongoing', coach: 'Apoorv', trainer: 'Elisa Smith' },
    { id: 'CDBJF21025', fsd: 'Java FSD', started: '24-Dec-2021', status: 'Ongoing', coach: 'Aathma', trainer: 'John Doe' }
  ];

  return (
    <div className="App">
      <h1>Cohorts Details</h1>
      <div className="cohorts-container">
        {cohorts.map(c => <CohortDetails key={c.id} cohort={c} />)}
      </div>
    </div>
  );
}

export default App;