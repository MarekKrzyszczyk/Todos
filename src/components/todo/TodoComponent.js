import React, {Component} from "react";

class TodoComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: 1,
            description: 'Learn React',
            targetDate: new Date()
        }
    }
    render() {
        return (
        <div>Todos component{this.props.match.params.id}</div>
        )
    }
}

export default TodoComponent;