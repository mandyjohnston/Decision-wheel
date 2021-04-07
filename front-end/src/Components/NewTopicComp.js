import React from 'react'; 

function NewTopicComp() {
    return (
        <div>
        <h1>Pick Your Poison</h1> 
        <h2>What do you need help choosing between?</h2>
        <label for='choice1'>Choice 1: </label>
        <input type='text' id = 'choice1' placeholder = 'Ex: Chicken Noodle Soup' />  
        <label for='choice1'>Choice 2: </label>
        <input type='text' id = 'choice1' placeholder = 'Ex: Chicken Noodle Soup' />
        {/* <Link to={'/spinner'}>
        <button type='submit' id= 'submit'>submit</button>
        </Link>      */}
        
       
    </div>

    )
} 

export default NewTopicComp;