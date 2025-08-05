import React from 'react';
import './App.css';
import ListofPlayers from './component/ListofPlayers';
import Scorebelow70 from './component/Scorebelow70';
import IndianPlayers from './component/IndianPlayers';

function App() {
  // Flag to switch between the two views. Set to true or false. 
  const flag = true;

  // An array of 11 players with names and scores. [cite: 23]
  const players = [
    { name: 'Jack', score: 50 },
    { name: 'Michael', score: 70 },
    { name: 'John', score: 40 },
    { name: 'Ann', score: 61 },
    { name: 'Elisabeth', score: 61 },
    { name: 'Sachin', score: 95 },
    { name: 'Dhoni', score: 100 },
    { name: 'Virat', score: 84 },
    { name: 'Jadeja', score: 64 },
    { name: 'Raina', score: 75 },
    { name: 'Rohit', score: 80 }
  ];

  if (flag) {
    return (
      <div className="App">
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div className="App">
        <IndianPlayers />
      </div>
    );
  }
}

export default App;