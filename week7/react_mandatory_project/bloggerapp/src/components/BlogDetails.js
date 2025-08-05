import React from 'react';
import { blogs } from '../data';

function BlogDetails() {
  return (
    <div className="details-card">
      <h2>Blog Details</h2>
      {/* Example of using the ternary operator for conditional rendering */}
      {blogs.length > 0 ? (
        blogs.map(blog => (
          <div key={blog.id} className="item">
            <h3>{blog.title}</h3>
            <h4>{blog.author}</h4>
            <p>{blog.content}</p>
          </div>
        ))
      ) : (
        <p>No blogs to display.</p>
      )}
    </div>
  );
}

export default BlogDetails;