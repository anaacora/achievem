<template>
  <div class="dashboard">
    <div class="container-fluid">
      <div class="row mb-3">
        <div class="col">
          <h3>Here are your goals for today, {{user.user_name}}</h3>
        </div>
        <div class="col muted d-flex justify-content-end pt-2">
          <div>
            <i class="fas fa-chevron-left hovering"></i>
            <span class="no-space hovering ml-2 mr-1">07.03</span>
            <i class="fas fa-chevron-right hovering ml-1"></i>
            <i class="fas fa-calendar hovering ml-2"></i>
            <i class="fas fa-chevron-down hovering ml-3"></i>
          </div>
        </div>
      </div>

      <div class="row mb-3">
        <div class="col">
          <ul class="list-group">
            <div v-for="goal in goals" v-bind:key="goal.id">
              <goal-item v-on:childToParent="onChildClick" v-bind:goal="goal"></goal-item>
            </div>
          </ul>
        </div>
      </div>
      <statistics v-bind:goals="goals" ref="stat"></statistics>
    </div>
  </div>
</template>

<style scoped>
.no-space {
  padding: 0px;
  margin: 0px;
  display: inline;
}

.statistic {
  height: 350px;
  width: 450px;
}
</style>

<script>
import GoalItem from "@/components/GoalItem.vue";
import Statistics from "@/components/Statistics.vue";

import { url, id } from "../assets/global.js";
import axios from "axios";

export default {
  name: "Dashboard",
  components: {
    GoalItem,
    Statistics
  },
  data: function() {
    return {
      user: { user_name: "Anaabanana" },
      goals: [{}]
    };
  },

  mounted() {
    this.getUserById();
    this.getGoalsByUserId();
  },

  methods: {
    getUserById() {
      axios
        .get(url + "/users?id=" + id)
        .then(response => {
          this.user = response.data;
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
        })
        .catch(error => {
          console.log(error);
        });
    },

    onChildClick(updatedGoal) {
      this.goals.forEach(g => {
        if (g.id === updatedGoal.id) {
          g.progressData = updatedGoal.progressData;
        }
      });
      this.$refs.stat.updateChart();
    }
  }
};
</script>