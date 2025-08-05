import React from 'react';
import './App.css';

function App() {
  // Requirement: Create an element to display the heading of the page. [cite: 52]
  const pageTitle = "Office Space, at Affordable Range";

  // Requirement: Create a list of Object and loop through the office space item. [cite: 55]
  // This array holds the data for our office spaces.
  const officeSpaces = [
    {
      name: 'DBS',
      rent: 50000,
      address: 'Chennai',
      // Requirement: Attribute to display the image of the office space. [cite: 53]
      image: 'https://images.unsplash.com/photo-1556761175-5973dc0f32e7?w=600'
    },
    {
      name: 'WeWork',
      rent: 75000,
      address: 'Bengaluru',
      image: 'https://images.unsplash.com/photo-1521737852577-684897f092a4?w=600'
    },
    {
      name: 'Regus',
      rent: 58000,
      address: 'Mumbai',
      image: 'https://images.unsplash.com/photo-1600880292203-757bb62b4baf?w=600'
    }
  ];

  return (
    <div className="App">
      <h1>{pageTitle}</h1>
      <div className="offices-container">
        {/* Loop through the office space list using the map() method */}
        {officeSpaces.map((space, index) => {
          // Requirement: Display the color of the Rent in Red if it’s below 60000 and in Green if it’s above 60000. [cite: 56]
          // This uses a JavaScript expression and inline CSS. [cite: 39, 43]
          const rentStyle = {
            color: space.rent <= 60000 ? 'red' : 'green',
            fontWeight: 'bold'
          };

          return (
            // The key attribute is important for lists in React.
            <div key={index} className="office-card">
              <img src={space.image} alt={`${space.name} office space`} className="office-image" />
              {/* Requirement: Create an object of office to display the details like Name, Rent and Address. [cite: 54] */}
              <h2>Name: {space.name}</h2>
              <h3 style={rentStyle}>Rent: Rs. {space.rent}</h3>
              <h3>Address: {space.address}</h3>
            </div>
          );
        })}
      </div>
    </div>
  );
}

export default App;