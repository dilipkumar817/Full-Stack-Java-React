import React from "react";
const BlueButton=({label})=>{
    const buttonStyle={
        backgroundColor:'Blue',
        color:'white',
        padding:'10px 20px',
        borderRadius:'5px',
        cursor:'pointer',
    };
    
    return(
        <button style={buttonStyle}>{label}</button>
    );
    
};
export default BlueButton;