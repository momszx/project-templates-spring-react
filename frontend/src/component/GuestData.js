import React from "react";
const data =
    {
        name:"Joe Dao",
        dateOfBirth:"2000-10-08",
        age:20
    }
class GuestData extends React.Component {
    render() {
        return(
            <div>
                <div>
                    <h2>Név: {data.name}</h2>
                    <h2>Születési dátum: {data.dateOfBirth}</h2>
                    <h2>Kor: {data.age}</h2>
                </div>
            </div>
        )
    }
}
export default GuestData;