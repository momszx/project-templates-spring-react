import axios from 'axios';
import dispatcher from '../dispatcher/Dispatcher';
import * as actionConstants from '../dispatcher/LoginActionConstans'

export const Checkoutsummary= ({id}) =>
    axios.delete('/Summary/',
        {
            id: id
        })
        .then((resp) => {
            console.log(resp)
        })
        .catch((error) => {
            console.log(error);
            dispatcher.dispatch({
                action: actionConstants.showError,
                //payload : `${error.response.status}-${error.response.statusText}: ${error.response.data.message}`
                payload : null
            })
        })
    export const Checkoutguest= ({id}) =>
    axios.delete('/Guest/',
        {
            id: id
        })
        .then((resp) => {
            console.log(resp)
        })
        .catch((error) => {
            console.log(error);
            dispatcher.dispatch({
                action: actionConstants.showError,
                //payload : `${error.response.status}-${error.response.statusText}: ${error.response.data.message}`
                payload : null
            })
        })