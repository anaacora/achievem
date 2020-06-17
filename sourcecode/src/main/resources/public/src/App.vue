<template>
  <div id="app">
    <nav class="navbar navbar-expand-lg navbar-light mb-4">
      <button
        class="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarNav"
        aria-controls="navbarNav"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <router-link class="nav-link" to="/">Dashboard</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link" to="/gamification">Your points</router-link>
          </li>
        </ul>
        <ul class="navbar-nav mr-auto">
          <li class="nav-item flex-row-reverse">
            <router-link class="nav-link" to="/goal">New goal</router-link>
          </li>
        </ul>
        <ul class="navbar-nav">
          <li class="nav-item flex-row-reverse">
            <router-link class="nav-link" to="/profile">
              <img
                class="nav_profile_icon rounded-circle"
                v-bind:src="require('./img/profile_'+[user.user_name]+'.png')"
                alt="Profile"
              />
            </router-link>
          </li>
        </ul>
      </div>
    </nav>
    <router-view />
  </div>
</template>

<style>
/*--------------------GENERAL--------------------*/

.hovering:hover {
  color: #3d3d3d !important;
}

.muted {
  color: #808080;
}

/*--------------------NAVIGATION--------------------*/

nav {
  background-color: #e6e6e6;
}

.nav_profile_icon {
  height: 35px;
  width: 35px;
}

.nav_profile_icon:hover {
  height: 37px;
  width: 37px;
}

/*--------------------COLORS--------------------*/

/*Background colors*/

.bg-custom-blue-50 {
  background-color: #2e88d1;
}

.bg-custom-blue-60 {
  background-color: #58a0da;
}

.bg-custom-blue-70 {
  background-color: #82b7e3;
}

.bg-custom-purple-50 {
  background-color: #ad5284;
}

.bg-custom-purple-60 {
  background-color: #be749d;
}

.bg-custom-purple-70 {
  background-color: #ce97b5;
}

.bg-custom-orange-50 {
  background-color: #d1702e;
}

.bg-custom-orange-60 {
  background-color: #da8c58;
}

.bg-custom-orange-70 {
  background-color: #e3a982;
}

.bg-custom-green-50 {
  background-color: #47b874;
}

.bg-custom-green-60 {
  background-color: #6cc690;
}

.bg-custom-green-70 {
  background-color: #91d4ac;
}

.bg-custom-grey-50 {
  background-color: #808080;
}

.bg-custom-grey-60 {
  background-color: #999999;
}

.bg-custom-grey-70 {
  background-color: #b3b3b3;
}

/*Text colors*/

.txt-custom-blue-50 {
  color: #2e88d1;
}

.txt-custom-blue-60 {
  color: #58a0da;
}

.txt-custom-blue-70 {
  color: #82b7e3;
}

.txt-custom-purple-50 {
  color: #ad5284;
}

.txt-custom-purple-60 {
  color: #be749d;
}

.txt-custom-purple-70 {
  color: #ce97b5;
}

.txt-custom-orange-50 {
  color: #d1702e;
}

.txt-custom-orange-60 {
  color: #da8c58;
}

.txt-custom-orange-70 {
  color: #e3a982;
}

.txt-custom-green-50 {
  color: #47b874;
}

.txt-custom-green-60 {
  color: #6cc690;
}

.txt-custom-green-70 {
  color: #91d4ac;
}

.txt-custom-grey-50 {
  background-color: #808080;
}

.txt-custom-grey-60 {
  background-color: #999999;
}

.txt-custom-grey-70 {
  background-color: #b3b3b3;
}
</style>

<script>
import axios from "axios";
import { url, id} from "./assets/global.js";

export default {
  data() {
    return {
        user:{ user_name: 'Anaabanana'},
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
    },
  }
}
</script>
