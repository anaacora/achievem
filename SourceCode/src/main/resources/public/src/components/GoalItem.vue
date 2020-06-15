<template>
  <div>
    <li
      class="list-group-item list-group-item-action list-group-item-light"
      data-toggle="modal"
      v-bind:data-target="'#'+[goal.modal]"
    >
      <div class="d-flex justify-content-between">
        <div class="col-4 p-0">
          <span>{{goal.title}}</span>
        </div>
        <div class="col-4 text-center p-0">
          <span v-bind:class="[textCustom50]">{{goal.category}}</span>
        </div>
        <div class="col-4 text-right p-0">
          <span
            class="badge badge-pill"
            v-bind:class="[backgroundCustom50]"
          >{{goal.current}}/{{goal.target}} {{goal.unit}}</span>
        </div>
      </div>
      <div class="progress">
        <div
          class="progress-bar"
          v-bind:class=" [backgroundCustom50]"
          role="progressbar"
          v-bind:style="'width: '+[valNow]+'%'"
          v-bind:aria-valuenow="[valNow]"
          aria-valuemin="0"
          aria-valuemax="100"
        />
        <div
          class="progress-bar"
          v-bind:class=" [backgroundCustom70]"
          role="progressbar"
          v-bind:style="'width: '+[valOpen]+'%'"
          v-bind:aria-valuenow="[valOpen]"
          aria-valuemin="0"
          aria-valuemax="100"
        />
      </div>
    </li>

    <edit-progress v-bind:goal="goal" v-on:childToParent="onChildClick"></edit-progress>
  </div>
</template>

<script>
// @ is an alias to /src
import EditProgress from "@/components/EditProgressModal.vue";

export default {
  components: {
    EditProgress
  },
  props: ["goal"],
  data() {
    return {
      textCustom50: "txt-custom-" + this.goal.color + "-50",
      backgroundCustom50: "bg-custom-" + this.goal.color + "-50",
      backgroundCustom70: "bg-custom-" + this.goal.color + "-70",
      valNow: 0,
      valOpen: 0
    };
  },
  mounted() {   
    this.initProgressbar(); 
  },
  methods: {
    onChildClick() {
      this.updateProgressbar();
    },
    updateProgressbar() {
      this.initProgressbar();
      this.goal.progressData[(this.goal.progressData.length-1)] = this.valNow;
      this.$emit('childToParent', this.goal);
    },
    initProgressbar(){
      this.valNow = (this.goal.current / this.goal.target) * 100;
      this.valOpen = 100 - (this.goal.current / this.goal.target) * 100;    
    }
  }
};
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