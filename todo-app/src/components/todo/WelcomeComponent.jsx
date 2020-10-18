import React, {Component} from "react";
import {Link} from "react-router-dom";

class WelcomeComponent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            welcomeMessage: '',
            errorMessage: ''
        };
    }

    render() {
        return (
            <>
                <h1>Welcome!</h1>
                <div className="container">
                    Welcome {this.props.match.params.name}. You can manage your todos <Link to="/todos">here</Link>.
                </div>
                <div className="container">
                    Click here to get a customize welcome message.
                    <button onClick={this.retrieveWelcomeMessage} className="btn btn-success">Get welcome
                        message</button>
                </div>
            </>
        );
    }
}

export default WelcomeComponent;