<template>
  <div
      class="modal fade"
      v-bind:id="[modalId]"
      tabindex="-1"
      role="dialog"
      aria-labelledby="Modal"
      aria-hidden="true"
    >
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5
              class="modal-title"
              v-bind:class="[textCustom50]"
              id="Modal"
            > {{goalCategory}}: {{goalTitle}}</h5>
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
                      >{{unit}}</span>
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
</template>

<script>
export default {
  props: ['modalId', 'goalCategory', 'goalTitle', 'unit', 'colorType', 'inputSteps'],
  data(){
    return{
      textCustom50: "txt-custom-"+this.colorType+"-50",
      backgroundCustom50: "bg-custom-"+this.colorType+"-50",
      backgroundCustom70: "bg-custom-"+this.colorType+"-70",

      valCounter: 1.0,
      inputStep: parseFloat(this.inputSteps),
    }
  },

  mounted() {
  },
  
  methods: {
    submitProgress(){
      alert("you submitted " + this.valCounter + " progress to your goal");
      //need to POST /change Progress Value from goal in DB!
    },
    inputPlus(){
      this.valCounter += this.inputStep;
    },
    inputMinus(){
      if(this.valCounter > this.inputStep){
        this.valCounter -= this.inputStep;
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