import axios from 'axios';

export function getUserId(id) {

  axios.get('/api/users/'+id)
    .then((response)=>{
      console.log(response.data);
      return response.data;
    })
    .catch((error)=>{
      console.log(error);
    })

  // alert("hi Ana+Christian" + id)
}

