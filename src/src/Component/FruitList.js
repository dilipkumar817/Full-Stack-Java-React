import React from 'react';
const FruitList=()=>{
    const fruits =['Apple','Banana','Orange','Grapes'];
    return(
        <div>
            <h1>List of Fruits</h1>
            <ul>
                {fruits.map((fruit,index)=>(
                    <li key={index}>{fruit}</li>
                ))}
            </ul>
            </div>
    )
};
export default FruitList;