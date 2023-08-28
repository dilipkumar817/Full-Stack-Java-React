import React from "react";
function Goal(props) {
    const isSix = props.isSix;
    if (isSix) {
      alert('Its a Six')
    }
    else{
        alert('It is not a six')
    }
   
  }
  export default Goal;