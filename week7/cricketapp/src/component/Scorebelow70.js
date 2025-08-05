import React from 'react';

// This component uses the filter() method with an arrow function to get players with scores <= 70. [cite: 12, 24]
function Scorebelow70({ players }) {
  const players70 = players.filter(player => player.score <= 70);

  return (
    <div>
      <ul>
        {players70.map((item) => (
          <li key={item.name}>Mr. {item.name} <span>{item.score}</span></li>
        ))}
      </ul>
    </div>
  );
}

export default Scorebelow70;