import React from 'react';

function EventExamples() {
  // Event handler that accepts an argument
  const sayMessage = (message) => {
    alert(message);
  }

  // Event handler that demonstrates the synthetic event
  // The 'event' object passed by React is a SyntheticEvent [cite: 123, 128]
  const handlePress = (event) => {
    console.log('Synthetic Event Object:', event);
    alert('I was clicked'); // 
  }

  return (
    <div className="component-container">
      <h2>More Event Examples</h2>
      {/* To pass an argument, we use an arrow function in the onClick handler */}
      <button onClick={() => sayMessage('welcome')}>Say Welcome</button> {/*  */}
      <button onClick={handlePress}>OnPress</button> {/*  */}
    </div>
  );
}

export default EventExamples;