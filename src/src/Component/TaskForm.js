import React, { useState } from 'react';

function TaskForm() {
    const [taskName, setTaskName] = useState('');
    const [taskDescription, setTaskDescription] = useState('');
    const [completionDate, setCompletionDate] = useState('');
    const [submitted, setSubmitted] = useState(false);

    const handleSubmit = () => {
        if (taskName && taskDescription && completionDate) {
            setSubmitted(true);
        }
    };

    return (
        <div>
            {submitted ? (
                 <div className='App'>
                    <h2>Submitted Values:</h2>
                    <p><strong>Task Name:</strong> {taskName}</p>
                    <p><strong>Task Description:</strong> {taskDescription}</p>
                    <p><strong>Expected Completion Date:</strong> {completionDate}</p>
                </div>
            ) : (
                <form>
                    <label htmlFor="taskName">Task Name:</label>
                    <input
                        type="text"
                        id="taskName"
                        value={taskName}
                        onChange={(e) => setTaskName(e.target.value)}
                        required
                    /><br /><br />

                    <label htmlFor="taskDescription">Task Description:</label><br />
                    <textarea
                        id="taskDescription"
                        value={taskDescription}
                        onChange={(e) => setTaskDescription(e.target.value)}
                        rows="4"
                        cols="50"
                        required
                    ></textarea><br /><br />

                    <label htmlFor="completionDate">Expected Completion Date:</label>
                    <input
                        type="date"
                        id="completionDate"
                        value={completionDate}
                        onChange={(e) => setCompletionDate(e.target.value)}
                        required
                    /><br /><br />

                    <button type="button" onClick={handleSubmit}>Submit</button>
                </form>
            )}
        </div>
    );
}

export default TaskForm;
