import React from 'react';

class Posts extends React.Component {
  // Initialize state with a new 'currentPage' property
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null,
      isLoaded: false,
      currentPage: 1,
    };
    // Define how many posts to display per page
    this.postsPerPage = 10;
  }

  // Method to handle errors from child components (no change here).
  componentDidCatch(error, info) {
    this.setState({ error });
    alert("An error has occurred in a child component: " + error.message);
    console.error("Component Did Catch: ", info);
  }

  // Method to fetch post data from the API (no change here).
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(res => res.json())
      .then(
        (result) => {
          this.setState({
            isLoaded: true,
            posts: result
          });
        },
        (error) => {
          this.setState({
            isLoaded: true,
            error
          });
        }
      );
  }

  // Call loadPosts() after the component mounts (no change here).
  componentDidMount() {
    this.loadPosts();
  }

  // New handler for the 'Next Page' button
  handleNextPage = () => {
    this.setState(prevState => ({
      currentPage: prevState.currentPage + 1,
    }));
  };

  // New handler for the 'Previous Page' button
  handlePrevPage = () => {
    this.setState(prevState => ({
      currentPage: prevState.currentPage - 1,
    }));
  };

  // The render method is updated with pagination logic.
  render() {
    const { error, isLoaded, posts, currentPage } = this.state;

    if (error) {
      return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
      return <div>Loading posts...</div>;
    } else {
      // --- Pagination Logic ---
      const indexOfLastPost = currentPage * this.postsPerPage;
      const indexOfFirstPost = indexOfLastPost - this.postsPerPage;
      const currentPosts = posts.slice(indexOfFirstPost, indexOfLastPost);
      const totalPages = Math.ceil(posts.length / this.postsPerPage);

      return (
        <div style={{ width: '80%', margin: 'auto', textAlign: 'left' }}>
          <h1>Blog Posts</h1>
          <p>Displaying page {currentPage} of {totalPages}</p>
          <hr />
          {/* Map over the posts for the current page only */}
          {currentPosts.map(post => (
            <article key={post.id} style={{ borderBottom: '1px solid #eee', marginBottom: '20px', paddingBottom: '20px' }}>
              <h2 style={{ fontSize: '1.5em' }}>{post.title}</h2>
              <p>{post.body}</p>
            </article>
          ))}
          <hr />
          {/* --- Pagination Controls --- */}
          <div style={{ textAlign: 'center', margin: '20px 0' }}>
            <button onClick={this.handlePrevPage} disabled={currentPage === 1}>
              Previous Page
            </button>
            <span style={{ margin: '0 15px', fontWeight: 'bold' }}>
              Page {currentPage}
            </span>
            <button onClick={this.handleNextPage} disabled={currentPage === totalPages}>
              Next Page
            </button>
          </div>
        </div>
      );
    }
  }
}

export default Posts;