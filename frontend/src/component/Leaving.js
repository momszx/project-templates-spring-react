import React from "react";
import ServiceTable from "./TableServices";
import ConsumeTable from "./TableConsumes";
import IdValidation from "./IdValidation";
import {Checkoutguest, Checkoutsummary} from "../action/Checkout";



class Leaving extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            id: 1,
            name: 'Gipsz Jakab',
            dateOfBirth: '1988-09-29',
            arrivalDate: '2020-11-12-12-00-00',
            departureDate: '2020-11-12-13-00-00',
            usedServices: [{
                id: '1',
                service: 'vizicsúszda',
                barCode: ''
            },
                {
                    id: '2',
                    service: '',
                    barCode: 'cocacola'
                }]
        }
    }
    idChanged = (event) => {
        console.log('Do something .....')
    }
    Checkout =(id1,id2) => {
        Checkoutsummary(id2);
        Checkoutguest(id1);
    }
    render() {
        return (
            <div>
                <IdValidation></IdValidation>

                <h1>Arriving date <span className={"alert alert-info"}>{
                    this.state.arrivalDate
                }</span></h1>
                <br/>
                <h1>Leaving date <span className={"alert alert-info"}>{
                    this.state.departureDate
                }</span></h1>
                <button onClick={this.Checkout(this.state.id,this.state.usedServices[0].id)} className={"btn btn-warning"}>Checkout</button>
                <div><ServiceTable></ServiceTable></div>
                <div><ConsumeTable></ConsumeTable></div>
            </div>
        )
    }
}

export default Leaving
