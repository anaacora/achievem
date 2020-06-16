<template>
  <div class="dashboard">
    <div class="container-fluid">
      <div class="row mb-3">
        <div class="col">
          <h3>Today</h3>
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

    <!-- Toasts -->
    <div aria-live="polite" aria-atomic="true">
      <div
        id="toast-health"
        class="toast position-absolute"
        role="alert"
        aria-live="assertive"
        aria-atomic="true"
        data-delay="5000"
      >
        <div class="toast-header">
          <strong class="mr-auto">YOU ACHIEVED'EM!</strong>
          <small class="text-muted">just now</small>
          <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="toast-body">
          You achieved a goal in
          <span class="txt-custom-blue-50">Health & Food</span> !!!
          <span class="fas fa-laugh-beam"></span>
        </div>
      </div>
    </div>
    <div aria-live="polite" aria-atomic="true">
      <div
        id="toast-edu"
        class="toast position-absolute"
        role="alert"
        aria-live="assertive"
        aria-atomic="true"
        data-delay="5000"
      >
        <div class="toast-header">
          <strong class="mr-auto">YOU ACHIEVED'EM!</strong>
          <small class="text-muted">just now</small>
          <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="toast-body">
          You achieved a goal in
          <span class="txt-custom-purple-50">Education</span> !!!
          <span class="fas fa-laugh-beam"></span>
        </div>
      </div>
    </div>
    <div aria-live="polite" aria-atomic="true">
      <div
        id="toast-sport"
        class="toast position-absolute"
        role="alert"
        aria-live="assertive"
        aria-atomic="true"
        data-delay="5000"
      >
        <div class="toast-header">
          <strong class="mr-auto">YOU ACHIEVED'EM!</strong>
          <small class="text-muted">just now</small>
          <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="toast-body">
          You achieved a goal in
          <span class="txt-custom-orange-50">Sports</span> !!!
          <span class="fas fa-laugh-beam"></span>
        </div>
      </div>
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

.toast {
  background-color: rgba(255, 255, 255, 0.95);
  z-index: 999;
  right: 25%;
  top: 71px;
  /* position: absolute;
	width: 100%;
	height: 100%;
	display: none; */
}
</style>

<script>
// @ is an alias to /src
import GoalItem from "@/components/GoalItem.vue";
import Statistics from "@/components/Statistics.vue";

import { getUserId } from "../assets/auth.js";

import axios from "axios";

export default {
  name: "Dashboard",
  components: {
    GoalItem,
    Statistics
  },
  data() {
    return {
      goals: [
        {
          id: 1,
          modal: "WaterModal",
          category: "Health & Food",
          title: "Drink 2l water",
          unit: "l water",
          color: "blue",
          current: 0.5,
          target: 2,
          inputSteps: 0.5,
          progressData: [20, 50, 50, 80, 70, 100, 33]
        },
        {
          id: 2,
          modal: "FruitModal",
          category: "Health & Food",
          title: "Eat 3 fruits",
          unit: "Fruits",
          color: "blue",
          current: 0,
          target: 3,
          inputSteps: 1,
          progressData: [75, 50, 20, 10, 50, 80, 0]
        },
        {
          id: 3,
          modal: "PagesModal",
          category: "Education",
          title: "Read 20 book pages",
          unit: "Pages",
          color: "purple",
          current: 15,
          target: 20,
          inputSteps: 1,
          progressData: [20, 80, 50, 100, 70, 100, 60]
        },
        {
          id: 4,
          modal: "SportModal",
          category: "Sports",
          title: "Go to the gym",
          unit: "time",
          color: "orange",
          current: 1,
          target: 1,
          inputSteps: 1,
          progressData: [0, 100, 100, 0, 100, 100, 100]
        }
      ],

      // Here comes good data
      id: 1,
      user: null,
      userGoals: null
    };
  },

  mounted() {
    this.user = getUserId(this.id);
    this.userGoals = this.getGoalsFromUser(this.user);
    this.chartData = this.getChartDatabyGoalId(this.userGoals[0].id);
  },

  methods: {
    getGoalsFromUser(userId) {
      axios
        .get("/api/goals/userId=" + userId)
        .then(response => {
          console.log(response.data);
          return response.data;
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