import React, { Component } from "react";
import './App.css';
import Inicial from "./components/Inicial/Inicial.js";
import Error from "./components/Error/Error.js"
import { Route, Switch } from "react-router-dom";

function App() {

	return(
		<main>
			<Switch>
			
				<Route path="/" component={Inicial} exact/>

				<Route component={Error}/>
			
			</Switch>

		</main>
	);
}

export default App;