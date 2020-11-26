import React from "react";
import ServiceViewTable from "./ServieViewTable";
import IdValidation from "./IdValidation";

class ServiceView extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            name: "Gipsz Jakab",
            dateOfBirth: '2010-09-29',
            age: '10'
        }
    }
    render() {
        return(
            <div>
                <div>
                    <IdValidation></IdValidation>
                </div>
               <div>
                   <h1>User Name <span className={"alert alert-info"}>{
                       this.state.name}</span></h1>
               </div>
                <div>
                    <h1>Date of Birth <span className={"alert alert-info"}>{
                        this.state.dateOfBirth}</span></h1>
                </div>
                <div>
                    <h1>Age <span className={"alert alert-info"}>{
                        this.state.age}</span></h1>
                </div>
                <div>
                    <ServiceViewTable></ServiceViewTable>
                </div>
            </div>
        );
    }
}
export default ServiceView;