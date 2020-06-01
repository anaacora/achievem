<template>
  <div>
    <div
        class="modal fade"
        v-bind:id="[goal.goalModal]"
        tabindex="-1"
        role="dialog"
        v-bind:aria-labelledby="[goal.goalModal]"
        aria-hidden="true"
      >
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <h5
                class="modal-title"
                v-bind:class="[textCustom50]"
                v-bind:id="[goal.goalModal]"
              > {{goal.goalCategory}}: {{goal.goalTitle}}</h5>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
              <div class="row">
                <div class="col">
                  <div class="form-group">
                    <label for="counterInput">Add progress to your goal!</label>
                    
                    
                    <div class="input-group">
                      <div class="input-group-prepend">
                        <button 
                          class="btn btn-sm" 
                          v-bind:class=" [backgroundCustom50]" 
                          id="minus-btn" 
                          v-on:click="inputMinus">
                          <i class="fa fa-minus text-white"></i>
                        </button>
                      </div>

                      <input
                        type="number"
                        step="0.5"
                        class="form-control text-center"
                        id="counterInput"
                        aria-label="counterLabelAppend"
                        aria-describedby="counter"
                        v-model="valCounter"/>

                      <div class="input-group-prepend">
                        <button 
                          class="btn btn-sm" 
                          v-bind:class=" [backgroundCustom50]" 
                          id="plus-btn" 
                          v-on:click="inputPlus" >
                          <i class="fa fa-plus text-white"></i>
                        </button>
                      </div>

                      <div class="input-group-append">
                        <span
                          class="input-group-text text-white pl-4"
                          v-bind:class=" [backgroundCustom70]"
                          id="counterLabelAppend"
                        >{{goal.goalUnit}}</span>
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
                v-bind:class=" [backgroundCustom50]"
                v-on:click="submitProgress"
                data-dismiss="modal"
              >Add</button>
              <button
                type="button"
                class="btn text-white"
                v-bind:class=" [backgroundCustom70]"
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
  props: ['goal'],
  data(){
    return{
      textCustom50: "txt-custom-"+this.goal.goalColor+"-50",
      backgroundCustom50: "bg-custom-"+this.goal.goalColor+"-50",
      backgroundCustom70: "bg-custom-"+this.goal.goalColor+"-70",

      valCounter: 1.0,
    }
  },

  mounted() {
    // this.dostartup();
  },
  
  methods: {
    dostartup(){
      alert("started" + this.goal.goalColor);

    },
    submitProgress(){
      alert("you submitted " + this.valCounter + " progress to your goal");
      //need to POST /change Progress Value from goal in DB!
      //show toast
    },
    inputPlus(){
      this.valCounter += this.goal.inputSteps;
    },
    inputMinus(){
      if(this.valCounter > this.goal.inputSteps){
        this.valCounter -= this.goal.inputSteps;
      }
    },
  }
}
</script>

<style scoped>
/* Chrome, Safari, Edge, Opera */
input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

/* Firefox */
input[type=number] {
  -moz-appearance: textfield;
}
</style>