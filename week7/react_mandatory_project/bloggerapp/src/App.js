import React from 'react';
import './App.css';
import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';

class App extends React.Component {
  // We use state to control which view is active
  state = {
    activeView: 'all', // can be 'all', 'courses', 'books', or 'blogs'
  };

  // This function uses a switch statement to conditionally render components
  renderContent() {
    const { activeView } = this.state;

    switch (activeView) {
      case 'courses':
        return <CourseDetails />;
      case 'books':
        return <BookDetails />;
      case 'blogs':
        return <BlogDetails />;
      default:
        // This view renders multiple components [cite: 29]
        return (
          <div className="container">
            <CourseDetails />
            <BookDetails />
            <BlogDetails />
          </div>
        );
    }
  }

  render() {
    return (
      <div className="App">
        <nav className="controls">
          <h3>Conditional Rendering Examples</h3>
          <button onClick={() => this.setState({ activeView: 'all' })}>Show All</button>
          <button onClick={() => this.setState({ activeView: 'courses' })}>Show Only Courses</button>
          <button onClick={() => this.setState({ activeView: 'books' })}>Show Only Books</button>
          <button onClick={() => this.setState({ activeView: 'blogs' })}>Show Only Blogs</button>
        </nav>
        <hr />
        {this.renderContent()}
      </div>
    );
  }
}

export default App;