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
            
            <!-- dat klappt nisch -->
            <div v-for="goal in goals" v-bind:key="goal.id">
              <goal v-bind:goal="goal"></goal>
            </div>

            <!-- hier ist der temo ersatz -->
            <!-- <goal v-bind:goalprop="goals[0]"></goal>
            <goal v-bind:goalprop="goals[1]"></goal>
            <goal v-bind:goalprop="goals[2]"></goal>
            <goal v-bind:goalprop="goals[3]"></goal> -->

          </ul>
        </div>
      </div>
    </div>
    <statistics></statistics>

    <!-- Modals -->
    <add-progress modal-id="ModalWater" goal-category="Health & Food" goal-title="Drink 2l water" unit="l water" color-type="blue" input-steps="0.5"></add-progress>

    <add-progress modal-id="ModalFruit" goal-category="Health & Food" goal-title="Eat 3 fruits" unit="fruits" color-type="blue" input-steps="1"></add-progress>

    <add-progress modal-id="ModalPages" goal-category="Education" goal-title="Read 20 book pages" unit="Pages" color-type="purple" input-steps="1"></add-progress>

    <!-- not shown because task already completed -->
    <!-- <div class="modal fade" id="ModalGym" tabindex="-1" role="dialog" aria-labelledby="MLabelGym" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="MLabelGym">Go to the gym</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col">
                            <div>
                                <button type="button" class="btn btn-block btn-success">Done it</button>
                            </div>
                        </div>
                        <div class="col">
                            <div>
                                <button type="button" class="btn btn-block btn-danger">Not done</button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-dark toast-sport-show" data-dismiss="modal">Add</button>
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>-->

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

    <!--<script src="js/statistic_chart.js"></script>-->
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

import Goal from "@/components/Goal.vue";
import AddProgress from "@/components/AddProgress.vue";
import Statistics from "@/components/Statistics.vue";

export default {
  name: "Dashboard",
  components: {
    Goal,
    AddProgress,
    Statistics,
  },
  goals: [
    {id: 1, goalId: "ModalWater", goalCategory: "Health & Food", goalTitle: "Drink 2l water", goalUnit: "l water", goalColor: "blue", goalCurrent:"0.5", goalTarget: "2" },
    {id: 2, goalId: "ModalFruit", goalCategory: "Health & Food", goalTitle: "Eat 3 fruits", goalUnit: "Fruits", goalColor: "blue", goalCurrent:"0", goalTarget: "3" },
    {id: 3, goalId: "ModalPages", goalCategory: "Education", goalTitle: "Read 20 book pages", goalUnit: "Pages", goalColor: "purple", goalCurrent:"15", goalTarget: "20" },
    {id: 4, goalId: "ModalGym", goalCategory: "Sports", goalTitle: "Go to the gym", goalUnit: "DONE", goalColor: "orange", goalCurrent:"1", goalTarget: "1" },
  ]
};
</script>