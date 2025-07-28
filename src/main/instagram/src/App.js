import React, {Component} from 'react';
import {BrowserRouter,Routes,Route} from "react-router-dom";
import Header from './header'
import Feed from './pages/Feed'
import Login from './pages/User';




/*function App() {
    return (`
        <div>
            <Container>
                <Route path="/" exact{true} Component={Home}></Route>
                <Route path="/login" exact{true} Component={Login}></Route>
                <Route path="/feed" exact{true} Component={Feed}></Route>
            </Container>
        </div>
    );
}*/

const App = () => {
    return(
        <div>
            <Feed/>
            <Login/>
        </div>
    );
}
export default App
