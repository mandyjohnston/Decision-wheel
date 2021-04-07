import React from 'react'; 
import HeaderComp from "../Components/HeaderComp"; 
import NewTopicComp from "../Components/NewTopicComp"; 
import ExistingTopicComp from "../Components/ExistingTopicComp";


const HomePage = () => {

    return (
        <div>
        <HeaderComp />
        <NewTopicComp />
        <ExistingTopicComp />
        </div>
    )
}

export default HomePage; 