import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import HomePage from "./Pages/HomePage";
import SpinnerPage from "./Pages/SpinnerPage";

function App() {
  return (
    <div> 
      <BrowserRouter>
      <Switch>

        <Route exact path = '/' component={HomePage} />
        <Route exact path = '/spinner' component={SpinnerPage} />

      </Switch>      
      </BrowserRouter>
    </div>  

  );
}

export default App;
