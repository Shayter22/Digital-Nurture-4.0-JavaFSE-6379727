import React from 'react';

class CurrencyConvertor extends React.Component {
  constructor(props) {
    super(props);
    this.state = { rupees: 0, euros: 0 };
    // As of early August 2025, the approximate conversion rate
    this.conversionRate = 0.011;
  }

  handleRupeeChange = (event) => {
    this.setState({ rupees: event.target.value });
  }

  // This event handler is invoked on the form's submission
  handleSubmit = (event) => {
    event.preventDefault(); // Prevents the page from reloading on form submission
    const convertedEuros = this.state.rupees * this.conversionRate;
    this.setState({ euros: convertedEuros.toFixed(2) });
  }

  render() {
    return (
      <div className="component-container">
        <h2>Currency Convertor</h2>
        {/* The button click is handled by the form's onSubmit event  */}
        <form onSubmit={this.handleSubmit}>
          <label>
            Indian Rupees (INR):
            <input type="number" value={this.state.rupees} onChange={this.handleRupeeChange} min="0" />
          </label>
          <button type="submit">Convert</button>
        </form>
        <h3>Euros (EUR): €{this.state.euros}</h3>
      </div>
    );
  }
}

export default CurrencyConvertor;