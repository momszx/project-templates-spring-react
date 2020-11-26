import {EventEmitter} from 'events'
import dispatcher from "../dispatcher/Dispatcher";
import {refresh} from "../dispatcher/ComplexNumberActionConstants";

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
    if(action !== refresh ) return;
    store._complexNumbers = payload;
    store.emitChange();
})