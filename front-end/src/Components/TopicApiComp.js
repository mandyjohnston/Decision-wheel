import React from 'react'; 


export default class TopicApiComp extends React.Component {
    
    state = {
        loading: true,
        topic: null,
    }

    async componentDidMount() {
        const url= "http://localhost:8080/topics"; 
        const response = await fetch(url);
        const data = await response.json(); 
        this.setState({topic: data[0,1], loading: false});
        console.log(data);

    }
    
    
    render() {
        return (
            <div>
                {
                this.state.loading || !this.state.topic ? (
                    <div> loading...</div>
                ): 
                (
                    <div>
                        <div>
                            <h3>{this.state.topic.name}</h3> 
                            <p>{this.state.topic.choice1}</p>
                            <p>{this.state.topic.choice2}</p>
                            <p>{this.state.topic.choice3}</p>
                            <p>{this.state.topic.choice4}</p>
                        </div>
                        <div>
                            <h3>{this.state.topic.name}</h3> 
                            <p>{this.state.topic.choice1}</p>
                            <p>{this.state.topic.choice2}</p>
                            <p>{this.state.topic.choice3}</p>
                            <p>{this.state.topic.choice4}</p>
                        </div>
                    </div>
                )
                }
            </div> 
        )
    }
}