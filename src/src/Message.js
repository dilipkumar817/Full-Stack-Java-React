import React from "react";

class Message extends React.Component{
    constructor(){
        super()
        this.state={
            message: 'Welcome to events'
        }
        // this.changeMessage=this.changeMessage.bind(this)
    }
    changeMessage(){
       this.setState({
        message: 'Thanks for listening'
       })
    }

    render(){
        return(
            <div>
                <h1>{this.state.message}</h1>
                {/* <button onClick={() => this.changeMessage()}>Click me</button> */}
                 <button onClick={this.changeMessage.bind(this)}> Click me</button>
                {/* <button onClick={this.changeMessage}>Click here</button> */}
            </div>
        )
    }
}
export default Message;