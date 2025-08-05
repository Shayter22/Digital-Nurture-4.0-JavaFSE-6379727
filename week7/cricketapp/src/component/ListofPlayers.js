import React from 'react';

// This component uses the map() method to display a list of all players. [cite: 11, 23]
function ListofPlayers({ players }) {
  return (
    <div>
      <ul>
        {players.map((item) => (
          <li key={item.name}>Mr. {item.name} <span>{item.score}</span></li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;