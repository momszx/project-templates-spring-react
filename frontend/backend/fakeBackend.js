const jsonServer = require('json-server');
const httpStatus = require('http-status-codes');

let server = jsonServer.create();
let database = {};
let router = jsonServer.router(database);
let temp = jsonServer.defaults();

server.post('/login',(req,res) => {console.log(req.body);
    res.status(200).send(
        {
            username: 'user',
            password: 'pass'
        }
    );
});

server.get('/login',(req,res) => {
    const users = [
        {
            id: 1,
            employeeName: 'Gipsz Jakab',
            employeeEmail: 'gipsz@jakab.com',
            pwd: 'gipszjakab',
            positionID: 1
        },
        {
            id: 2,
            employeeName: 'Text Elek',
            employeeEmail: 'text@elek.com',
            pwd: 'textelek',
            positionID: 2
        },
        {
            id: 3,
            employeeName: 'Kis Sanyi',
            employeeEmail: 'kis@sanyi.com',
            pwd: 'kissanyi',
            positionID: 3
        }
    ];
    const {
        email,password
    } = req.query;
    let user = users.find((tmp) => {
        return tmp.employeeEmail === email && tmp.pwd === password
    });
    if(user === undefined){
        res.status(httpStatus.UNAUTHORIZED).send();
    }
    else{
        res.status(httpStatus.OK).send(user);
    }
});

server.post('/leaving',(req,res) => {console.log(req.body);
    res.status(200).send(
        {
            id: 'id'
        }
    );
});

server.get('/leaving',(req,res) => {
    const guests = [
        {
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
        },
        {
            id: 2,
            name: 'Gipsz Jakab Jr',
            dateOfBirth: '2010-09-29',
            arrivalDate: '2020-11-12-12-00-00',
            departureDate: '2020-11-12-13-00-00',
            usedServices: [{
                id: '3',
                service: 'vizicsúszda',
                barCode: ''
            },
                {
                    id: '4',
                    service: '',
                    barCode: 'cocacola'
                }]
        }
    ];
    const {
        id
    } = req.query;
    let guest = guests.find((tmp) => {
        return tmp.id === parseInt(id)
    });
    if(guest === undefined){
        res.status(httpStatus.UNAUTHORIZED).send();
    }
    else{
        res.status(httpStatus.OK).send(guest);
    }
});

server.use(temp);
server.use(router);
server.listen(8080,function (){
    console.log('Started succesfully');
});
