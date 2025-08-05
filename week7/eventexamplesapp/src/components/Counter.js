import React from 'react';

class Counter extends React.Component {
  constructor(props) {
    super(props);
    this.state = { count: 0 };
    // We must bind `this` to the handler to use it in the method
    this.handleIncrement = this.handleIncrement.bind(this);
  }

  // Method to increment the value
  increment() {
    this.setState(prevState => ({ count: prevState.count + 1 }));
  }

  // Method to show a message
  sayHello() {
    alert('Hello! You clicked the Increase button.');
  }

  // This handler invokes multiple methods
  handleIncrement() {
    this.increment(); // Invokes the increment method [cite: 139]
    this.sayHello();  // Invokes the hello method [cite: 140]
  }

  // Using an arrow function for the handler avoids the need for binding `this`
  handleDecrement = () => {
    this.setState(prevState => ({ count: prevState.count - 1 }));
  }

  render() {
    return (
      <div className="component-container">
        <h2>Counter</h2>
        <p>Count: {this.state.count}</p>
        <button onClick={this.handleIncrement}>Increment</button> {/*  */}
        <button onClick={this.handleDecrement}>Decrement</button> {/*  */}
      </div>
    );
  }
}

export default Counter;