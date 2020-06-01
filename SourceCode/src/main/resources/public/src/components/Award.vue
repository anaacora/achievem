<template>
    <div class="d-flex justify-content-between align-items-center">
        <div>
            <span>{{award.text}}</span>
            <img v-if="award.friend!=null" v-bind:src="[award.friendimg]" class="img-awards-profile rounded-circle">
            <span v-if="award.friend!=null">{{award.friend}}</span>
            <p 
                class=" m-0"
                v-bind:class="[textCustom50]"
                >
                + {{award.points}}
            </p>
        </div>
        <div>
            <img v-bind:src="[award.icon]" alt="Award" class="img-awards">
        </div>
    </div>
</template>

<script>
export default {
  props: ['award'],
  data(){
    return{
      textCustom50: "txt-custom-"+this.award.color+"-50",
    }
  },

  mounted() {
  },
  
  methods: {
  },
}
</script>

<style scoped>
.img-awards-profile {
    height: 25px;
    width: 25px;
}

.img-awards {
    height: 75px;
    width: 75px;
}
</style>