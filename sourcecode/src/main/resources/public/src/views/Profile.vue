<template>
  <div class="profile">
    <div class="container-fluid">

        <div class="row mb-3">
            <div class="col d-flex justify-content-center">
                <h3>{{user.user_name}}</h3>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col d-flex justify-content-center muted">
                <img v-bind:src="require('../img/profile_'+[user.user_name]+'.png')"
                alt="Profile" class="img-profile rounded-circle">
                <div>
                    <i class="fas fa-camera hovering ml-1"></i>
                </div>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col">
                <div class="list-group text-center">
                    <a href="#" class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">Friends</a>
                    <a href="#" class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">Settings</a>
                    <a href="#" class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">Notifications</a>
                    <a href="#" class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">Change password</a>
                    <a href="#" class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded">Logout</a>
                </div>
            </div>
        </div>

    </div>
  </div>
</template>

<style scoped>
.img-profile {
    height: 250px;
    width: 250px;
}
</style>

<script>
import axios from "axios";
import { url, id} from "../assets/global.js";

export default {
  data() {
      return {
          user:{},
        }
    },

    mounted () {
        this.getUserById(); 
    },

    methods: {
        getUserById(){
        axios.get(url + '/users?id='+id)
            .then((response)=>{
            // handle success
            console.log(response.data);
            this.user = response.data;
            })
            .catch((error)=>{
            // handle error
            console.log(error);
            })
        }
    },
}
</script>
