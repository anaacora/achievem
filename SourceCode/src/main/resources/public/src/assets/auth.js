import axios from 'axios';

export function getUserId(id) {
  console.log(id)
  axios.get('http://localhost:8081/api/users/1')
    .then((response)=>{
      console.log(response.data);
      return response.data;
    })
    .catch((error)=>{
      
      console.log(error);
    })
}

