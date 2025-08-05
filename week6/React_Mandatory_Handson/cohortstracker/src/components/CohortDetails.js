import React from 'react';
// Import the CSS Module 
import styles from './CohortDetails.module.css';

const CohortDetails = (props) => {
  const { id, fsd, started, status, coach, trainer } = props.cohort;

  // Define a style object for the h3 element [cite: 36]
  // It sets the color to 'green' for "Ongoing" status and 'blue' otherwise [cite: 36]
  const headerStyle = {
    color: status.toLowerCase() === 'ongoing' ? 'green' : 'blue',
  };

  return (
    // Apply the 'box' class from the CSS module to the container div [cite: 35]
    <div className={styles.box}>
      {/* Apply the inline style to the h3 element */}
      <h3 style={headerStyle}>{id} - {fsd}</h3>
      <dl>
        <dt>Started On</dt>
        <dd>{started}</dd>
        <dt>Current Status</dt>
        <dd>{status}</dd>
        <dt>Coach</dt>
        <dd>{coach}</dd>
        <dt>Trainer</dt>
        <dd>{trainer}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;