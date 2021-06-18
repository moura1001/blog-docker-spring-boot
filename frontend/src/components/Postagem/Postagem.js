import React, { Component } from "react";
import axios from "axios";
import List from '@material-ui/core/List';
import ListItem from '@material-ui/core/ListItem';
import ListItemText from '@material-ui/core/ListItemText';

class Postagem extends Component {
  state = {
    postagem: [],
    comentarios: []
  };

  async componentDidMount() {
    const [resultado1, resultado2] = await Promise.all([
      axios
        .get(`/Postagens/${this.props.match.params.idPostagem}`),

      axios
        .get(`/Comentarios/${this.props.match.params.idPostagem}`)
    ]);

    this.setState({
      postagem: resultado1.data,
      comentarios: resultado2.data
    });
  }

  render() {
    return (
      <List>
        <ListItem
          key={"cabecalho"}
        >
          <ListItemText
            primary={this.state.postagem.titulo}
            secondary={this.state.postagem.autor}
          />
        </ListItem>
        <ListItem
          key={"conteudo"}
        >
          <ListItemText
            primary={this.state.postagem.conteudo}
          />
        </ListItem>
        {this.state.comentarios.map(comentario => (
          <ListItem
            key={comentario.id}
          >
            <ListItemText
              primary={comentario.conteudo}
              secondary={comentario.autor}
            />
          </ListItem>
        ))}
      </List>
    );
  }
}

export default Postagem;
