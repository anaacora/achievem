import axios from 'axios';
import { url, id } from "./global.js";

export function getUserById() {
  axios.get(url + '/users?id='+id)
      .then((response)=>{
        // handle success
        // console.log(response.data);
        this.user = response.data;
      })
      .catch((error)=>{
        // handle error
        console.log(error);
      })
}

