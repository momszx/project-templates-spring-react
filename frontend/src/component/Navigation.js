import React from "react";
import ReceptionOnlyButton from "./ReceptionOnlyButton";
import store from "../store/UserStore";

class Navigation extends React.Component{
    constructor(props) {
        super(props);
        this.state = {userData : {}};
        this._updateState = this._updateState.bind(this);
    }

    componentDidMount() {
        store.addChangeListener(this._updateState);
    }


    componentWillUnmount() {
        store.removeChangeListener(this._updateState);
    }

    _updateState(){
        this.setState({userData : store._user});
        console.log("state")
        console.log(this.state)
        console.log(this.state.userData.employeeName)
    }

    render(){
        return(
            <div>
                <h1>Employee's name <span className={"alert alert-info"}>{
                    this.state.userData.employeeName
                }</span></h1>
                <br/>
                <h1>Employee's rank <span className={"alert alert-info"}>{
                    this.state.userData.positionID
                }</span></h1>
                {this.state.userData.positionID === 'CAFETERIA_WORKER' && (
                    <button className={"btn btn-primary"}>Cafeteria</button>
                )}
                {this.state.userData.positionID === 'CONSOLES' && (
                    <button className={"btn btn-primary"}>Services</button>
                )}
                {this.state.userData.positionID === 'RECEPTIONIST' && (
                    <ReceptionOnlyButton></ReceptionOnlyButton>
                )}

                <button className={"btn btn-warning"}>Log out</button>
            </div>
        )
    }

}
export default Navigation