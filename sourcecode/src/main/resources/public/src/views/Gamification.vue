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
          <img
            v-bind:src="require('../img/profile_'+[user.user_name]+'.png')"
            alt="Profile"
            class="img-score rounded-circle"
          />
        </div>
      </div>

      <div class="row mb-3">
        <div class="col d-flex justify-content-center muted">
          <div>
            <h4 class="no-space hovering font-weight-bold">
              {{user.total_score}}
              <i class="fas fa-share-alt hovering ml-1"></i>
            </h4>
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
            <li
              class="list-group-item list-group-item-action list-group-item-light mb-2 border rounded"
              v-for="award in awards"
              :key="award.id"
            >
              <award v-bind:award="award"></award>
            </li>
          </ul>
        </div>
      </div>
    </div>

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
import Ranking from "@/components/Ranking.vue";
import FriendTable from "@/components/FriendTable.vue";
import Award from "@/components/Award.vue";
import ChallengeModal from "@/components/ChallengeModal.vue";

import axios from "axios";
import { url, id, getColorByCategory } from "../assets/global.js";

export default {
  name: "Gamification",
  components: {
    Ranking,
    FriendTable,
    Award,
    ChallengeModal
  },
  data() {
    return {
      user: {},
      friends: [{}],
      goals: [{}],
      awards: [
        {
          id: 1,
          text: "Challenge win: Against ",
          points: 100,
          icon: require("@/img/100_points.png"),
          color: "purple",
          friendimg: require("../img/profile_PeaceDenise.png"),
          friend: "PeaceDenise"
        },
        {
          id: 2,
          text: "Streak 3x: Completed daily goals 3 times in a row",
          points: 200,
          icon: require("@/img/200_points.png"),
          color: "blue"
        },
        {
          id: 3,
          text: "Completed all goals for today (05.03.)",
          points: 100,
          icon: require("@/img/100_points.png"),
          color: "purple"
        },
        {
          id: 4,
          text: "Completed all goals for today (04.03.)",
          points: 100,
          icon: require("@/img/100_points.png"),
          color: "purple"
        },
        {
          id: 5,
          text: "Challenge win: Against ",
          points: 100,
          icon: require("@/img/100_points.png"),
          color: "purple",
          friendimg: require("../img/profile_ChrisTheBeast.png"),
          friend: "ChrisTheBeast"
        },
        {
          id: 6,
          text: "Completed goal: Eat 3 Fruits",
          points: 50,
          icon: require("@/img/50_points.png"),
          color: "orange"
        },
        {
          id: 7,
          text: "Completed goal: Drink 2l water",
          points: 50,
          icon: require("@/img/50_points.png"),
          color: "orange"
        }
      ]
    };
  },
  mounted() {
    this.getUserById();
    this.getFriendsByUserId();
    this.getGoalsByUserId();
  },

  methods: {
    getUserById() {
      axios
        .get(url + "/users?id=" + id)
        .then(response => {
          console.log(response.data);
          this.user = response.data;
        })
        .catch(error => {
          console.log(error);
        });
    },

    getFriendsByUserId() {
      axios
        .get(url + "/friends?userId=" + id)
        .then(response => {
          this.friends = response.data;
        })
        .catch(error => {
          console.log(error);
        });
    },

    getGoalsByUserId() {
      axios
        .get(url + "/goals?userId=" + id)
        .then(response => {
          this.goals = response.data;

          for (var i = 0; this.goals.length; i++) {
            this.goals[i].color = getColorByCategory(this.goals[i].category);
            this.goals[i].text = "txt-custom-" + this.goals[i].color + "-50";
            this.goals[i].bg50 = "bg-custom-" + this.goals[i].color + "-50";
            this.goals[i].bg70 = "bg-custom-" + this.goals[i].color + "-70";
          }
        })
        .catch(error => {
          console.log(error);
        });
    }
  }
};
</script>
