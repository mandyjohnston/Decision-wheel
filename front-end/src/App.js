import React from 'react';
import {BrowserRouter, Route, Switch } from "react-router-dom";

import Header from "./components/header" 
import HomeScreen from './pages/home-screen';
import SpinnerScreen from './pages/spinner-screen';

const App = () => { 

  const autoChoices = [
    {
      name: 'Restaruant options', 
      choiceId: 0,
      slug: 'dinner-options',
      options: ['Hola Tacos', 'Astoria', 'Go Buddha', 'Humble']
    }, 
    {
      name: 'TV options', 
      choiceId: 1,
      slug: 'tv-options',
      options: ['New Girl', 'Reno 911', 'The Office', 'Schitts Creek']
    }

 ]



return ( 
    <div> 
      <BrowserRouter>
      <Header />
      <Switch>
        <Route exact path = '/'> 
          <HomeScreen autoChoices={autoChoices} />
        </Route>
        <Route exact path = '/spinner' component={SpinnerScreen} />
      </Switch>
      </BrowserRouter>
    </div>

  );
}

export default App;
