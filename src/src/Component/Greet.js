import React, { Component } from 'react';
// *** USING FUNCTIONAL COMPONENT ***
// function Greet(){
//     return(
//         <div>
//             <h1>Hello Dilip</h1>
//         </div>
//     )
// }
// export default Greet;

// *** USING ARROW ***
// export const Greet = () => <h1>Hello Dilip</h1>;

// *** USING CLASS COMPONENT ***
// class Greet extends React.Component{
//     render(){
//         return(
//             <div>
//                 <h1>Hello Dilip</h1>
//             </div>
//         )
//     }
// }
// export default Greet;
// ** USING PROPS
// const Greet=(props)=>{
//     console.log(props)
//     return <h1> Hello {props.name} a.k.a {props.hero}</h1>
// }
// *** USING STATE ***
class Greet extends Component{
    constructor(){
        super()
        this.state={
            Greet: 'Hello'
        }
        // this.changeGreet=this.changeGreet.bind(this)
    }
    changeGreet(){
        this.setState({
         Greet: 'Welcome'
    })
    }
    render(){
        return(
            <div>
               <h1>{this.state.Greet}</h1>
               <button onClick={()=>this.changeGreet()}>Click here</button>
               {/* <button onClick={this.changeGreet.bind(this)}> Click me</button> */}
               {/* <button onClick={this.changeGreet}>Click here</button> */}
            </div>
        )
    }

// class Greet extends Component{
//     constructor(){
//         super()
//         this.state={
//             count:0
//         }
//     }
//     changeGreet(){
//         this.setState({
//             count:this.state.count+1
//         })
//     }
//     Decrement(){
//         this.setState({
//             count:this.state.count-1
//         })
//     }
//     reset(){
//         this.setState({
//             count:0
//         })
//         }
//     render(){
//         return(
//             <div>
//                 <h1>{this.state.count}</h1>
//                 <button onClick={()=>this.changeGreet()}>Increment</button>
//                 <button onClick={()=>this.Decrement()}>Decrement</button>
//                 <button onClick={()=>this.reset()}>reset</button>
//             </div>
//         )
//     }
}
export default Greet;