
import React from 'react';

class Employee extends React.Component {
    
    constructor(props){
        super(props);
        this.state = {id:100,name:"Ajay",age:21};
    }

    render() {
        this.setState({id:101,name:"Vijay",age:24});  
        return(
            <div>
                <h2>Employee component in class style</h2>
    <p>Id is {this.state.id} Name is {this.state.name} 
                Age is {this.state.age}</p>
                <p>Designation is {this.props.designation}</p>
            </div>
        )
    }
}

export default Employee;