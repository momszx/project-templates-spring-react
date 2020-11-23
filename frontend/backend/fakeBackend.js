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

server.post('/guest',(req,res) => {console.log(req.body);
    res.status(200).send(
        {
            id: 'id',
            name: 'name',
            dateOfBirth: 'dateOfBirth',
            arrivalDate: 'arrivalDate'
        }
    );
});

server.get('/guest',(req,res) => {
    const guests = [
        {
            id: 1,
            name: 'Gipsz Jakab',
            dateOfBirth: '1988-09-29',
            arrivalDate: '2020-11-12-12-00-00'
        },
        {
            id: 2,
            name: 'Gipsz Jakab Jr',
            dateOfBirth: '2010-09-29',
            arrivalDate: '2020-11-12-12-00-00'
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

server.get('/position',(req,res) => {
    const positions = [
        {
            id: 1,
            name: 'Recepciós'
        },
        {
            id: 2,
            name: 'Cafetéria munkás'
        },
        {
            id: 3,
            name: 'Pultos'
        }
    ];
    const {
        id
    } = req.query;
    let position = positions.find((tmp) => {
        return tmp.id === parseInt(id)
    });
    if(position === undefined){
        res.status(httpStatus.UNAUTHORIZED).send();
    }
    else{
        res.status(httpStatus.OK).send(position);
    }
});

server.get('/service',(req,res) => {
    const services = [
        {
            id: 1,
            name: 'Termál medence',
            price: 1000
        },
        {
            id: 2,
            name: 'Hullámmedence',
            price: 2000
        },
        {
            id: 3,
            name: 'Szauna',
            price: 3000
        }
    ];
    const {
        id
    } = req.query;
    let service = services.find((tmp) => {
        return tmp.id === parseInt(id)
    });
    if(service === undefined){
        res.status(httpStatus.UNAUTHORIZED).send();
    }
    else{
        res.status(httpStatus.OK).send(service);
    }
});

server.get('/product',(req,res) => {
    const products = [
        {
            id: 1,
            name: 'Milka csoki',
            price: 1000
        },
        {
            id: 2,
            name: 'Chips',
            price: 2000
        },
        {
            id: 3,
            name: 'Sör',
            price: 3000
        }
    ];
    const {
        id
    } = req.query;
    let product = products.find((tmp) => {
        return tmp.id === parseInt(id)
    });
    if(product === undefined){
        res.status(httpStatus.UNAUTHORIZED).send();
    }
    else{
        res.status(httpStatus.OK).send(product);
    }
});

server.use(temp);
server.use(router);
server.listen(8080,function (){
    console.log('Started succesfully');
});
