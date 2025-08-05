import React from 'react';

function UserGreeting(props) {
  // This page is displayed for a logged-in user [cite: 48]
  return <h1>Welcome back</h1>;
}

function GuestGreeting(props) {
  // This page is displayed for a guest user [cite: 49]
  return <h1>Please sign up.</h1>;
}

function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

export default Greeting;