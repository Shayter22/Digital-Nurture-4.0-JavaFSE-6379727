import React from 'react';
import { books } from '../data';

function BookDetails() {
  // Using an element variable to hold the list, as suggested in the hint.
  const bookList = (
    <ul>
      {books.map((book) => (
        <div key={book.id} className="item"> {/* Using keys is essential for lists in React [cite: 31] */}
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="details-card">
      <h2>Book Details</h2>
      {bookList}
    </div>
  );
}

export default BookDetails;