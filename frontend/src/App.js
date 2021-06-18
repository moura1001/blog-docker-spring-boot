import React, { Component } from "react";
import './App.css';
import Inicial from "./components/Inicial/Inicial.js";
import Error from "./components/Error/Error.js";
import Postagem from "./components/Postagem/Postagem.js";
import { Route, Switch } from "react-router-dom";

function App() {

	return(
		<main>
			<Switch>
			
				<Route path="/" component={Inicial} exact/>

				<Route path="/DetalhesPostagem/:idPostagem" component={Postagem}/>
				
				<Route component={Error}/>
			
			</Switch>

		</main>
	);
}

export default App;