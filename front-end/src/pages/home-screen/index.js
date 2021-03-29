import React from 'react';
import { Link } from 'react-router-dom';
import style from './style.module.scss';

const HomeScreen =() => {
    return (
        <div>
            <h1 className={style.homeTitle}>Pick Your Poison</h1> 
            <h2>What do you need help choosing between?</h2>
            <label for='choice1'>Choice 1: </label>
            <input type='text' id = 'choice1' placeholder = 'Ex: Chicken Noodle Soup' />  
            <label for='choice1'>Choice 2: </label>
            <input type='text' id = 'choice1' placeholder = 'Ex: Chicken Noodle Soup' />
            <Link to={'/spinner'}>
            <button type='submit' id= 'submit'>submit</button>
            </Link>
            
           
        </div>
    )
} 

export default HomeScreen;
