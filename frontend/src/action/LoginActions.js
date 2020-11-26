import axios from 'axios';
import dispatcher from '../dispatcher/Dispatcher';
import * as actionConstants from '../dispatcher/LoginActionConstans'

export const Login = ({email,password}) =>{
    axios.post('/login',
        {
            email : email,
            password : password
        })
        .then((resp) => {
            const {id, employeeName, employeeEmail, pwd,positionID} = resp.data;
            console.log(resp)
            dispatcher.dispatch({
                command : actionConstants.loggedIn,
                payload : { id, employeeName, employeeEmail, pwd, positionID}
            });
        })
        .catch((error) => {
            console.log(error);
            dispatcher.dispatch({
                action: actionConstants.showError,
                //payload : `${error.response.status}-${error.response.statusText}: ${error.response.data.message}`
                payload : null
            })
        })
}