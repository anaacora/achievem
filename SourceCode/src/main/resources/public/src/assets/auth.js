import axios from 'axios';

export function getUserId(id) {
  axios.get('http://localhost:8081/api/users/' + id)
    .then((response)=>{
      console.log(response.data);
      return response.data;
    })
    .catch((error)=>{
      console.log(error);
    })
}

