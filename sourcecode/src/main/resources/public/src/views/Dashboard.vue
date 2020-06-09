<template>
  <div class="dashboard">
    <div class="container-fluid">
      <div class="row mb-3">
        <div class="col">
          <h3>Today</h3>
        </div>
        <div class="col muted d-flex justify-content-end pt-2">
          <div>
            <i class="fas fa-chevron-left hovering mr-1"></i>
            <p class="no-space hovering">
              <span>07.03</span>
            </p>
            <i class="fas fa-chevron-right hovering ml-1"></i>
            <i class="fas fa-calendar hovering ml-1"></i>
            <i class="fas fa-chevron-down hovering ml-4"></i>
          </div>
        </div>
      </div>
      
      <div class="row mb-3">
        <div class="col">
          <ul class="list-group">

            <div v-for="goal in goals" v-bind:key="goal.id">
              <goal-item v-bind:goal="goal"></goal-item>
            </div>

          </ul>
        </div>
      </div>
    </div>
    <statistics></statistics>

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

export default {
  name: "Dashboard",
  components: {
    GoalItem,
    Statistics,
  },
  data() {
    return {
      goals: [
        {id: 1, goalModal:"WaterModal", goalCategory: "Health & Food", goalTitle: "Drink 2l water", goalUnit: "l water", goalColor: "blue", goalCurrent:0.5, goalTarget: 2, inputSteps:0.5 },
        {id: 2, goalModal:"FruitModal", goalCategory: "Health & Food", goalTitle: "Eat 3 fruits", goalUnit: "Fruits", goalColor: "blue", goalCurrent:0, goalTarget: 3, inputSteps:1 },
        {id: 3, goalModal:"PagesModal", goalCategory: "Education", goalTitle: "Read 20 book pages", goalUnit: "Pages", goalColor: "purple", goalCurrent:15, goalTarget: 20, inputSteps:1 },
        {id: 4, goalModal:"SportModal", goalCategory: "Sports", goalTitle: "Go to the gym", goalUnit: "DONE", goalColor: "orange", goalCurrent:1, goalTarget: 1, inputSteps:1 },
      ]
    }
  }
};
</script>