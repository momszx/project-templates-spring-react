import React from 'react';
import './App.scss';
import ComplexNumberRecordingForm from "./component/ComplexNumberRecordingForm";
import ComplexNumberList from "./component/ComplexNumberList";
import Login from "./component/Login";
import AdminView from "./component/AdminView";
import IdSearch from "./component/IdSearch";
import GuestData from "./component/GuestData";

function App() {
  return (
    <div className={["App","container"]}>
        <div className={["card", "mw-30"]}>
                <div className="card-body">
                    <Login></Login>
                </div>
            <AdminView/>
            <GuestData/>
        </div>
    </div>
  );
}

export default App;
