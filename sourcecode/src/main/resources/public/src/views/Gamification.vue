<template>
  <div class="gamification">
    <div class="container-fluid">

        <div class="row mb-3">
            <div class="col d-flex justify-content-center">
                <h3>Your Points</h3>
            </div>
        </div>

        <div class="row mb-3">
            <div class="col d-flex justify-content-center muted">
                <img v-bind:src="require('../img/profile_'+[user.user_name]+'.png')"
                alt="Profile" class="img-score rounded-circle">
            </div>
        </div>

        <div class="row mb-3">
            <div class="col d-flex justify-content-center muted">
                <div>
                    <h4 class="no-space hovering font-weight-bold">{{user.total_score}}<i class="fas fa-share-alt hovering ml-1"></i></h4>
                </div>
            </div>
        </div>

        <div class="row mb-3">

            <ranking v-bind:user="user"></ranking>
            <friend-table v-bind:user="user" v-bind:friends="friends"></friend-table>

            
        </div>
        <div class="row mb-3">
            <div class="col">
                <ul class="list-group">

                    <li class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded" v-for="award in awards" :key="award.id">
                        <award v-bind:award="award"></award>
                    </li>

                </ul>
            </div>
        </div>
    </div>


    <!-- Modals -->
    <challenge-modal v-bind:goals="goals" v-bind:friends="friends"></challenge-modal>

  </div>
</template>

<style scoped>
.img-score {
    height: 150px;
    width: 150px;
}


.img-awards-profile {
    height: 25px;
    width: 25px;
}

.img-awards {
    height: 75px;
    width: 75px;
}
</style>

<script>
// @ is an alias to /src
import Ranking from '@/components/Ranking.vue'
import FriendTable from '@/components/FriendTable.vue'
import Award from '@/components/Award.vue'
import ChallengeModal from '@/components/ChallengeModal.vue'

import axios from "axios";
import { url, id, getColorByCategory} from "../assets/global.js";

export default {
  name: 'Gamification',
  components: {
     Ranking,
     FriendTable,
     Award,
     ChallengeModal,
  },
  data() {
    return {
        user:{},
        friends:[{}],
        goals:[{}],

        // user:{
        //     name:"Anaa", totalScore: 1400, level: 9, LevelScore:100, nextLevel:450, profile: require("@/img/profile_Anaabanana.png")
        // },
        // friends:[
        //     {id:1, user_name:"PeaceDenise", total_score: 1250, level: 9},//, profile: require("@/img/profile_denise.png")
        //     {id:2, user_name:"ChrisTheBeast", total_score: 1000, level: 8},//, profile: require("@/img/profile_christian.png")
        //     {id:3, user_name:"SilvanSuperman", total_score: 700, level: 6},//, profile: require("@/img/profile_silvan.png")
            
        // ],
        awards:[
            {id:1, text:"Challenge win: Against ", points: 100, icon:require("@/img/100_points.png"), color: "purple", friendimg:require('../img/profile_PeaceDenise.png'), friend: "PeaceDenise" },
            {id:2, text:"Streak 3x: Completed daily goals 3 times in a row", points: 200, icon:require("@/img/200_points.png"), color: "blue"},
            {id:3, text:"Completed all goals for today (05.03.)", points: 100, icon:require("@/img/100_points.png"), color: "purple"},
            {id:4, text:"Completed all goals for today (04.03.)", points: 100, icon:require("@/img/100_points.png"), color: "purple"},
            {id:5, text:"Challenge win: Against ", points: 100, icon:require("@/img/100_points.png"), color: "purple", friendimg:require('../img/profile_ChrisTheBeast.png'), friend: "ChrisTheBeast" },
            {id:6, text:"Completed goal: Eat 3 Fruits", points: 50, icon:require("@/img/50_points.png"), color: "orange"},
            {id:7, text:"Completed goal: Drink 2l water", points: 50, icon:require("@/img/50_points.png"), color: "orange"},
        ],
    //     goals: [
    //     {id: 1, goalModal:"WaterModal", goalCategory: "Health & Food", goalTitle: "Drink 2l water", goalUnit: "l water", goalColor: "blue", goalCurrent:0.5, goalTarget: 2, inputSteps:0.5 },
    //     {id: 2, goalModal:"FruitModal", goalCategory: "Health & Food", goalTitle: "Eat 3 fruits", goalUnit: "Fruits", goalColor: "blue", goalCurrent:0, goalTarget: 3, inputSteps:1 },
    //     {id: 3, goalModal:"PagesModal", goalCategory: "Education", goalTitle: "Read 20 book pages", goalUnit: "Pages", goalColor: "purple", goalCurrent:15, goalTarget: 20, inputSteps:1 },
    //     {id: 4, goalModal:"SportModal", goalCategory: "Sports", goalTitle: "Go to the gym", goalUnit: "DONE", goalColor: "orange", goalCurrent:1, goalTarget: 1, inputSteps:1 },
    //   ]
    }
  },
  mounted () {
    this.getUserById();

    this.getFriendsByUserId();   
    this.getGoalsByUserId(); 
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

    getFriendsByUserId(){
      axios.get(url + '/friends?userId='+id)
        .then((response)=>{
          // handle success
          // console.log(response.data);
          this.friends = response.data;
        })
        .catch((error)=>{
          // handle error
          console.log(error);
        })
    },

    getGoalsByUserId(){
      axios.get(url + '/goals?userId='+id)
        .then((response)=>{
          // handle success
          // console.log(response.data);
          this.goals = response.data;

          for (var i=0; this.goals.length; i++){
              // set styling
                this.goals[i].color = getColorByCategory(this.goals[i].category);
                this.goals[i].text = "txt-custom-" + this.goals[i].color + "-50";
                this.goals[i].bg50 = "bg-custom-" + this.goals[i].color + "-50";
                this.goals[i].bg70 = "bg-custom-" + this.goals[i].color + "-70";
          }
        })
        .catch((error)=>{
          // handle error
          console.log(error);
        })
    },
  }
}
</script>
