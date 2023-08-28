import React from 'react';
import './App.css';
import Greet from'./Component/Greet';
  import BlueButton from './Component/BlueButton';
 import Counter from './Component/Counter';
import TaskForm from './Component/TaskForm';
 import './App.css';
 import FruitList from './Component/FruitList';

class App extends React.Component{
  render(){
  return(
    <div className='App'>
      {/* <FruitList></FruitList> */}
      {/* <h1>Button</h1> */}
      {/* <BlueButton label="Click here !"/> */}
      {/* <Counter initial={0}></Counter> */}
      <TaskForm></TaskForm>
      {/* <Greet></Greet> */}
    </div>
  );
  }
}
export default App;
