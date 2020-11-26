import {EventEmitter} from 'events'
import dispatcher from "../dispatcher/Dispatcher";
import * as actionConstants from '../dispatcher/LoginActionConstans'

class UserStore extends  EventEmitter {
    _user = null;

    emitChange(){
        this.emit('Change');
    }

    addChangeListener(callback){
        this.addListener('Change',callback);
    }

    removeChangeListener(callback){
        this.removeListener('Change',callback);
    }
}

const store = new UserStore();
export default store;

dispatcher.register(({action,payload})=>{
    if(action !== actionConstants.loggedIn) return;
    store._user = payload;
    console.log(store._user)
    store.emitChange();
})