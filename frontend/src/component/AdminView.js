import React from "react";
import Login from "./Login";
class AdminView extends React.Component {
    constructor(props) {
        super(props);
        this.state = {value: ''};
    }
    render() {
        return (
            <form onSubmit={this.handleSubmit}>
                <label>
                    Name:
                    <input type="text" value={this.state.value} onChange={this.handleChange} />
                </label>
                <input type="submit" value="Submit" />
            </form>
        );
}}
export default AdminView;