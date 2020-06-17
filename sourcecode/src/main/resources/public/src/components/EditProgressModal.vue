<template>
  <div>
    <div
      class="modal fade"
      v-bind:id="[goal.modal]"
      tabindex="-1"
      role="dialog"
      v-bind:aria-labelledby="[goal.modal]"
      aria-hidden="true"
    >
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5
              class="modal-title"
              v-bind:class="[goal.text]"
              v-bind:id="[goal.modal]"
            >{{goal.category}}: {{goal.name}}</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            <div class="row">
              <div class="col">
                <div class="form-group">
                  <label for="counterInput">Set progress of your goal:</label>

                  <div class="input-group">
                    <div class="input-group-prepend">
                      <button
                        class="btn btn-sm"
                        v-bind:class=" [goal.bg50]"
                        id="minus-btn"
                        v-on:click="inputMinus"
                        :disabled="minusButtonDisabled"
                      >
                        <i class="fa fa-minus text-white"></i>
                      </button>
                    </div>

                    <input
                      type="number"
                      step="0.5"
                      readonly
                      class="form-control text-center bg-transparent"
                      id="counterInput"
                      aria-label="counterLabelAppend"
                      aria-describedby="counter"
                      v-model="this.valCounter"
                    />

                    <div class="input-group-prepend">
                      <button
                        class="btn btn-sm"
                        v-bind:class=" [goal.bg50]"
                        id="plus-btn"
                        v-on:click="inputPlus"
                        :disabled="plusButtonDisabled"
                      >
                        <i class="fa fa-plus text-white"></i>
                      </button>
                    </div>

                    <div class="input-group-append">
                      <span
                        class="input-group-text pl-4"
                        id="counterLabelAppend"
                      >{{goal.unit}}</span>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="modal-footer">
            <button
              type="button"
              class="btn text-white toast-health-show"
              v-bind:class=" [goal.bg50]"
              v-on:click="submitProgress"
              data-dismiss="modal"
            >Set</button>
            <button
              type="button"
              class="btn btn-secondary"
              data-dismiss="modal"
            >Close</button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: ["goal"],
  data() {
    return {
      valCounter: this.goal.current,
      minusButtonDisabled: (this.goal.current < 0),
      plusButtonDisabled: (this.goal.current > this.goal.target)
    };
  },

  mounted() {
  },

  methods: {
    submitProgress() {
      alert("you submitted " + this.valCounter + " progress to your goal");
      //need to POST /change Progress Value from goal in DB!
      //show toast
      this.goal.current = this.valCounter;
      this.$emit("childToParent", this.goal);
    },
    inputPlus() {
      if (this.valCounter < this.goal.target) {
        this.valCounter += this.goal.inputSteps;
        this.minusButtonDisabled = false;
        if (this.valCounter === this.goal.target) {
          this.plusButtonDisabled = true;
        }
      } else {
        this.plusButtonDisabled = true;
      }
    },
    inputMinus() {
      if (this.valCounter > 0) {
        this.valCounter -= this.goal.inputSteps;
        this.plusButtonDisabled = false;
        if (this.valCounter === 0) {
          this.minusButtonDisabled = true;
        }
      } else {
        this.minusButtonDisabled = true;
      }
    }
  }
};
</script>

<style scoped>
/* Chrome, Safari, Edge, Opera */
input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

/* Firefox */
input[type="number"] {
  -moz-appearance: textfield;
}
</style>