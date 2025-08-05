import React from 'react';
import '../Stylesheets/mystyle.css';

const CalculateScore = ({ name, school, total, goal }) => {
  // Calculate the percentage from the total and goal marks
  const percentage = (total / goal) * 100;

  return (
    <div className="student-card">
      <h2>{name}</h2>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total Marks Obtained:</strong> {total}</p>
      <p><strong>Goal (Maximum Marks):</strong> {goal}</p>
      <p>
        <strong>Percentage Scored: </strong> 
        <span className="score">{percentage.toFixed(2)}%</span>
      </p>
    </div>
  );
};

export default CalculateScore;