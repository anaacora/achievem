<template>
  <div class="col border text-center ml-3 mr-2 rounded align-middle">
    <h5 class="font-weight-bold mt-5">
      <span>Level</span>
    </h5>
    <h2 class="font-weight-bold">
      <span>{{user.level}}</span>
    </h2>
    <div class="progress">
      <div
        class="progress-bar bg-custom-grey-50"
        role="progressbar"
        v-bind:style="'width: '+[valNow]+'%'"
        v-bind:aria-valuenow="[valNow]"
        aria-valuemin="0"
        aria-valuemax="100"
      />
      <div
        class="progress-bar bg-custom-grey-70"
        role="progressbar"
        style="width: 100%"
        aria-valuenow="100"
        aria-valuemin="0"
        aria-valuemax="100"
      ></div>
    </div>
    <p class="mt-2">Next level in {{user.next_level}} points</p>
  </div>
</template>

<script>
export default {
  props: ["user"],
  data() {
    return {
      valNow: 0,
    };
  },

  beforeUpdate(){
    this.initProgressbar();
  },

  methods: {
    initProgressbar() {
      this.valNow = (this.user.level_score / (this.user.level_score + this.user.next_level)) * 100
    }
  }
};
</script>