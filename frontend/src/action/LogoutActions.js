import axios from 'axios';
import dispatcher from '../dispatcher/Dispatcher';
import * as actionConstants from '../dispatcher/LoginActionConstans'
import store from "../store/UserStore";



export const logout = () => {
   store._user= null;
};