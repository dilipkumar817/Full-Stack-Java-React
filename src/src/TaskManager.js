import {useState} from 'react';

function TaskManager(){
    const[task,setTask]=useState('');
    const[storeTask,setStoreTask]=useState([]);
    const taskfunction=()=>
    {
        setStoreTask([...storeTask,task]);
        setTask('');
    }
    return(
        <div>
            <label>Add Task</label>
            <input type="text" value={task} onChange={e=>setTask(e.target.value)}/>
            <br></br>
            <button type="Button" onClick={taskfunction}>Add Task</button>
            {
                storeTask.map((tasks,index)=> <li key={index}>{tasks}</li>)
            }
        </div>
    )
}
export default TaskManager;