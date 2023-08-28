import './Counter.css';
import { useState } from 'react';
function Counter ({initial}) {
    const [count,setCount]=useState(initial);
    const Increment=()=>{
        setCount(count+1)
    };
    const Decrement=()=>{
        if(count>0){
        setCount(count-1)
    }
};
        return (
            <div className='C'>
                <label id='L'>Counter:    {count}</label>
                <br></br>
                <br></br>
                <button id="I" type="button" onClick={Increment}>Increment</button>
                <button id="D" type="button" onClick={Decrement}>Decrement</button>
            </div>
        )
    }

export default Counter;