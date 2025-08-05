import React from 'react';

// Component to display Odd indexed players using destructuring. [cite: 13, 26]
function OddPlayers({ players }) {
  const [, first, , third, , fifth] = players;
  return (
    <div>
      <h3>Odd Players</h3>
      <ul>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </ul>
    </div>
  );
}

// Component to display Even indexed players using destructuring. [cite: 13, 26]
function EvenPlayers({ players }) {
  const [ , , second, , fourth, , sixth] = players;
  return (
    <div>
      <h3>Even Players</h3>
      <ul>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
      </ul>
    </div>
  );
}

// This component handles the logic for Indian Players.
function IndianPlayers() {
  // Declare two arrays of players. [cite: 27]
  const T20Players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
  // Merge the two arrays using the spread operator (...). [cite: 27]
  const IndianPlayersList = [...T20Players, ...RanjiTrophyPlayers];

  const destructuringTeam = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvraj5', 'Raina6'];

  return (
    <div>
      <h1>Indian Team</h1>
      <OddPlayers players={destructuringTeam} />
      <hr />
      <EvenPlayers players={destructuringTeam} />
      <hr />
      <h1>List of Indian Players Merged:</h1>
      <ul>
        {IndianPlayersList.map((player) => (
          <li key={player}>Mr. {player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;