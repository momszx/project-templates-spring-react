import React from "react";
import ReceptionOnlyButton from "./ReceptionOnlyButton";
class Navigation extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            employeeName: 'Gipsz Jakab',
            positionID: 'Pultos'
        }
    }
    render(){
        return(
            <div>
                <h1>Employee's name <span className={"alert alert-info"}>{
                    this.state.employeeName
                }</span></h1>
                <br/>
                <h1>Employee's rank <span className={"alert alert-info"}>{
                    this.state.positionID
                }</span></h1>
                {this.state.positionID === 'Cafetéria munkás' && (
                    <button className={"btn btn-primary"}>Cafeteria</button>
                )}
                {this.state.positionID === 'Pultos' && (
                    <button className={"btn btn-primary"}>Services</button>
                )}
                {this.state.positionID === 'Recepciós' && (
                    <ReceptionOnlyButton></ReceptionOnlyButton>
                )}

                <button className={"btn btn-warning"}>Log out</button>
            </div>
        )
    }

}
export default Navigation