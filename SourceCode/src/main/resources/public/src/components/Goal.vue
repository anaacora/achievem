<template>
  <li
	class="list-group-item list-group-item-action list-group-item-light"
	data-toggle="modal"
	data-target="#ModalWater"
	>
    <div class="d-flex justify-content-between">
      <div class="col-4 p-0">
      <span>Drink 2l water</span>
      </div>
      <div class="col-4 text-center p-0">
      <span class="txt-custom-blue-50">Health & Food</span>
      </div>
      <div class="col-4 text-right p-0">
      <span class="badge bg-custom-blue-50 badge-pill">0.5l / 2l</span>
      </div>
    </div>
    <div class="progress">
      <div
      class="progress-bar bg-custom-blue-50"
      role="progressbar"
      style="width: 25%"
      aria-valuenow="25"
      aria-valuemin="0"
      aria-valuemax="100"
      ></div>
      <div
      class="progress-bar bg-custom-blue-70"
      role="progressbar"
      style="width: 75%"
      aria-valuenow="75"
      aria-valuemin="0"
      aria-valuemax="100"
      ></div>
    </div>
  </li>
</template>

<script>
export default {
  props: ['goal'],
  data(){
    return{
      // goal: null,
      // goals: [
      //   {id: 1, goalId: "ModalWater", goalCategory: "Health & Food", goalTitle: "Drink 2l water", goalUnit: "l water", goalColor: "blue", goalCurrent:"0.5", goalTarget: "2" },
      //   {id: 2, goalId: "ModalFruit", goalCategory: "Health & Food", goalTitle: "Eat 3 fruits", goalUnit: "Fruits", goalColor: "blue", goalCurrent:"0", goalTarget: "3" },
      //   {id: 3, goalId: "ModalPages", goalCategory: "Education", goalTitle: "Read 20 book pages", goalUnit: "Pages", goalColor: "purple", goalCurrent:"15", goalTarget: "20" },
      //   {id: 4, goalId: "ModalGym", goalCategory: "Sports", goalTitle: "Go to the gym", goalUnit: "DONE", goalColor: "orange", goalCurrent:"1", goalTarget: "1" },
      // ],
    }
  },

  mounted() {
  },
  
  methods: {
  }
}
</script>

<style scoped>
.progress {
  height: 5px;
  margin-top: 5px;
}

.badge-pill {
  color: white;
}
</style>