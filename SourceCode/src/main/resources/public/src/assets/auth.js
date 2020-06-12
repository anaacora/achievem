import axios from 'axios';

export function getUserId(id) {

  axios.get('http://localhost:8080/api/users/'+id,{
    headers: {
      'Access-Control-Allow-Origin': '*',
            'Access-Control-Allow-Methods': 'POST, GET, PUT, OPTIONS, DELETE',
            'Access-Control-Allow-Headers': 'Access-Control-Allow-Methods, Access-Control-Allow-Origin, Origin, Accept, Content-Type',
            'Content-Type': 'application/json',
            'Accept': 'application/json'
    }
  }
  )
    .then((response)=>{
      console.log(response.data);
      return response.data;
    })
    .catch((error)=>{
      console.log(error);
    })

    axios.get('https://weng-message-board.herokuapp.com/api/messages')
    .then( (res) => {
      console.log(res.data);
    })
    .catch( (error) => {
        console.log(error);
    })

  // alert("hi Ana+Christian" + id)

  // this.$http.get('http://localhost:8080/api/v1/users',
  //     {
  //         headers: {
  //           'Access-Control-Allow-Origin': '*',
  //           'Access-Control-Allow-Methods': 'POST, GET, PUT, OPTIONS, DELETE',
  //           'Access-Control-Allow-Headers': 'Access-Control-Allow-Methods, Access-Control-Allow-Origin, Origin, Accept, Content-Type',
  //           'Content-Type': 'application/json',
  //           'Accept': 'application/json'
  //         }
  //       }
  //       ).then(function (response) {
  //         // Success
  //       }, function (response) {
  //         // Error
  //       })
}

